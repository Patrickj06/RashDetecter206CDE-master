package com.realworldproject.group03.rashdetecter;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bRash;
    Button buttonPatient;
    Button bHelp;
    DBHandler db = new DBHandler(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bRash = (Button) findViewById(R.id.bRash);

        bRash.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent rashLocationIntent = new Intent(MainActivity.this,RashLocation.class);
                MainActivity.this.startActivity(rashLocationIntent);
            }
        });

        buttonPatient = (Button) findViewById(R.id.buttonPatient);

        buttonPatient.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent RegisterPatientIntent = new Intent(MainActivity.this,RegisterPatient.class);
                MainActivity.this.startActivity(RegisterPatientIntent);
            }
        });

        bHelp = (Button) findViewById(R.id.bHelp);

        bHelp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent HelpIntent = new Intent(MainActivity.this,HelpPage.class);
                MainActivity.this.startActivity(HelpIntent);
            }
        });
    }

}
