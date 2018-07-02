package com.casa.android.quizjiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    //User Level Start From Zero
    //User Level Start From Zero
    private int level = 1;
    //User Score
    private int userScore = 0;
    //Tags
    private final String LEVEL_TAG = "level";
    //TextView For Every Question
    private TextView question1;
    private TextView question2;
    private TextView question3;
    private TextView question4;

    //RadioGroup For Every Question
    private RadioGroup resultGroup1;
    private RadioGroup resultGroup2;
    private RadioGroup resultGroup3;
    private RadioGroup resultGroup4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultGroup1 = findViewById(R.id.resultGroup1);
        resultGroup2 = findViewById(R.id.resultGroup2);
        resultGroup3 = findViewById(R.id.resultGroup3);
        resultGroup4 = findViewById(R.id.resultGroup4);

//        resultGroup1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
//            @Override
//            public void OnCheckedChangeListener(RadioGroup radioGroup){
//
//        }
//        });

    }
    /**
     * This method is use to verify the answers of Questions with RadioGroup Options
     * @param mRadioGroup   is the RadioGroup id that is associated to a particular Question
     *
     * @return true of false, if the right answer is selected or not
     */
    public String getStringOfTheSelectedButtonFromRadioGroup(RadioGroup mRadioGroup) {
        if (mRadioGroup.getCheckedRadioButtonId() != -1) {//checking if an option is selected from the RadioGroup
            int idOfCheckedButton = mRadioGroup.getCheckedRadioButtonId(); //get the id of the selected option
            return ((RadioButton) findViewById(idOfCheckedButton)).getText().toString().trim(); //return the string of the seleted button
        }
        return null;
    }

    public void sumbitButton(View v){
        String resultToast = "";
        String correctAnswer1 = "Aristotle";
        String correctAnswer2 = "Myogenic heart";
        String correctAnswer3 = "Seed";
        String correctAnswer4 = "Cockroach";

        String answerofRG1 = getStringOfTheSelectedButtonFromRadioGroup(resultGroup1);
        String answerofRG2 = getStringOfTheSelectedButtonFromRadioGroup(resultGroup2);
        String answerofRG3 = getStringOfTheSelectedButtonFromRadioGroup(resultGroup3);
        String answerofRG4=  getStringOfTheSelectedButtonFromRadioGroup(resultGroup4);
//for display of the Questions
        if(answerofRG1 != null){
            resultToast += "Question 1 \n";
            if(correctAnswer1.equalsIgnoreCase(answerofRG1)){
                resultToast += "You are Correct \nYou selected "+answerofRG1+"\n";
            }else{
                resultToast +="You are Wrong \nYou selected "+answerofRG1+"\nCorrect Answer is "+correctAnswer1+"\n";
            }
        }

        if(answerofRG2 != null){
            resultToast += "Question 2 \n";
            if(correctAnswer2.equalsIgnoreCase(answerofRG2)){
                resultToast += "You are Correct \nYou selected "+answerofRG2+"\n";
            }else{
                resultToast +="You are Wrong \nYou selected "+answerofRG2+"\nCorrect Answer is "+correctAnswer2+"\n";
            }
        }
        if(answerofRG3 != null){
            resultToast += "Question 3 \n";
            if(correctAnswer3.equalsIgnoreCase(answerofRG3)){
                resultToast += "You are Correct \nYou select "+answerofRG3+"\n";
            }else{
                resultToast +="You are Wrong \nYou selected "+answerofRG3+"\nCorrect Answer is "+correctAnswer3+"\n";
            }
        }if(answerofRG4 != null){
            resultToast += "Question 4 \n";
            if(correctAnswer4.equalsIgnoreCase(answerofRG4)){
                resultToast += "You are Correct \nYou selected "+answerofRG4+"\n";
            }else{
                resultToast +="You are Wrong \nYou selected "+answerofRG4+"\nCorrect Answer is "+correctAnswer4+"\n";
            }
        }
        Toast.makeText(this, resultToast, Toast.LENGTH_LONG).show();

    }
}