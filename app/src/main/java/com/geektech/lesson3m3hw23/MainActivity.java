package com.geektech.lesson3m3hw23;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> characters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        loadData();
        CharacterAdapter adapter = new CharacterAdapter(characters);
        recyclerView.setAdapter(adapter);

    }

    private void loadData(){
        characters = new ArrayList<>();
        characters.add("Hulk");
        characters.add("Thanos");
        characters.add("Captain America");
        characters.add("Doctor Strange");
        characters.add("Spider Man");
        characters.add("Harry Potter");
        characters.add("Hermione Granger");
        characters.add("Ron Weasley");
        characters.add("Draco Malfoy");
        characters.add("Albus Dumbledore");
        characters.add("Lord Voldemord");
        characters.add("Rubeus Hagrid");
        characters.add("Sirius Black");
    }
}