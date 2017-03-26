package com.realworldproject.group03.rashdetecter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RashLocation extends AppCompatActivity {
    Button bElbow;
    Button face_chest;
    Button blowerLegs;
    Button everywhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rash_location);

        bElbow = (Button) findViewById(R.id.bElbow);
        bElbow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent ElbowQuestionsIntent = new Intent(RashLocation.this,Question1.class);
                RashLocation.this.startActivity(ElbowQuestionsIntent);
            }
        });
/*
        face_chest = (Button) findViewById(R.id.face_chest);
        face_chest.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent Face_ElbowQuestionsIntent = new Intent(RashLocation.this,__.class);
                RashLocation.this.startActivity(Face_ElbowQuestionsIntent);
            }
        });

        blowerLegs = (Button) findViewById(R.id.blowerLegs);
        blowerLegs.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent LowerLegQuestionsIntent = new Intent(RashLocation.this,__.class);
                RashLocation.this.startActivity(LowerLegQuestionsIntent);
            }
        });

        everywhere = (Button) findViewById(R.id.everywhere);
        everywhere.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent everywhereQuestionsIntent = new Intent(RashLocation.this,__.class);
                RashLocation.this.startActivity(everywhereQuestionsIntent);
            }
        });

*/
    }
}
