/**
 * ExcerciseFormat.java
 * Create a constructor for the excercise file with getters for fields
 */
package edu.utsa.cs3443.mtvhealth.model;

public class ExerciseFormat {
    private String exercise_name;
    private String exercise_link;

    public ExerciseFormat(String a, String b){
        this.exercise_name=a;
        this.exercise_link=b;
    }

    public String getExercise_name() {
        return exercise_name;
    }

    public String getExercise_link() {
        return exercise_link;
    }
}

