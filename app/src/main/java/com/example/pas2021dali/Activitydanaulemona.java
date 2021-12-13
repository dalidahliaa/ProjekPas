package com.example.pas2021dali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activitydanaulemona extends AppCompatActivity {
    Button btnDanauLemona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitydanaulemona);
        btnDanauLemona = (Button) findViewById(R.id.btn_dnlm);

        btnDanauLemona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnDanau = new Intent(Activitydanaulemona.this,fotoDanau.class);
                startActivity(pindahBtnDanau);
            }
        });


    }
}