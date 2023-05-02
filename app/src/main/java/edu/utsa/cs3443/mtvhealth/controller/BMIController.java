/**
 * BMICotroller is the controller consist of the constructor to store data from the user
 * It also consist of getResultMessage that will display the user's data (weight etc...)
 */
package edu.utsa.cs3443.mtvhealth.controller;
import edu.utsa.cs3443.mtvhealth.model.BMICalculator;
public class BMIController {
    private String name;
    private int age;
    private String gender;
    private double height;
    private double weight;

    public BMIController(String name, int age, String gender, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public double calculateBmi() {
        return BMICalculator.calculateBmi(gender,age,weight, height);
    }

    public String getResultMessage() {
        double bmi = calculateBmi();
        return String.format("%s, your BMI is %.1f", name, bmi);
    }
}