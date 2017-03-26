package com.realworldproject.group03.rashdetecter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class result_keratosis extends AppCompatActivity {
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_keratosis);

        next = (Button) findViewById(R.id.next_ker_treat);

        next.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent HomeIntent = new Intent(result_keratosis.this,treatment_keratosis.class);
                result_keratosis.this.startActivity(HomeIntent);
            }
        });
    }
}
