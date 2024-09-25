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

public class MenostutoD extends AppCompatActivity {
    ImageView pasos;
    TextView d;
    ImageButton sig;
    int apunt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menostuto_d);
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
                        d.setText("¿Cual será el resultado de 43-27?");
                        pasos.setImageResource(R.drawable.unorestadif);
                        apunt++;
                        break;
                    case 2:
                        d.setText("Comenzamos por la izquierda, pero aqui no podemos restar porque 3 es menor a 7");
                        pasos.setImageResource(R.drawable.dosrestadif);
                        apunt++;
                        break;
                    case 3:
                        d.setText("Le pediremos prestado al número de al lado, convirtiendo nuestro tres en trece, como el otro número nos prestó le restamos -1");
                        pasos.setImageResource(R.drawable.tresrestadif);
                        apunt++;
                        break;
                    case 4:
                        d.setText("Con esto, ahora si podemos restar, 13-7 es 6, copiamos el resultado");
                        pasos.setImageResource(R.drawable.cuatrorestadif);
                        apunt++;
                        break;
                    case 5:
                        d.setText("Continuamos con la siguiente columna, como nos pedimos prestados 1 de 4, este se convirtió en 3, concluyendo con la operación.");
                        pasos.setImageResource(R.drawable.cincorestadif);
                        apunt++;
                        break;
                    case 6:
                        d.setText("¡Y eso es restar con dos digitos pidiendo prestado! Recuerda que solo puedes pedirte prestado de los números de la parte superior.");
                        pasos.setImageResource(R.drawable.seisrestadif);
                        apunt++;
                        break;
                    case 7:
                        pasos.setImageResource(R.drawable.suna);
                        d.setText("¡PARA EVOLUCIONAR, RECUERDA PRACTICAR!");
                        sig.setImageResource(R.drawable.volver);
                        apunt++;
                        break;
                    case 8:
                        finish();
                        break;
                }
            }
        });
    }
}