package com.example.kimiaapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btn_materi, btn_simulasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_materi = findViewById(R.id.btn_materi);
        btn_simulasi = findViewById(R.id.btn_simulasi);

        btn_materi.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Materi.class);
                startActivity(intent);
            }
        }));

        btn_simulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, simulasi.class);
                startActivity(intent);
            }
        });

    }

}