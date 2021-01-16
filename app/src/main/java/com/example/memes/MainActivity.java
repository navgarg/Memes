package com.example.memes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton old, young, child, male, female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        old = findViewById(R.id.age_old);
        young = findViewById(R.id.age_young);
        child = findViewById(R.id.age_child);
        male = findViewById(R.id.gender_m);
        female = findViewById(R.id.gender_f);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                if (old.isChecked()){
                    if (male.isChecked()){
                        intent.putExtra("type", "old man");
                        startActivity(intent);
                    }
                    else if (female.isChecked()){
                        intent.putExtra("type", "old woman");
                        startActivity(intent);
                    }
                }
                else  if (young.isChecked()){
                    if (male.isChecked()){
                        intent.putExtra("type", "young man");
                        startActivity(intent);
                    }
                    else if (female.isChecked()){
                        intent.putExtra("type", "young woman");
                        startActivity(intent);
                    }
                }
                else  if (child.isChecked()){
                    if (male.isChecked()){
                        intent.putExtra("type", "child man");
                        startActivity(intent);
                    }
                    else if (female.isChecked()){
                        intent.putExtra("type", "child woman");
                        startActivity(intent);
                    }
                }
            }
        });
    }
}