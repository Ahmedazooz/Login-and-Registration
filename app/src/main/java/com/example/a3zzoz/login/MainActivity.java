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

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText name,pass;
    Button login;
    Context context;
    TextView Regist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.etname);
        pass=(EditText)findViewById(R.id.etpass);
        login=(Button)findViewById(R.id.loginbu);
        Regist=(TextView) findViewById(R.id.Reg);
        context=this;

        login.setOnClickListener(this);
        Regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Register.class));
            }
        });

    }

    @Override
    public void onClick(View view) {
        if(name.getText().toString().trim().isEmpty()||pass.getText().toString().trim().isEmpty())
        {
            Toast.makeText(context,"You must enter your name and password",Toast.LENGTH_SHORT).show();
        }
        else{
            String v1=getIntent().getStringExtra("name");
            String v2=getIntent().getStringExtra("pass");
            if(v1.isEmpty()||v2.isEmpty())
            {
                Toast.makeText(context,"You must Register",Toast.LENGTH_SHORT).show();
            }
            if (v1.equals(name.getText().toString()) && v2.equals(pass.getText().toString()))
            {
                Toast.makeText(context,"Login successfully",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),HomePage.class));
            }
            else
            {
                Toast.makeText(context,"Login Faild",Toast.LENGTH_SHORT).show();
            }

        }
    }


}
