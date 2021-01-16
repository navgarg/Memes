package com.example.memes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = findViewById(R.id.imageView);

        Intent intent = getIntent();
        String type = intent.getStringExtra("type");

        switch (type){
            case "old man":
                imageView.setImageResource(R.mipmap.old_man);
                break;
            case "old woman":
                imageView.setImageResource(R.mipmap.old_woman);
                break;
            case "young man":
                imageView.setImageResource(R.mipmap.young_boy);
                break;
            case "young woman":
                imageView.setImageResource(R.mipmap.young_girl);
                break;
            case "child man":
                imageView.setImageResource(R.mipmap.male_child);
                break;
            case "child woman":
                imageView.setImageResource(R.mipmap.female_child);
                break;
        }
    }
}