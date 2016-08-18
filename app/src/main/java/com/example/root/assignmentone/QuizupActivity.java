package com.example.root.assignmentone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class QuizupActivity extends AppCompatActivity {


    private Button yesButton;
    private Button noButton;
    private Button nextButton;
    private TextView randomNumber_TextView;

    private int randomNumber;
    private String displayNumber;

    private RetainedFragment dataFragment;

    public void setupQuestion(){
        Random r = new Random();
        randomNumber = r.nextInt(999) + 1;
        displayNumber = "" + randomNumber + "" ;
        randomNumber_TextView = (TextView) findViewById(R.id.TextView_randomNumber);
        randomNumber_TextView.setText(displayNumber);
    }

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
        setContentView(R.layout.activity_quizup);

        setupQuestion();



        yesButton = (Button)findViewById(R.id.yesButton);
        noButton = (Button)findViewById(R.id.noButton);
        nextButton = (Button)findViewById(R.id.nexButton);


        yesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (isPrime()) {
                    Toast t1 = Toast.makeText(QuizupActivity.this, R.string.Correct_Toast, Toast.LENGTH_SHORT);
                    t1.setGravity(Gravity.CENTER,0,200);
                    t1.show();
                    yesButton.setEnabled(false);
                } else {
                    Toast t2 = Toast.makeText(QuizupActivity.this, R.string.Incorrect_Toast, Toast.LENGTH_SHORT);
                    t2.setGravity(Gravity.CENTER,0,200);
                    t2.show();
                    yesButton.setEnabled(false);
                }
            }
        });

        noButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (isPrime()) {
                    Toast t3 = Toast.makeText(QuizupActivity.this, R.string.Incorrect_Toast, Toast.LENGTH_SHORT);
                    t3.setGravity(Gravity.CENTER,0,200);
                    t3.show();
                    noButton.setEnabled(false);

                } else {
                    Toast t4 = Toast.makeText(QuizupActivity.this, R.string.Correct_Toast, Toast.LENGTH_SHORT);
                    t4.setGravity(Gravity.CENTER,0,200);
                    t4.show();
                    noButton.setEnabled(false);

                }
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                setupQuestion();
                yesButton.setEnabled(true);
                noButton.setEnabled(true);
            }
        });


    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}

