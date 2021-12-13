package com.example.pas2021dali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fotoDanau extends AppCompatActivity {
    Button btnBackfotoDanauLemona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_danau);
        btnBackfotoDanauLemona = (Button) findViewById(R.id.btn_lemonaa);

        btnBackfotoDanauLemona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnfotoDanauLemona = new Intent(fotoDanau.this,MainActivity.class);
                startActivity(pindahBtnfotoDanauLemona);
            }
        });
    }
}