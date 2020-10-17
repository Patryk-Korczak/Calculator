package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Objects.requireNonNull(getSupportActionBar()).hide();

        TextView authorInfo = (TextView) findViewById(R.id.authorInfo);
        String author = "Patryk Korczak";
        String version = "1.0.1";
        String[] email = {"215767@edu.p.lodz.pl"};
        String info = "Created by: " + author + "\nVersion: " + version + "\nEmail: " + email[0];
        authorInfo.setText(info);

        Button buttonContact = (Button) findViewById(R.id.buttonContact);

        buttonContact.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("message/rfc822");
            intent.putExtra(Intent.EXTRA_EMAIL, email);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Question about Calculator app");
            try {
                startActivity(Intent.createChooser(intent, "Send mail..."));
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(AboutActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}