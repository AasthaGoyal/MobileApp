package com.example.mtspm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdminActivity extends AppCompatActivity {
    EditText mTextPropertyId;
    EditText mTextAddress;
    EditText mTextPropertyType;
    Button mButtonSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        mTextPropertyId=(EditText)findViewById(R.id.EditText_Property_Id);
        mTextAddress=(EditText) findViewById(R.id.EditText_Address);
        mTextPropertyType=(EditText)findViewById(R.id.EditText_Address);
        mButtonSubmit=(Button)findViewById(R.id.Button_Submit);
        mButtonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ButtonIntent = new Intent(AdminActivity.this, AdminActivity.class);
                startActivity(ButtonIntent);
            }

            });
    }

}