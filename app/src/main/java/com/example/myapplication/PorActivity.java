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

public class PorActivity extends AppCompatActivity {
    Button bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_por);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bt1 = (Button) findViewById(R.id.button5);
        bt2 = (Button) findViewById(R.id.button6);
        bt3 = (Button) findViewById(R.id.button7);
        bt2.setEnabled(false);
        bt2.setClickable(false);
        bt3.setEnabled(false);
        bt3.setClickable(false);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PorActivity.this,MulttutoF.class);
                startActivity(i);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PorActivity.this,MulttutoM.class);
                startActivity(i);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PorActivity.this,MulttutoD.class);
                startActivity(i);
            }
        });

    }
    protected void onResume() {
        super.onResume();
        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        boolean isPortutoCompleted = prefs.getBoolean("PortutoCompleted", false);
        boolean isPortutoMCompleted = prefs.getBoolean("PortutoMCompleted", false);


        if (isPortutoCompleted) {
            bt2.setClickable(true);
            bt2.setEnabled(true);
        }



        if (isPortutoMCompleted) {
            bt3.setClickable(true);
            bt3.setEnabled(true);
        }

    }
}