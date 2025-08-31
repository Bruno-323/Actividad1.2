package com.hola.actividad12;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {

    private TextView Datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Datos = findViewById(R.id.datos);
        // Recibir datos del intent
        recibirDatos();
    }

    private void recibirDatos() {
        Intent intent = getIntent();

        if (intent != null) {
            String Texto = intent.getStringExtra("Texto1");

            Datos.setText(Texto);

            // Mostrar también un Toast con los datos recibidos
            Toast.makeText(this, "Datos recibidos correctamente", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "No se recibieron datos", Toast.LENGTH_SHORT).show();
        }
    }

}