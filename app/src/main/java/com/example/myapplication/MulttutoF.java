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

public class MulttutoF extends AppCompatActivity {
    ImageView pasos;
    TextView d;
    ImageButton sig;
    int apunt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multtuto_f);
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
                        d.setText("Vamos a multiplicar 3x4 ¿Cuanto sera?");
                        pasos.setImageResource(R.drawable.unomultfacil);
                        apunt++;
                        break;
                    case 2:
                        d.setText("3×4 significa que sumamos el número 3 pero 4 veces.");
                        pasos.setImageResource(R.drawable.unomultfacil);
                        apunt++;
                        break;
                    case 3:
                        d.setText("El resultado es 12, es asi de facil, entonces 3x4 es 12 ");
                        pasos.setImageResource(R.drawable.dosmultfacil);
                        apunt++;
                        break;
                   case 4:
                        d.setText("Si quieres verlo de otra forma, imagina que tienes 4 grupos de 3 pokebolas, si sumas todos te dara 12");
                        pasos.setImageResource(R.drawable.tresmultfacil);
                        apunt++;
                        break;
                    case 5:
                        d.setText("Si deseas multiplicar digitos de uno mas rapido, memorizaremos la tabla de multiplicar despues.");
                        pasos.setImageResource(R.drawable.tresmultfacil);
                        apunt++;
                        break;
                    case 6:
                        d.setText("Pero de momento, ¡Eso es multiplicar! ");
                        pasos.setImageResource(R.drawable.suna);
                        apunt++;
                        break;
                    case 7:

                        d.setText("¡DIFICULTAD MEDIA DESBLOQUEADA!");
                        sig.setImageResource(R.drawable.volver);
                        apunt++;
                        break;
                    case 8:
                        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                        SharedPreferences.Editor editor = prefs.edit();
                        editor.putBoolean("PortutoCompleted", true);
                        editor.apply();
                        finish();
                        break;
                }
            }
        });
    }
}