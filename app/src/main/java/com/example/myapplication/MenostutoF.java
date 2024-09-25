package com.example.myapplication;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenostutoF extends AppCompatActivity {
    ImageView pasos;
    TextView d;
    ImageButton sig;
    int apunt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menostuto_f);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        pasos = (ImageView) findViewById(R.id.imageView3);
        d = (TextView) findViewById(R.id.textView3);
        sig = (ImageButton) findViewById(R.id.imageButton3);
        apunt = 1;
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(apunt){
                    case 1:
                        d.setText("Primeramente imagina que tienes 5 caramelos en tu mano, si le darias dos caramelos a tu amigo cuantos te quedan? vamos a contar.");
                        pasos.setImageResource(R.drawable.unorestafacil);
                        apunt++;
                        break;
                    case 2:
                        d.setText("Si tienes 5 y le quitas 1, te quedan 4.");
                        pasos.setImageResource(R.drawable.dosrestafacil);
                        apunt++;
                        break;
                    case 3:
                        d.setText("Si quitas otro, ahora te quedan 3.");
                        pasos.setImageResource(R.drawable.tresrestafacil);
                        apunt++;
                        break;
                    case 4:
                        d.setText("Como puedes ver si teniamos 5 caramelos y le damos 2 a nuestro amigo, nos quedan 3.");
                        pasos.setImageResource(R.drawable.cuatrorestafacil);
                        apunt++;
                        break;
                    case 5:
                        d.setText("Asi es como se ve la resta que hicimos en forma de números. No es nada del otro mundo.");
                        pasos.setImageResource(R.drawable.cincorestafacil);
                        apunt++;
                        break;
                    case 6:
                        d.setText("¡Y eso restar con un dígito! En la siguiente dificultad veremos cuando el numero de abajo es mayor que el de arriba");
                        apunt++;
                        break;
                    case 7:
                        pasos.setImageResource(R.drawable.suna);
                        d.setText("¡DIFICULTAD MEDIA DESBLOQUEADA!");
                        sig.setImageResource(R.drawable.volver);
                        apunt++;
                        break;
                    case 8:
                        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                        SharedPreferences.Editor editor = prefs.edit();
                        editor.putBoolean("MenostutoCompleted", true);
                        editor.apply();
                        finish();
                        break;
                }
            }
        });
    }
}