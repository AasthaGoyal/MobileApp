package com.example.mtspm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CustomerActivity extends AppCompatActivity {
    Button mButtonAddPhoto;
    EditText mTextUserName;
    EditText mTextDescription;
    Button mButtonSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        mButtonAddPhoto=(Button)findViewById(R.id.Button_Add_Photo);
        mTextUserName = (EditText) findViewById(R.id.EditText_User_Name);
        mTextDescription=(EditText) findViewById(R.id.EditText_Description);
        mButtonSubmit=(Button)findViewById(R.id.Button_Submit);


            }
}
