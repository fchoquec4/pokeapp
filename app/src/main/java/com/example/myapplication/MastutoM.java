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

public class MastutoM extends AppCompatActivity {
    ImageView pasos;
    TextView d;
    ImageButton sig;
    int apunt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mastuto_m);
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
                        d.setText("Para sumar 2 numeros de dos digitos, primero sumamos las decenas y luego las unidades, de izquierda a derecha");
                        pasos.setImageResource(R.drawable.unomediosuma);
                        apunt++;
                        break;
                    case 2:
                        d.setText("Comenzamos por la izquierda (las unidades) calculando la suma de 3 + 5");
                        pasos.setImageResource(R.drawable.dosmediosuma);
                        apunt++;
                        break;
                    case 3:
                        d.setText("El resultado es 8, es asi de facil, copiamos el resultado y proseguimos");
                        pasos.setImageResource(R.drawable.tresmediosuma);
                        apunt++;
                        break;
                    case 4:
                        d.setText("Ahora hacemos lo mismo con las decenas, en este caso sumamos 2+1.");
                        pasos.setImageResource(R.drawable.cuatromediosuma);
                        apunt++;
                        break;
                    case 5:
                        d.setText("2+1 es 3, como ya no hay numeros que sumar, el resultado final es 38");
                        pasos.setImageResource(R.drawable.cincomediosuma);
                        apunt++;
                        break;
                    case 6:
                        d.setText("¡Y eso es sumar con dos digitos! En la siguiente dificultad veremos que pasa cuando la suma de dos numeros excede a 10.");
                        pasos.setImageResource(R.drawable.seismediosuma);
                        apunt++;
                        break;
                    case 7:
                        pasos.setImageResource(R.drawable.suna);
                        d.setText("¡DIFICULTAD DIFICIL DESBLOQUEADA!");
                        sig.setImageResource(R.drawable.volver);
                        apunt++;
                        break;
                    case 8:
                        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                        SharedPreferences.Editor editor = prefs.edit();
                        editor.putBoolean("MastutoMCompleted", true);
                        editor.apply();
                            finish();
                        break;
                }
            }
        });
    }
}