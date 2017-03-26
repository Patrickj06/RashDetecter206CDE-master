package com.realworldproject.group03.rashdetecter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class treatment_nb_impe extends AppCompatActivity {
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment_nb_impe);
        home = (Button) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent HomeIntent = new Intent(treatment_nb_impe.this,MainActivity.class);
                treatment_nb_impe.this.startActivity(HomeIntent);
            }
        });

    }
}
