//change package to your one
package com.realworldproject.group03.rashdetecter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.checked;

public class RadioBoxTest extends AppCompatActivity {
    //Do not change
    Button nextbutton;
    RadioButton yesButton;
    RadioButton noButton;

    //Array to store which radio box was selected Only use for first qs page
    ArrayList<String> answersStringArray= new ArrayList<String>();

    /* This intent & array are only used for pages that arent the first, used

    Intent intent = getIntent();
    ArrayList<String> answersStringArray = intent.getStringArrayListExtra("arrayListExtra");

    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_box_test);

        // yes/noButton represent the radioButton ID in your xml
        nextbutton = (Button) findViewById(R.id.button); // change 'button' with id of the button you want
        yesButton = (RadioButton) findViewById(R.id.yesButton);
        noButton = (RadioButton) findViewById(R.id.noButton); // R.id.yes/noButton represent the radioButtonID in your xml

        nextbutton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){//What occurs when nextbutton is clicked
                // If Yes button is checked
                if(yesButton.isChecked()){
                    //Go to next page Change 'RadioBoxTest' with current class name
                    // Change 'RashLocation' to the class you want to go to
                    Intent intent = new Intent(RadioBoxTest.this, RashLocation.class);
                    //Store Answer Yes in results array
                    answersStringArray.add("Yes");
                    intent.putExtra("arrayListExtra", answersStringArray); //Passes array to next page
                    RadioBoxTest.this.startActivity(intent); //Change 'RadioBoxTest' with current class name

                }
                // If no Radio Button is checked
                if(noButton.isChecked()){
                    //Go to next page Change 'RadioBoxTest' with current class name
                    // Change 'RashLocation' to the class you want to go to
                    Intent intent = new Intent(RadioBoxTest.this, RashLocation.class);
                    //Store Answer No in results array
                    answersStringArray.add("No");
                    intent.putExtra("arrayListExtra", answersStringArray); //Passes array to next page
                    RadioBoxTest.this.startActivity(intent); //Change 'RadioBoxTest' with current class name

                }

                else {// Displays a reminder to user to select an option
                    //Do not need to change
                    Context context = getApplicationContext();
                    CharSequence text = "Please Select an option";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }

        });
    }}

