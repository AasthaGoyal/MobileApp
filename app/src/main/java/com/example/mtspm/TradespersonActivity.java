package com.example.mtspm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class TradespersonActivity extends AppCompatActivity {
    Button mButtonViewIssue;
    Button mButtonAddSolvedIssuePhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tradesperson);
        mButtonViewIssue=(Button)findViewById(R.id.Button_View_Issue);
        mButtonAddSolvedIssuePhoto=(Button)findViewById(R.id.Button_Add_Solved_Issue_Photo);
    }
}
