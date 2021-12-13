package com.example.pas2021dali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activityampera extends AppCompatActivity {
    Button btnAmpera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityampera);
        btnAmpera=(Button) findViewById(R.id.btn_ampr);

        btnAmpera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnAmpera = new Intent(Activityampera.this,fotoAmpera.class);
                startActivity(pindahBtnAmpera);
            }
        });
    }
}