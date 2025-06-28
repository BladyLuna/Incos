package com.example.numeromagicos;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class lobby extends AppCompatActivity {
    EditText etNombre;
    EditText etNumero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lobby);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etNombre = findViewById(R.id.et_Nombre);
        etNumero = findViewById(R.id.et_numeroElegido);
    }
    public void irAjugar(View v){
        Intent it = new Intent(getApplicationContext(),binario16.class);
        String nombre = etNombre.getText().toString();
        int numeroElegido = Integer.parseInt(etNumero.getText().toString());
        it.putExtra("nombre", nombre);
        it.putExtra("numeroElegido",numeroElegido );
        startActivity(it);
    }
}