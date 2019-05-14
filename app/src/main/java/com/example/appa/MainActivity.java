package com.example.appa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void darLaVuelta(View view){
        //TODO Evento del Boton
        int id_vista = view.getId();
        EditText editText = findViewById(R.id.entrada_usuario);
        String texto_introducido = editText.getText().toString();
        Log.d("Miapp", "Texto Intro:"+texto_introducido);

        TextView texto_salida = findViewById(R.id.salida_usuario);

        texto_salida.setText( new StringBuilder(texto_introducido).reverse());

    }
}
