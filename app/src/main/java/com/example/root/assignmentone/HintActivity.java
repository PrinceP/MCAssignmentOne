package com.example.root.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HintActivity extends AppCompatActivity {


    private int randomNumber;
    private String randNum;
    private TextView hinttext;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hint);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Intent intent = getIntent();
        randNum = intent.getStringExtra("RandomNumber");
        randomNumber = Integer.parseInt(randNum);


        hinttext = (TextView) findViewById(R.id.HintTextView);
        double d = Math.ceil(Math.sqrt(randomNumber));
        String text = "Check your division until "+d+" for "+randNum;
        hinttext.setText(text);



    }

}
