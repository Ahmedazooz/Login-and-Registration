package com.example.a3zzoz.login;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity implements View.OnClickListener{
    EditText name,pass;
    Button Regist;
    Button Back;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=(EditText)findViewById(R.id.etname);
        pass=(EditText)findViewById(R.id.etpass);
        Regist=(Button)findViewById(R.id.Registbu);
        Back=(Button) findViewById(R.id.Back);
        context=this;
    }

    @Override
    public void onClick(View view) {

        if(name.getText().toString().trim().isEmpty()||pass.getText().toString().trim().isEmpty())
        {
            Toast.makeText(context,"You must enter your name and password",Toast.LENGTH_SHORT).show();
        }
        else{
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            i.putExtra("name",name.getText().toString());
            i.putExtra("pass",pass.getText().toString());
            startActivity(i);
        }

    }

    public void onClickback(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}
