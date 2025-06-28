package com.example.numeromagicos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class binario1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_binario1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



    }
    public void Verdadero (View v){
        int numeroObtenido = getIntent().getIntExtra("numero", 0);
        String nombre = getIntent().getStringExtra("nombre");
        int numeroElegido = getIntent().getIntExtra("numeroElegido", 0);
        int nuevoNumero=numeroObtenido+1;

        Intent intent = new Intent(getApplicationContext(),salida.class);


        intent.putExtra("numero",nuevoNumero);
        intent.putExtra("nombre", nombre);
        intent.putExtra("numeroElegido",numeroElegido);
        startActivity(intent);
    }
    public void falso(View V){
        int numeroObtenido = getIntent().getIntExtra("numero", 0);
        String nombre = getIntent().getStringExtra("nombre");
        int numeroElegido = getIntent().getIntExtra("numeroElegido", 0);

        Intent intent = new Intent(getApplicationContext(),salida.class);

        int numero=0;
        intent.putExtra("numero",numeroObtenido);
        intent.putExtra("nombre", nombre);
        intent.putExtra("numeroElegido",numeroElegido);
        startActivity(intent);
    }
}