package com.example.mtspm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    EditText mTextUsername;
    EditText mTextPassword;
    EditText mTextConfirmPassword;
    Button mButtonRegister;
    TextView mTextViewLogin;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mTextUsername=(EditText)findViewById(R.id.EditText_Username);
        mTextPassword=(EditText)findViewById(R.id.EditText_Password);
        mTextConfirmPassword=(EditText)findViewById(R.id.EditText_Confirm_Password);
        mButtonRegister=(Button)findViewById(R.id.Button_Register);

        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent= new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(LoginIntent);
            }
        });
    }
}
