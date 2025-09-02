package com.hola.actividad12;
// Benjamin Rodriguez,Bruno Guajardo
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
        recibirDatos();
    }

    private void recibirDatos() {
        //Recibe datos del intent
        Intent intent = getIntent();

        if (intent != null) {
            String Texto = intent.getStringExtra("Texto1");

            Datos.setText(Texto);

            Toast.makeText(this, "Datos recibidos", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "No se recibieron los datos", Toast.LENGTH_LONG).show();
        }
    }

}