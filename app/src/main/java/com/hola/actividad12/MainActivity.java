package com.hola.actividad12;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText txt1;
    private Button botonGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.txt1);
        botonGuardar = findViewById(R.id.botonGuardar);

        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarDatos();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void enviarDatos() {
        String texto = txt1.getText().toString().trim();

        // Validar que los campos no estén vacíos
        if (texto.isEmpty()) {
            // Mostrar mensaje de error si algún campo está vacío
            txt1.setError("Campo obligatorio");
            return;
        } else {

            // Crear intent y enviar datos
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            intent.putExtra("Texto1", texto);

            startActivity(intent);
        }
    }
}