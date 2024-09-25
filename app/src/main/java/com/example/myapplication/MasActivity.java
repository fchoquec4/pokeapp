package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MasActivity extends AppCompatActivity {

    Button bt1,bt2,bt3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mas);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bt1 = (Button) findViewById(R.id.button5);
        bt2= (Button) findViewById(R.id.button6);
        bt3= (Button) findViewById(R.id.button7);
        bt2.setClickable(false);
        bt2.setEnabled(false);
        bt3.setClickable(false);
        bt3.setEnabled(false);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MasActivity.this,MastutoActivity.class);
                startActivity(i);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MasActivity.this,MastutoM.class);
                startActivity(i);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MasActivity.this,MastutoD.class);
                startActivity(i);
            }
        });
    }
    protected void onResume() {
        super.onResume();
        // Leer el valor de SharedPreferences cuando la actividad vuelve a primer plano
        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        boolean isMastutoCompleted = prefs.getBoolean("MastutoCompleted", false);
        boolean isMastutoMCompleted = prefs.getBoolean("MastutoMCompleted", false);

        // Si MastutoActivity fue completado, habilitar bt2
        if (isMastutoCompleted) {
            bt2.setClickable(true);
            bt2.setEnabled(true);
        }


        // Si MastutoActivity fue completado, habilitar bt2
        if (isMastutoMCompleted) {
            bt3.setClickable(true);
            bt3.setEnabled(true);
        }

    }

}