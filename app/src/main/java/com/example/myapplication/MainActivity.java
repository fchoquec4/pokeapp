package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    ImageButton bt1, bt2, bt3, bt4;
    MediaPlayer pika, spri, quak, fuec;
    int num=aleatorio();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bt1 = (ImageButton) findViewById(R.id.imageButton);
        bt2 = (ImageButton) findViewById(R.id.imageButton2);
        bt3 = (ImageButton) findViewById(R.id.imageButton4);
        bt4 = (ImageButton) findViewById(R.id.imageButton5);
        pika = MediaPlayer.create(this, R.raw.pikachu);
        spri = MediaPlayer.create(this, R.raw.sprigatito);
        quak = MediaPlayer.create(this, R.raw.quaxly);
        fuec = MediaPlayer.create(this, R.raw.fuecoco);

        bt1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MasActivity.class);
                pika.start();
                startActivity(i);

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MenosActivity.class);
                spri.start();
                startActivity(i);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PorActivity.class);
                quak.start();
                startActivity(i);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, DivActivity.class);
                fuec.start();

                startActivity(i);
                
            }

        });
        bt1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    bt1.setImageResource(R.drawable.botonmasp);
                }
                if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    bt1.setImageResource(R.drawable.botonmas);
                }
                return false;
            }
        });
        bt2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    bt2.setImageResource(R.drawable.botonmenosp);
                }
                if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    bt2.setImageResource(R.drawable.botonmenos);
                }
                return false;
            }
        });
        bt3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    bt3.setImageResource(R.drawable.botonporp);
                }
                if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    bt3.setImageResource(R.drawable.botonpor);
                }
                return false;
            }
        });
        bt4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    bt4.setImageResource(R.drawable.botondivp);
                }
                if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    bt4.setImageResource(R.drawable.botondiv);
                }
                return false;
            }
        });


    }
    private int aleatorio(){
        return 10;
    }
}