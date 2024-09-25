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

public class DivtutoM extends AppCompatActivity {
    ImageView pasos;
    TextView d;
    ImageButton sig;
    int apunt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_divtuto_m);
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
                        d.setText("Aqui tenemos una division resuelta, veamos en que consiste cada parte de esta...");
                        pasos.setImageResource(R.drawable.unodivmedio);
                        apunt++;
                        break;
                    case 2:
                        d.setText("Este es el dividendo, el número que dividiremos...");
                        pasos.setImageResource(R.drawable.dosdivmedio);
                        apunt++;
                        break;
                    case 3:
                        d.setText("Y este es el divisor, es el número que dividirá al dividendo, y debe ser menor que este...");
                        pasos.setImageResource(R.drawable.tresdivmedio);
                        apunt++;
                        break;
                    case 4:
                        d.setText("El cociente es el resultado de la división, mayormente se halla digito por digito...");
                        pasos.setImageResource(R.drawable.cuatrodivmedio);
                        apunt++;
                        break;
                    case 5:
                        d.setText("Y por ultimo el resto, cuando una division es exacta siempre será 0, caso contrario tomará otro valor...");
                        pasos.setImageResource(R.drawable.cincodivmedio);
                        apunt++;
                        break;
                    case 6:
                        d.setText("Recuerda como se llama cada uno de ellos, lo necesitarás para la dificultad DIFICIL...");
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
                        editor.putBoolean("DivtutoMCompleted", true);
                        editor.apply();
                        finish();
                        break;
                }
            }
        });
    }
}