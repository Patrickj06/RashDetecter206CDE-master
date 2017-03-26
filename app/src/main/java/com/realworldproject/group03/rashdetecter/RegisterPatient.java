package com.realworldproject.group03.rashdetecter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.view.View;
import android.widget.Toast;

public class RegisterPatient extends AppCompatActivity {
    DBHandler db = new DBHandler(this);
    Button patientSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_patient);
        final Spinner ageSpinner = (Spinner) findViewById(R.id.ageSpinner);
        final Spinner genderSpinner = (Spinner) findViewById(R.id.genderSpinner);
        final Spinner raceSpinner = (Spinner) findViewById(R.id.raceSpinner);
        final Spinner conditionSpinner = (Spinner) findViewById(R.id.conditionSpinner);

        patientSubmit = (Button) findViewById(R.id.patientSubmit);

        patientSubmit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int age = Integer.parseInt(ageSpinner.getSelectedItem().toString());
                String gender = genderSpinner.getSelectedItem().toString();
                String race = raceSpinner.getSelectedItem().toString();
                String condition = conditionSpinner.getSelectedItem().toString();
                PatientDiagnosis patient = new PatientDiagnosis(age, gender, race, condition);
                db.addPatient(patient);
               /* Intent loginIntent = new Intent(RegisterActivity.this, MainActivity.class);
                RegisterActivity.this.startActivity(loginIntent);*/
                finish();
                Context context = getApplicationContext();
                CharSequence text = "Information Submitted";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });


        String[] strAge = new String[99];
        for (int i = 1; i < 100; i++){
            strAge[i-1] = String.valueOf(i);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, strAge);
        ageSpinner.setAdapter(adapter);

        String[] genderEntries = new String[]{"","Male", "Female", "Other"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,genderEntries);
        genderSpinner.setAdapter(adapter1);

        String[] raceEntries = new String[]{"", "White", "Black", "Asian", "Hispanic","Mixed", "Other"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,raceEntries);
        raceSpinner.setAdapter(adapter2);

       String[] strCon = new String[] {"","1","2","3","4"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, strCon);
        conditionSpinner.setAdapter(adapter3);

    }
}
