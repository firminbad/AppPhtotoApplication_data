package com.example.appphtotoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AfficherTextVieuw extends AppCompatActivity {
    private TextView txtV;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afficher_text_vieuw);

        txtV = (TextView)findViewById(R.id.txt_change);
        btn = (Button)findViewById(R.id.btn_change);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtV.setText("Bonjour le monde, faite un long clik pour me connaitre !");
            }

        });
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) { txtV.setText("Mon nom est:FIRMIN BADIBANGA" +
                    "Je suis étudiant en Bac 3 Informatique");
                return true;
            }

        });

    }
}