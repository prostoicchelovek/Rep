package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);
        String[] color={"Salmon","Saffron","Navy blue","Azure","Ivory","Eggshell","Khaki","Turquoise","Crimson","Maroon"};
        ArrayList<String> posts = new ArrayList<>();
        for(int i = 0; i<color.length;i++){
            posts.add("wow this is  "+color[i]);
            Log.i("posts: ", posts.get(i));
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, posts);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this, "A "+color[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}