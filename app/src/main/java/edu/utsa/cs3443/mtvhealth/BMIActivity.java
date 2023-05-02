/**
 * BMIActivity will pull data from BMI Calculator and display the data for the user to see using view
 *
 */

package edu.utsa.cs3443.mtvhealth;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import edu.utsa.cs3443.mtvhealth.model.BMICalculator;

public class BMIActivity extends AppCompatActivity {
    private TextView bmiResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        bmiResult = findViewById(R.id.bmi_result);
    }

    public void calculateBMI(View view) {
        // Retrieve user input fields
        EditText nameField = findViewById(R.id.name_field);
        EditText ageField = findViewById(R.id.age_field);
        RadioGroup genderField = findViewById(R.id.gender_field);
        EditText heightField = findViewById(R.id.height_field);
        EditText weightField = findViewById(R.id.weight_field);

        // Retrieve selected gender option
        int selectedGenderId = genderField.getCheckedRadioButtonId();
        RadioButton selectedGender = findViewById(selectedGenderId);

        // Parse user input values
        String name = nameField.getText().toString();
        int age = Integer.parseInt(ageField.getText().toString());
        String gender = selectedGender.getText().toString();
        double height = Double.parseDouble(heightField.getText().toString());
        double weight = Double.parseDouble(weightField.getText().toString());

        // Calculate BMI using BmiCalculator class
        double bmi = BMICalculator.calculateBmi(gender, age, weight, height);

        // Get BMI result and recommended weight loss using BmiCalculator class
        String bmiResult = BMICalculator.getBmiResult(bmi);
        double recommendedWeightLoss = BMICalculator.getRecommendedWeight(bmi, height);

        // Display BMI result in TextView
        TextView resultTextView = findViewById(R.id.bmi_result);
        String resultMessage = String.format("Name: %s\nAge: %d\nGender: %s\nHeight: %.2f cm\nWeight: %.2f kg\nBMI: %.1f (%s)\nRecommended weight loss: %.2f kg",
                name, age, gender, height, weight, bmi, bmiResult, recommendedWeightLoss);
        resultTextView.setText(resultMessage);
    }
}