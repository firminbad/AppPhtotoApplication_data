package com.example.appphtotoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivit extends AppCompatActivity {
    private Button btnTxt, btnPhoto, btnDessin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnTxt = (Button)findViewById(R.id.btnText);
        btnDessin = (Button)findViewById(R.id.btnDessin);
        btnPhoto = (Button)findViewById(R.id.btnPhoto);

        btnTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivit.this, AfficherTextVieuw.class);
                startActivity(intent);
            }
        });
        btnDessin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivit.this, MainActivityDessin.class);
                startActivity(intent);
            }
        });
        btnPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivit.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}