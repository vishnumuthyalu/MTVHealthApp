/**
 *LayoutScreen.java contains the main View for the buttons which will allow the user to navigate through screens using Intent
 */

package edu.utsa.cs3443.mtvhealth;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LayoutScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_screen);
        Button bBMI = findViewById(R.id.BMI);
        Button bexcersise = findViewById(R.id.Excercises);


        bBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openScreenBMI();
            }
        });
        bexcersise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScreenExercises();
            }
        });
    }

    public void openScreenBMI(){

        Intent intent = new Intent(this, BMIActivity.class);
        startActivity(intent);
    }
    public void openScreenExercises(){
        Intent intent = new Intent(this, ExcercisesActivity.class);
        startActivity(intent);
    }
}


