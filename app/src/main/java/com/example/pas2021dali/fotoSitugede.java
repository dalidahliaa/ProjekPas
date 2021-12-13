package com.example.pas2021dali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fotoSitugede extends AppCompatActivity {
    Button btnBackSitugede;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_situgede);
        btnBackSitugede=(Button) findViewById(R.id.btn_gedee);

        btnBackSitugede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnSitugede = new Intent(fotoSitugede.this,MainActivity.class);
                startActivity(pindahBtnSitugede);
            }
        });
    }
}