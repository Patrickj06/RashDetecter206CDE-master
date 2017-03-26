package com.realworldproject.group03.rashdetecter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Lamar on 07/03/2017.
 * Handles the input of patient diagnosis' into sql db
 */

public class DBHandler extends SQLiteOpenHelper {
    SQLiteDatabase db;
    public DBHandler(Context context){
        super(context, "PatientDiagnosisDB", null, 7);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE PatientDiagnosisTable( patient_id integer primary key not null, "  +
                "gender text , race text, age integer , conditionID integer );" );
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS PatientDiagnosisTable";
        db.execSQL(query);
        this.onCreate(db);

    }
    public void addPatient(PatientDiagnosis p) {
        db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        String query = "select * from PatientDiagnosisTable";
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();
        cursor.close();
        contentValues.put("patient_id", count);
        contentValues.put("gender", p.getGender());
        contentValues.put("race", p.getRace());
        contentValues.put("age", p.getAge());
        contentValues.put("conditionID", p.getConditionClassification());
        long result = db.insert("PatientDiagnosisTable", null, contentValues);
        if (result > 0) {
            Log.d("Register Information", "inserted successfully");
        } else {
            Log.d("Register Information", "failed to insert");
        }
    }
}
