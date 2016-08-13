package com.example.root.assignmentone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        for(int i = 2 ; i < randomNumber; i++){
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
                    Toast.makeText(QuizupActivity.this, R.string.Correct_Toast, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizupActivity.this, R.string.Incorrect_Toast, Toast.LENGTH_SHORT).show();
                }
            }
        });

        noButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (isPrime()) {
                    Toast.makeText(QuizupActivity.this, R.string.Incorrect_Toast, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizupActivity.this, R.string.Correct_Toast, Toast.LENGTH_SHORT).show();
                }
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                setupQuestion();
            }
        });


    }
}

