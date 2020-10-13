package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButtonListeners();
    }

    public void addButtonListeners() {
        Button buttonSimple = (Button) findViewById(R.id.buttonSimple);
        Button buttonAdvanced = (Button) findViewById(R.id.buttonAdvanced);
        Button buttonAbout = (Button) findViewById(R.id.buttonAbout);
        Button buttonExit = (Button) findViewById(R.id.buttonExit);

        buttonSimple.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this , SimpleActivity.class);
            startActivity(intent);
        });

        buttonAdvanced.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AdvancedActivity.class);
            startActivity(intent);
        });

        buttonAbout.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this , AboutActivity.class);
            startActivity(intent);
        });

        buttonExit.setOnClickListener(v -> finishAndRemoveTask());
    }
}