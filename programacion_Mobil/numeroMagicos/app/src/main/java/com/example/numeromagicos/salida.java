package com.example.numeromagicos;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class salida extends AppCompatActivity {

    TextView nuemroAdvinado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_salida);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        nuemroAdvinado = findViewById(R.id.txt_nuemroAdvinado);

        int numeroObtenido = getIntent().getIntExtra("numero", 0);
        String nombre = getIntent().getStringExtra("nombre");
        int numeroElegido = getIntent().getIntExtra("numeroElegido", 0);
        String cadenaRespuesta = "";
        if (numeroObtenido == numeroElegido) {
            cadenaRespuesta = "FELICITACIONES\n adivine tu numero es:  \n" + numeroObtenido + "\n este es tu numero adivinado:  " + nombre;
        } else {
            cadenaRespuesta = "vuelva a intentar" + "tu numero era: \n" + numeroObtenido + "  \nno logramos adivinar tu numero";
        }
        nuemroAdvinado.setText(cadenaRespuesta);

    }
        public void volverJugar(View V ) {
            Intent intent = new Intent(getApplicationContext(),lobby.class);
            String nombre = "";
            int numeroElegido = 0;
            //String nombre = getIntent().getStringExtra("nombre");
            //int numeroElegido = getIntent().getIntExtra("numeroElegido", 0);
            intent.putExtra("nombre", nombre);
            intent.putExtra("numeroElegido",numeroElegido);
            startActivity(intent);
        }
    }


