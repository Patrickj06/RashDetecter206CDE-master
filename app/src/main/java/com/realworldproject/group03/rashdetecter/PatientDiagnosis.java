package com.realworldproject.group03.rashdetecter;

/**
 * Created by lamar on 08/03/2017.
 */

/**
 * Created by lamar on 07/03/2017.
 * The class to store patient results
 * Attributes: age, gender, race, conditionClassfication
 * Constructors: empty, all
 * Getters & Setters: All
 */
import java.sql.Date;
public class PatientDiagnosis {

    private int age;
    private String gender;
    private String race;
    private String conditionClassification;
    // Empty constructor
    public PatientDiagnosis(){

    }
    // Constructor to set all the patients information
    public PatientDiagnosis(int age, String gender, String race, String condition){
        setAge(age);
        setGender(gender);
        setRace(race);
        setConditionClassification(condition);
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setRace(String race){
        this.race = race;
    }
    public String getRace(){
        return race;
    }

    public void setConditionClassification(String condition) {
        this.conditionClassification = condition;
    }

    public String getConditionClassification() {
        return conditionClassification;
    }

}

