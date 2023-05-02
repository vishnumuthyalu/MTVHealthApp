/**
 * BMICalculator.java consist of all the logic to the program with the calculate bmi method which calculate BMI
 * It also have the getBmiResults which will compare the user bmi with the national recommended BMI to determine their health status
 * It also contain getReccomendedWeight by backlogging the BMI to determine which weight would allow the BMI to be consider Healthy Weight
 */
package edu.utsa.cs3443.mtvhealth.model;

public class BMICalculator {
    public static double calculateBmi(String gender, int age, double weight, double heightInCm) {
        double bmi;
        double heightInMeters = heightInCm / 100.0;

        bmi = weight / (heightInMeters * heightInMeters);

        if (gender.equals("Male")) {
            bmi = weight / (heightInMeters * heightInMeters) - (0.00031 * age * age) + (0.0053 * age) + 0.151;
        } else {
            bmi = weight / (heightInMeters * heightInMeters) - (0.00031 * age * age) + (0.0053 * age) + 0.159;
        }

        return bmi;
    }

    public static String getBmiResult(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Healthy Weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static double getRecommendedWeight(double bmi, double heightInCm) {
        double recommendedBmi = 22.5;
        double heightInMeters = heightInCm / 100.0;
        double recommendedWeight = Math.pow(heightInMeters, 2) * recommendedBmi;

        return recommendedWeight - (bmi * Math.pow(heightInMeters, 2));
    }
}
