package com.devst.app;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        TextView tvTitulo = findViewById(R.id.tvTitulo);
        TextView tvDesc   = findViewById(R.id.tvDesc);

        String titulo = getIntent().getStringExtra("titulo");
        String desc   = getIntent().getStringExtra("descripcion");

        tvTitulo.setText(titulo != null ? titulo : "Detalle");
        tvDesc.setText(desc != null ? desc : "Sin descripción.");
    }
}
