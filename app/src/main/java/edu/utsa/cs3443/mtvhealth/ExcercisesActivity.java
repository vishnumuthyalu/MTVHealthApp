/**
 * The ExercisesActivity class is responsible for displaying the list of exercises categorized by
 * body parts such as the chest, leg, shoulder, etc..  It allows the user to select a specific body part
 * displays the exercises corresponding to it using the DisplayExerciseActivity
 */
package edu.utsa.cs3443.mtvhealth;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ExcercisesActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercises);

        Button button_arms = findViewById(R.id.ARMS);
        Button button_chest = findViewById(R.id.CHEST);
        Button button_back = findViewById(R.id.BACK);
        Button button_quads = findViewById(R.id.QUADS);
        Button button_hamstring = findViewById(R.id.HAMSTRING);
        Button button_shoulders = findViewById(R.id.SHOULDERS);
        Button button_glutes = findViewById(R.id.GLUTES);
        Button button_core = findViewById(R.id.CORE);
        Button button_calfs = findViewById(R.id.CALFS);

        button_arms.setOnClickListener(this);
        button_chest.setOnClickListener(this);
        button_back.setOnClickListener(this);
        button_quads.setOnClickListener(this);
        button_hamstring.setOnClickListener(this);
        button_shoulders.setOnClickListener(this);
        button_glutes.setOnClickListener(this);
        button_core.setOnClickListener(this);
        button_calfs.setOnClickListener(this);

    }
    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,DisplayExerciseActivity.class);
        switch (v.getId()) {
            case R.id.ARMS:
                intent.putExtra("filename","arm.csv");
                intent.putExtra("image",R.drawable.arms);
                startActivity(intent);
                break;
            case R.id.BACK:
                intent.putExtra("filename","back.csv");
                intent.putExtra("image",R.drawable.back);
                startActivity(intent);
                break;
            case R.id.CHEST:
                intent.putExtra("filename","chest.csv");
                intent.putExtra("image",R.drawable.chest);
                startActivity(intent);
                break;
            case R.id.QUADS:
                intent.putExtra("filename","quads.csv");
                intent.putExtra("image",R.drawable.quads);
                startActivity(intent);
                break;
            case R.id.HAMSTRING:
                intent.putExtra("filename","hamstrings.csv");
                intent.putExtra("image",R.drawable.hamstrings);
                startActivity(intent);
                break;
            case R.id.SHOULDERS:
                intent.putExtra("filename","shoulder.csv");
                intent.putExtra("image",R.drawable.shoulders);
                startActivity(intent);
                break;
            case R.id.GLUTES:
                intent.putExtra("filename","glutes.csv");
                intent.putExtra("image",R.drawable.glutes);
                startActivity(intent);
                break;
            case R.id.CORE:
                intent.putExtra("filename","core.csv");
                intent.putExtra("image",R.drawable.core);
                startActivity(intent);
                break;
            case R.id.CALFS:
                intent.putExtra("filename","calves.csv");
                intent.putExtra("image",R.drawable.calves);
                startActivity(intent);
                break;
            default:
                break;
        }
    }




}