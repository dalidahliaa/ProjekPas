package com.example.pas2021dali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fotoAmpera extends AppCompatActivity {
    Button btnBackfotoAmpera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_ampera);
        btnBackfotoAmpera=(Button) findViewById(R.id.btn_amperaa);

        btnBackfotoAmpera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnfotoAmpera = new Intent(fotoAmpera.this,MainActivity.class);
                startActivity(pindahBtnfotoAmpera);
            }
        });
    }
}