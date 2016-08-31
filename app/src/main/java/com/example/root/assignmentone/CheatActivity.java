package com.example.root.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CheatActivity extends AppCompatActivity {

    private int randomNumber;
    private String randNum;
    private TextView cheattext;
    private TextView numbertext;

    public boolean isPrime(){

        for(int i = 2 ; i <= Math.sqrt(randomNumber); i++){
            if(randomNumber % i == 0)
                return false;
        }
        return true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cheattext = (TextView) findViewById(R.id.CheatTextView);
        numbertext = (TextView) findViewById(R.id.TextView_randomNumbercheat);


        Intent intent = getIntent();
        randNum = intent.getStringExtra("RandomNumber");
        randomNumber = Integer.parseInt(randNum);

        numbertext.setText(randNum);

        if(isPrime()){
            cheattext.setText(R.string.text_cheat_yes);
        }
        else{
            cheattext.setText(R.string.text_cheat_no);
        }

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
