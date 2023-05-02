/**
 * The DisplayExerciseActivity class is responsible for displaying the lis tof exercises and an image
 * related to the exercise on the screen. It reads the type exercise from a csv file, and populated them
 * in the list. Whenever a particular exercise in the list is clicked, it opens a URL in youtube.
 */
package edu.utsa.cs3443.mtvhealth;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DisplayExerciseActivity extends AppCompatActivity {

    private ListView listView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_exercises);

        listView = findViewById(R.id.listView);
        imageView = findViewById(R.id.my_image);


        //reading files
        String filename = getIntent().getStringExtra("filename");
        ArrayList<String> dataList = new ArrayList<>();

        try {
            InputStream inputStream = getAssets().open(filename);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                dataList.add(data[0] + " - " + data[1]);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = dataList.get(position);
                String[] data = selectedItem.split("-");
                String url = data[1].trim();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        int imageResource = getIntent().getIntExtra("image",0);
        imageView.setImageResource(imageResource);


    }
}
