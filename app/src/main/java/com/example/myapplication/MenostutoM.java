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

public class MenostutoM extends AppCompatActivity {
    ImageView pasos;
    TextView d;
    ImageButton sig;
    int apunt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menostuto_m);
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
                        d.setText("El proceso sigue el mismo orden que la suma, se comienza siempre por la izquierda");
                        pasos.setImageResource(R.drawable.unorestamedio);
                        apunt++;
                        break;
                    case 2:
                        d.setText("Primero restamos esta columna ¿Cuanto es 7-3?");
                        pasos.setImageResource(R.drawable.dosrestamedio);
                        apunt++;
                        break;
                    case 3:
                        d.setText("Asi es, el resultado es 4.");
                        pasos.setImageResource(R.drawable.tresrestamedio);
                        apunt++;
                        break;
                    case 4:
                        d.setText("Ahora hacemos lo mismo con la siguiente columna, ¿Cuanto es 5 -2?");
                        pasos.setImageResource(R.drawable.cuatrorestamedio);
                        apunt++;
                        break;
                    case 5:
                        d.setText("El resultado es 3, acabamos y el resultado final nos dio 34");
                        pasos.setImageResource(R.drawable.cincorestamedio);
                        apunt++;
                        break;
                    case 6:
                        d.setText("¡Y eso es restar con dos digitos! En la siguiente dificultad veremos que pasa cuando el numero de abajo es mayor al de arriba.");
                        pasos.setImageResource(R.drawable.seisrestamedio);
                        apunt++;
                        break;
                    case 7:
                        pasos.setImageResource(R.drawable.suna);
                        d.setText("¡MODO DIFICIL DESBLOQUEADO!");
                        sig.setImageResource(R.drawable.volver);
                        apunt++;
                        break;
                    case 8:
                        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                        SharedPreferences.Editor editor = prefs.edit();
                        editor.putBoolean("MenostutoMCompleted", true);
                        editor.apply();
                        finish();
                        break;
                }
            }
        });
    }
}