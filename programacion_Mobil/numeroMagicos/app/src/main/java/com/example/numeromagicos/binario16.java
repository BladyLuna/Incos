package com.example.numeromagicos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class binario16 extends AppCompatActivity {
    int numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_binario16);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public void Verdadero (View v){

        Intent intent = new Intent(getApplicationContext(),binario8.class);
        String nombre = getIntent().getStringExtra("nombre");
        int numeroElegido = getIntent().getIntExtra("numeroElegido", 0);
        int numero=16;

        intent.putExtra("numero",numero);
        intent.putExtra("nombre", nombre);
        intent.putExtra("numeroElegido",numeroElegido);
        startActivity(intent);
    }
    public void falso(View V){
        Intent intent = new Intent(getApplicationContext(),binario8.class);
        String nombre = getIntent().getStringExtra("nombre");
        int numeroElegido = getIntent().getIntExtra("numeroElegido", 0);
        int numero=0;
        intent.putExtra("numero",numero);
        intent.putExtra("nombre", nombre);
        intent.putExtra("numeroElegido",numeroElegido);
        startActivity(intent);
    }
}