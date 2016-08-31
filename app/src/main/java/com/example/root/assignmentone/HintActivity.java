package com.example.root.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HintActivity extends AppCompatActivity {


    private int randomNumber;
    private String randNum;
    private TextView hinttext;
    private TextView numbertext;

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



        numbertext = (TextView) findViewById(R.id.TextView_randomNumberhint);
        numbertext.setText(randNum);

        hinttext = (TextView) findViewById(R.id.HintTextView);
        double d = Math.floor(Math.sqrt(randomNumber));
        String text = "Divide until "+d;
        hinttext.setText(text);



    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            setResult(RESULT_OK);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
