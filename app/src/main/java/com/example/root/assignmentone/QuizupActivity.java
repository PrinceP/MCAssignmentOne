package com.example.root.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class QuizupActivity extends AppCompatActivity {

    @SuppressWarnings("FieldCanBeLocal")
    private Button yesButton;
    @SuppressWarnings("FieldCanBeLocal")
    private Button noButton;
    @SuppressWarnings("FieldCanBeLocal")
    private Button nextButton;
    @SuppressWarnings("FieldCanBeLocal")
    private TextView randomNumber_TextView;

    private Button hintButton;
    private Button cheatButton;

    private boolean ifcheated;
    private boolean ifhinted;
    private int randomNumber;
    private String displayNumber;

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

        hintButton = (Button) findViewById(R.id.hintButton);
        cheatButton = (Button) findViewById(R.id.cheatButton);





        yesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(ifhinted==false) {

                    if(ifcheated==false) {
                        if (isPrime()) {
                            Toast t1 = Toast.makeText(QuizupActivity.this, R.string.Correct_Toast, Toast.LENGTH_SHORT);
                            t1.setGravity(Gravity.CENTER, 0, 200);
                            t1.show();
                            yesButton.setEnabled(false);
                            noButton.setEnabled(false);
                        } else {
                            Toast t2 = Toast.makeText(QuizupActivity.this, R.string.Incorrect_Toast, Toast.LENGTH_SHORT);
                            t2.setGravity(Gravity.CENTER, 0, 200);
                            t2.show();
                            yesButton.setEnabled(false);
                            noButton.setEnabled(false);
                        }

                    }
                    else{

                        if (isPrime()) {
                            Toast t1 = Toast.makeText(QuizupActivity.this, R.string.Correct_Toast_cheat, Toast.LENGTH_SHORT);
                            t1.setGravity(Gravity.CENTER, 0, 200);
                            t1.show();
                            yesButton.setEnabled(false);
                            noButton.setEnabled(false);
                        } else {
                            Toast t2 = Toast.makeText(QuizupActivity.this, R.string.Incorrect_Toast_cheat, Toast.LENGTH_SHORT);
                            t2.setGravity(Gravity.CENTER, 0, 200);
                            t2.show();
                            yesButton.setEnabled(false);
                            noButton.setEnabled(false);
                        }




                    }
                    ifhinted = false;
                    ifcheated = false;


                }
                else{
                    if(ifcheated==false)
                    {
                        if (isPrime()) {
                        Toast t1 = Toast.makeText(QuizupActivity.this, R.string.Correct_Toast_hint, Toast.LENGTH_SHORT);
                        t1.setGravity(Gravity.CENTER, 0, 200);
                        t1.show();
                        yesButton.setEnabled(false);
                        noButton.setEnabled(false);
                    } else {
                        Toast t2 = Toast.makeText(QuizupActivity.this, R.string.Incorrect_Toast_hint, Toast.LENGTH_SHORT);
                        t2.setGravity(Gravity.CENTER, 0, 200);
                        t2.show();
                        yesButton.setEnabled(false);
                        noButton.setEnabled(false);
                    }

                }
                else{

                    if (isPrime()) {
                        Toast t1 = Toast.makeText(QuizupActivity.this, R.string.Correct_Toast_cheat_hint, Toast.LENGTH_SHORT);
                        t1.setGravity(Gravity.CENTER, 0, 200);
                        t1.show();
                        yesButton.setEnabled(false);
                        noButton.setEnabled(false);
                    } else {
                        Toast t2 = Toast.makeText(QuizupActivity.this, R.string.Incorrect_Toast_cheat_hint, Toast.LENGTH_SHORT);
                        t2.setGravity(Gravity.CENTER, 0, 200);
                        t2.show();
                        yesButton.setEnabled(false);
                        noButton.setEnabled(false);
                    }




                }
                    ifhinted = false;
                    ifcheated = false;

                }


            }
        });

        noButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                if(ifhinted==false) {

                    if(ifcheated==false) {
                        if (isPrime()) {
                            Toast t1 = Toast.makeText(QuizupActivity.this, R.string.Incorrect_Toast, Toast.LENGTH_SHORT);
                            t1.setGravity(Gravity.CENTER, 0, 200);
                            t1.show();
                            yesButton.setEnabled(false);
                            noButton.setEnabled(false);
                        } else {
                            Toast t2 = Toast.makeText(QuizupActivity.this, R.string.Correct_Toast, Toast.LENGTH_SHORT);
                            t2.setGravity(Gravity.CENTER, 0, 200);
                            t2.show();
                            yesButton.setEnabled(false);
                            noButton.setEnabled(false);
                        }

                    }
                    else{

                        if (isPrime()) {
                            Toast t1 = Toast.makeText(QuizupActivity.this, R.string.Incorrect_Toast_cheat, Toast.LENGTH_SHORT);
                            t1.setGravity(Gravity.CENTER, 0, 200);
                            t1.show();
                            yesButton.setEnabled(false);
                            noButton.setEnabled(false);
                        } else {
                            Toast t2 = Toast.makeText(QuizupActivity.this, R.string.Correct_Toast_cheat, Toast.LENGTH_SHORT);
                            t2.setGravity(Gravity.CENTER, 0, 200);
                            t2.show();
                            yesButton.setEnabled(false);
                            noButton.setEnabled(false);
                        }




                    }
                    ifhinted = false;
                    ifcheated = false;


                }
                else{
                    if(ifcheated==false)
                    {
                        if (isPrime()) {
                            Toast t1 = Toast.makeText(QuizupActivity.this, R.string.Incorrect_Toast_hint, Toast.LENGTH_SHORT);
                            t1.setGravity(Gravity.CENTER, 0, 200);
                            t1.show();
                            yesButton.setEnabled(false);
                            noButton.setEnabled(false);
                        } else {
                            Toast t2 = Toast.makeText(QuizupActivity.this, R.string.Correct_Toast_hint, Toast.LENGTH_SHORT);
                            t2.setGravity(Gravity.CENTER, 0, 200);
                            t2.show();
                            yesButton.setEnabled(false);
                            noButton.setEnabled(false);
                        }

                    }
                    else{

                        if (isPrime()) {
                            Toast t1 = Toast.makeText(QuizupActivity.this, R.string.Incorrect_Toast_cheat_hint, Toast.LENGTH_SHORT);
                            t1.setGravity(Gravity.CENTER, 0, 200);
                            t1.show();
                            yesButton.setEnabled(false);
                            noButton.setEnabled(false);
                        } else {
                            Toast t2 = Toast.makeText(QuizupActivity.this, R.string.Correct_Toast_cheat_hint, Toast.LENGTH_SHORT);
                            t2.setGravity(Gravity.CENTER, 0, 200);
                            t2.show();
                            yesButton.setEnabled(false);
                            noButton.setEnabled(false);
                        }




                    }
                    ifhinted = false;
                    ifcheated = false;

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


        hintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifhinted = true;
                Intent myIntent = new Intent(QuizupActivity.this, HintActivity.class);
                myIntent.putExtra("RandomNumber",displayNumber);
                QuizupActivity.this.startActivity(myIntent);
            }
        });

        cheatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifcheated = true;
                Intent myIntent = new Intent(QuizupActivity.this, CheatActivity.class);
                myIntent.putExtra("RandomNumber",displayNumber);
                QuizupActivity.this.startActivity(myIntent);
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

