package com.example.android.quizappactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //global variables
    // int
    int score = 0;

    //checkboxes
    CheckBox checkbox7aAnswer;
    CheckBox checkbox7cAnswer;
    CheckBox checkbox7dAnswer;
    CheckBox checkbox9bAnswer;
    CheckBox checkbox9dAnswer;

    //checkbox booleans
    boolean isCheckbox7aChecked;
    boolean isCheckbox7cChecked;
    boolean isCheckbox7dChecked;
    boolean isCheckbox9bChecked;
    boolean isCheckbox9dChecked;

    //radio buttons
    RadioButton radio1bAnswer;
    RadioButton radio2aAnswer;
    RadioButton radio3cAnswer;
    RadioButton radio4bAnswer;
    RadioButton radio5aAnswer;
    RadioButton radio6cAnswer;

    //radio booleans
    boolean isRadioButton1bChecked;
    boolean isRadioButton2aChecked;
    boolean isRadioButton3cChecked;
    boolean isRadioButton4bChecked;
    boolean isRadioButton5aChecked;
    boolean isRadioButton6cChecked;

    //edittext fields
    EditText text8Answer;
    EditText text10Answer;

    //edittext strings
    String edit8Answer;
    String edit10Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize radio views
        radio1bAnswer = findViewById(R.id.radio1bAnswer);
        radio2aAnswer = findViewById(R.id.radio2aAnswer);
        radio3cAnswer = findViewById(R.id.radio3cAnswer);
        radio4bAnswer = findViewById(R.id.radio4bAnswer);
        radio5aAnswer = findViewById(R.id.radio5aAnswer);
        radio6cAnswer = findViewById(R.id.radio6cAnswer);

        // initialize checkbox views
        checkbox7aAnswer = findViewById(R.id.checkbox7aAnswer);
        checkbox7cAnswer = findViewById(R.id.checkbox7cAnswer);
        checkbox7dAnswer = findViewById(R.id.checkbox7dAnswer);
        checkbox9bAnswer = findViewById(R.id.checkbox9bAnswer);
        checkbox9dAnswer = findViewById(R.id.checkbox9dAnswer);

        //initialize edittext views
        text8Answer = findViewById(R.id.test8Answer);
        text10Answer = findViewById(R.id.test10Answer);

    }

    public void onSubmit(View view) {
        // get score
        score = onCheckboxClicked() + radioButtonSelected() + editTextAnswer();
        //make toast
        Toast.makeText(this, "Your score is " + score + "!", Toast.LENGTH_SHORT).show();
    }

    /**
     *  reset all answers
     */
    public void onReset(View view) {
        //set score to 0
        score = 0;
        //set radio booleans to false
        radio1bAnswer.setChecked(false);
        radio2aAnswer.setChecked(false);
        radio3cAnswer.setChecked(false);
        radio4bAnswer.setChecked(false);
        radio5aAnswer.setChecked(false);
        radio6cAnswer.setChecked(false);
        // set checkbox booleans to false
        checkbox7aAnswer.setChecked(false);
        checkbox7cAnswer.setChecked(false);
        checkbox7dAnswer.setChecked(false);
        checkbox9bAnswer.setChecked(false);
        checkbox9dAnswer.setChecked(false);
        // set edittext to empty
        text8Answer.getText().clear();
        text10Answer.getText().clear();
    }


    /**
     *get total score of checkboxes.
     */
    public int onCheckboxClicked() {
        score = 0;
        // are checkboxes checked?
        isCheckbox7aChecked = checkbox7aAnswer.isChecked();
        isCheckbox7cChecked = checkbox7cAnswer.isChecked();
        isCheckbox7dChecked = checkbox7dAnswer.isChecked();
        isCheckbox9bChecked = checkbox9bAnswer.isChecked();
        isCheckbox9dChecked = checkbox9dAnswer.isChecked();

        //add up score of checkboxes
        if (isCheckbox7aChecked && isCheckbox7cChecked && isCheckbox7dChecked) {
            score+=1;
        }
        if (isCheckbox9bChecked && isCheckbox9dChecked) {
            score+=1;
        }
        return score;
    }

    /**
     * radio tallied
     */
    private int radioButtonSelected() {
        score = 0;
        // are radio buttons clicked?
        isRadioButton1bChecked = radio1bAnswer.isChecked();
        isRadioButton2aChecked = radio2aAnswer.isChecked();
        isRadioButton3cChecked = radio3cAnswer.isChecked();
        isRadioButton4bChecked = radio4bAnswer.isChecked();
        isRadioButton5aChecked = radio5aAnswer.isChecked();
        isRadioButton6cChecked = radio6cAnswer.isChecked();

        //add up score of radio buttons
        if (isRadioButton1bChecked) {
            score+=1;
        }
        if (isRadioButton2aChecked) {
            score+=1;
        }
        if (isRadioButton3cChecked) {
            score+=1;
        }
        if (isRadioButton4bChecked) {
            score+=1;
        }
        if (isRadioButton5aChecked) {
            score+=1;
        }
        if (isRadioButton6cChecked) {
            score+=1;
        }
        return score;
    }

    /**
     * add up edittext score
     */
    private int editTextAnswer() {
        score = 0;
        // are correct answers entered?
        edit8Answer = text8Answer.getText().toString();
        edit10Answer = text10Answer.getText().toString();

        // add up score of edit answers
        if (edit8Answer.equalsIgnoreCase("Boyle\'s Law")) {
            score+=1;
        }
        if (edit10Answer.equalsIgnoreCase("TCOM")) {
            score+=1;
        }
        return score;
    }

}
