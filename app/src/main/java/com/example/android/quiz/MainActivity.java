package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;

import static com.example.android.quiz.R.string.q1;

public class MainActivity extends AppCompatActivity {
    int grade = 100;
    int answer = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    RadioGroup question1  = (RadioGroup) findViewById(R.id.question_1);

    RadioGroup question2  = (RadioGroup) findViewById(R.id.question_2);

    public void gradeButton( boolean) {
        if (q1.getCheckedRadioButtonId() == R.id.radio_button_1c);
        {answer = answer + 5;}
    }



}
