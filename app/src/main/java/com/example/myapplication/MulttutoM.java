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

public class MulttutoM extends AppCompatActivity {
    ImageView pasos;
    TextView d;
    ImageButton sig;
    int apunt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multtuto_m);
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
                        d.setText("Las tablas de multiplicar es algo que verás frecuentemente en primaria, comunmente las del 1 al 10...");
                        pasos.setImageResource(R.drawable.unomultmedio);
                        apunt++;
                        break;
                    case 2:
                        d.setText("La tabla del 1 es sencilla, esta es la tabla del 2, donde todos los resultados se van sumando de 2 en 2...");
                        pasos.setImageResource(R.drawable.dosmultmedio);
                        apunt++;
                        break;
                    case 3:
                        d.setText("La tabla del 3 es donde aumenta la dificultad, yendo de 3 en 3....");
                        pasos.setImageResource(R.drawable.tresmultmedio);
                        apunt++;
                        break;
                    case 4:
                        d.setText("La tabla del 4 es la ultima que veremos el dia de hoy, recuerda repasar todas las tablas hasta dominarlas de memoria...");
                        pasos.setImageResource(R.drawable.cuatromultmedio);
                        apunt++;
                        break;
                    case 5:
                        d.setText("Pidele a un familiar que te pregunte la multiplicación de dos números de un digito, asi memorizarás mas rápido...");
                        pasos.setImageResource(R.drawable.cincomultmedio);
                        apunt++;
                        break;
                    case 6:
                        d.setText("¡Y esas son las tablas de multiplicar! Cuando las domines, aprenderemos como multiplicar numeros de dos o mas digitos.");
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
                        editor.putBoolean("PortutoMCompleted", true);
                        editor.apply();
                        finish();
                        break;
                }
            }
        });
    }
}