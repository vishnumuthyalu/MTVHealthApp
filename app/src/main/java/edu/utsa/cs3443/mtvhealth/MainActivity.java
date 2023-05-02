/**
 * MainActivity.java is the splash screen with the intent for the user to navigate to the main screen with 2 buttons
 */
package edu.utsa.cs3443.mtvhealth;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button begin = findViewById(R.id.Begin);

        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openScreen2();
            }
        });
    }

    public void openScreen2(){

        Intent intent = new Intent(this, LayoutScreenActivity.class);
        startActivity(intent);
    }
}



