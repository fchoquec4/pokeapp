package com.example.myapplication;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MastutoActivity extends AppCompatActivity {
    ImageView pasos;
    TextView d;
    ImageButton sig;
    int apunt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mastuto);
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
                        d.setText("Tienes 3 manzanas en tu mano. ¿Cuántas manzanas tienes? 3, ¿verdad?");
                        pasos.setImageResource(R.drawable.unofacilmas);
                        apunt++;
                        break;
                    case 2:
                        d.setText("Ahora tu amigo te da 2 manzanas más. ¿Cuántas manzanas te dio? 2.");
                        pasos.setImageResource(R.drawable.dosfacilmas);
                        apunt++;
                        break;
                    case 3:
                        d.setText("Ahora juntamos las que tienes con las que te dio tu amigo. ¡Contemos juntos! 1.. 2.. 3.. tus manzanas");
                        pasos.setImageResource(R.drawable.inte);
                        apunt++;
                        break;
                    case 4:
                        d.setText("4.. 5.. las de tu amigo, ¡Tienes 5 manzanasn en total!");
                        pasos.setImageResource(R.drawable.tres);
                        apunt++;
                        break;
                    case 5:
                        d.setText("Asi es como se ve la suma en números, como puedes ver es bastante sencillo");
                        pasos.setImageResource(R.drawable.cuatro);
                        apunt++;
                        break;
                    case 6:
                        d.setText("¡Y eso es sumar! Simplemente juntas las cosas que tienes y cuentas todas juntas. ¿Lo intentas con otros números?");
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
                        editor.putBoolean("MastutoCompleted", true);
                        editor.apply();
                            finish();
                        break;
                }
            }
        });

    }
}