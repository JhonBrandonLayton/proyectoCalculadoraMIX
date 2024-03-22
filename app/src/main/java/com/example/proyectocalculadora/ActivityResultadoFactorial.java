package com.example.proyectocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityResultadoFactorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_factorial);

        //usar getIntent con getStringExtra para obtener el resultado por medio de String
        String resultadoFactorial = getIntent().getStringExtra("resultadoFactorial");

        //crear vista del textview
        TextView textViewResultadoFactorial = findViewById(R.id.textViewResultadoFactorial);

        //mostrar resultado en el textview
        textViewResultadoFactorial.setText("Secuencia Factorial: " + resultadoFactorial);

        //crear vista del ImageView
        ImageView regresarIcono = findViewById(R.id.regresarIcono);

        //crear onClickListener
        regresarIcono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }




}