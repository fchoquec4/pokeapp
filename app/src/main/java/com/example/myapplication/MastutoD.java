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

public class MastutoD extends AppCompatActivity {
    ImageView pasos;
    TextView d;
    ImageButton sig;
    int apunt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mastuto_d);
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
                        d.setText("En este caso practicaremos con la suma de 48 + 75");
                        pasos.setImageResource(R.drawable.unodifsuma);
                        apunt++;
                        break;
                    case 2:
                        d.setText("Como la anterior dificultad comenzamos por la izquierda, sumamos 8+5, el resultado da 13, que hacemos en este caso?");
                        pasos.setImageResource(R.drawable.dosdifsuma);
                        apunt++;
                        break;
                    case 3:
                        d.setText("Ya que tenemos un resultado de dos digitos, debemos llevar el digito de la decena a la derecha.");
                        pasos.setImageResource(R.drawable.tresdifsuma);
                        apunt++;
                        break;
                    case 4:
                        d.setText("Ahora sumamos la otra columna, junto con el digito que trajimos de la anterior suma");
                        pasos.setImageResource(R.drawable.cuatrodifsuma);
                        apunt++;
                        break;
                    case 5:
                        d.setText("1 + 4 + 7 es 12, ya que no quedan mas columnas que sumar, copiamos todo el digito completo en orden.");
                        pasos.setImageResource(R.drawable.cincodifsuma);
                        apunt++;
                        break;
                    case 6:
                        d.setText("Asi debes sumar dos digitos cuando la suma de alguna de las columnas excede a 9");
                       // pasos.setImageResource(R.drawable.);
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