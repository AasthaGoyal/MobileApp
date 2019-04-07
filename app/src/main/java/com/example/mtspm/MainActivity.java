    package com.example.mtspm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity<Public> extends AppCompatActivity {
    EditText mTextUsername;
    EditText mTextPassword;
    Button mButtonLogin;
    TextView mTextViewRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextUsername=(EditText)findViewById(R.id.EditText_Username);
        mTextPassword=(EditText)findViewById(R.id.EditText_Password);
        mButtonLogin=(Button)findViewById(R.id.button_Login);
        mTextViewRegister=(TextView)findViewById(R.id.TextView_Register);
        mTextViewRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent (MainActivity.this,RegisterActivity.class);
                startActivity (registerIntent);


            }
        });



        }

    }

