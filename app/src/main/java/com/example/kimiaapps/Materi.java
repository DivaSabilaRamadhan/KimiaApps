package com.example.kimiaapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Materi extends AppCompatActivity {

    private Button btn_bab1, btn_bab2, btn_bab3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        btn_bab1 = findViewById(R.id.btn_bab1);
        btn_bab2 = findViewById(R.id.btn_bab2);
        btn_bab3 = findViewById(R.id.btn_bab3);

        btn_bab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Materi.this, BAB1.class);
                startActivity(intent);
            }
        });

        btn_bab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Materi.this, BAB2.class );
                startActivity(intent);
            }
        });

        btn_bab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Materi.this, BAB3.class);
                startActivity(intent);
            }
        });
    }
}