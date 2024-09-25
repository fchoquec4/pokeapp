package com.example.myapplication;

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

public class DivtutoD extends AppCompatActivity {
    ImageView pasos;
    TextView d;
    ImageButton sig;
    int apunt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_divtuto_d);
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
                        d.setText("Dividiremos 58 entre 2, debes saber que el dividendo siempre debe ser mayor al divisor...");
                        pasos.setImageResource(R.drawable.unodivdif);
                        apunt++;
                        break;
                    case 2:
                        d.setText("Buscamos el primer dígito del dividendo, lo multiplicamos por 2 del divisor y el número más cercano se copia en el cociente.");
                        pasos.setImageResource(R.drawable.dosdivdif);
                        apunt++;
                        break;
                    case 3:
                        d.setText("En este caso 2x2 es 4, que es el número mas cercano a 5, lo ponemos bajo el numero del dividendo y restamos, quedando 1... ");
                        pasos.setImageResource(R.drawable.tresdivdif);
                        apunt++;
                        break;
                    case 4:
                        d.setText("Bajamos el 8 junto al 1 y nos da 18, debemos buscar que número multiplicado por 2 se acerca mas a 18...");
                        pasos.setImageResource(R.drawable.cuatrodivdif);
                        apunt++;
                        break;
                    case 5:
                        d.setText("En este caso 9x2 es 18, lo cual es una multiplicacion exacta...");
                        pasos.setImageResource(R.drawable.cincodivdif);
                        apunt++;
                        break;
                    case 6:
                        d.setText("Copiamos el 9 en el cociente, como el resultado de 9x2 tambien es 18, al restar el residuo nos quedará en 0, y habremos terminado...");
                        pasos.setImageResource(R.drawable.seisdivdif);
                        apunt++;
                        break;
                    case 7:
                        d.setText("¡Asi es como se divide! Tendrás que practicar bastante para dominar la division, TU PUEDES!!!");

                        apunt++;
                        break;
                    case 8:
                        pasos.setImageResource(R.drawable.suna);
                        d.setText("¡PARA EVOLUCIONAR, RECUERDA PRACTICAR!");
                        sig.setImageResource(R.drawable.volver);
                        apunt++;
                        break;
                    case 9:
                        finish();
                        break;
                }
            }
        });
    }
}