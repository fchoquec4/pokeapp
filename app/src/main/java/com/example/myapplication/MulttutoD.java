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

public class MulttutoD extends AppCompatActivity {
    ImageView pasos;
    TextView d;
    ImageButton sig;
    int apunt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multtuto_d);
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
                        d.setText("Veremos como multiplicar 23x15, ambos numeros de dos digitos...");
                        pasos.setImageResource(R.drawable.unomultdif);
                        apunt++;
                        break;
                    case 2:
                        d.setText("Debemos multiplicar el primer digito del segundo número por todos los números del primer número uno por uno (23x5)...");
                        pasos.setImageResource(R.drawable.dosmultdif);
                        apunt++;
                        break;
                    case 3:
                        d.setText("Para eso primero multiplicamos los numeros marcados, 5x3 es 15, al igual que la suma, la decena pasa a la siguiente columna...");
                        pasos.setImageResource(R.drawable.tresmultdif);
                        apunt++;
                        break;
                    case 4:
                        d.setText("Seguimos multiplicando asi, 5x2 es 10, pero es importante sumar el número que nos sobró de la anterior operación");
                        pasos.setImageResource(R.drawable.cuatromultdif);
                        apunt++;
                        break;
                    case 5:
                        d.setText("Como no quedan mas columnas, copiamos los dos digitos del numero en orden...");
                        pasos.setImageResource(R.drawable.cincomultdif);
                        apunt++;
                        break;
                    case 6:
                        d.setText("Ya que acabamos, pasamos al siguiente digito (23x1) y recorremos una columna...");
                        pasos.setImageResource(R.drawable.seismultdif);
                        apunt++;
                        break;
                    case 7:
                        d.setText("Luego hacemos exactamente lo mismo, multiplicamos uno por uno, copiamos recorriendo una columna formando una escalera...");
                        pasos.setImageResource(R.drawable.sietemultdif);
                        apunt++;
                        break;
                    case 8:
                        d.setText("Proseguimos asi hasta terminar con todos los números, en este caso 23x1 es 23, por eso calculamos el mismo número..");
                        pasos.setImageResource(R.drawable.ochomultdif);
                        apunt++;
                        break;
                    case 9:
                        d.setText("Para finalizar, sumamos ambos calculos, y tendremos nuestro resultado final");
                        pasos.setImageResource(R.drawable.nuevemultdif);
                        apunt++;
                        break;
                    case 10:
                        d.setText("Multiplicar en papel es dificil, pero con práctica puedes dominar lo que sea...");

                        apunt++;
                        break;
                    case 11:
                        pasos.setImageResource(R.drawable.suna);
                        d.setText("¡PARA EVOLUCIONAR, RECUERDA PRACTICAR!");
                        sig.setImageResource(R.drawable.volver);
                        apunt++;
                        break;
                    case 12:
                        finish();
                        break;
                }
            }
        });
    }
}