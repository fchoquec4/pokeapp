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

public class DivtutoF extends AppCompatActivity {
    ImageView pasos;
    TextView d;
    ImageButton sig;
    int apunt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_divtuto_f);
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
                        d.setText("Vamos a dividir 8÷2, imagina que vamos a repartir uno por uno los 8 caramelos a 2 personas");
                        pasos.setImageResource(R.drawable.unodivfacil);
                        apunt++;
                        break;
                    case 2:
                        d.setText("Repartimos 1 a cada uno...");
                        pasos.setImageResource(R.drawable.dosdivfacil);
                        apunt++;
                        break;
                    case 3:
                        d.setText("Luego otro a cada uno, ahora ambos tienen 2...");
                        pasos.setImageResource(R.drawable.tresdivfacil);
                        apunt++;
                        break;
                    case 4:
                        d.setText("Asi sucesivamente, seguimos repartiendo 1 a cada uno");
                        pasos.setImageResource(R.drawable.cuatrodivfacil);
                        apunt++;
                        break;
                    case 5:
                        d.setText("Ya acabamos, al final cada uno se quedó con 4 caramelos");
                        pasos.setImageResource(R.drawable.cincodivfacil);
                        apunt++;
                        break;
                    case 6:
                        d.setText("Eso significa que el resultado final de 8÷2 es 4...");
                        pasos.setImageResource(R.drawable.seisdivfacil);
                        apunt++;
                        break;
                    case 7:
                        d.setText("¡Y asi se dividen dos digitos! Pasaremos directamente a la dificultad difícil, asi que preparate...");
                        pasos.setImageResource(R.drawable.sietedivfacil);
                        apunt++;
                        break;
                    case 8:
                        pasos.setImageResource(R.drawable.suna);
                        d.setText("¡DIFICULTAD MEDIA DESBLOQUEADA!");
                        sig.setImageResource(R.drawable.volver);
                        apunt++;
                        break;
                    case 9:
                        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                        SharedPreferences.Editor editor = prefs.edit();
                        editor.putBoolean("DivtutoCompleted", true);
                        editor.apply();
                        finish();
                        break;
                }
            }
        });
    }
}