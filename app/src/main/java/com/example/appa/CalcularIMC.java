package com.example.appa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CalcularIMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MIAPP", "Estoy en onCreate");
        setContentView(R.layout.activity_calcular_imc);
        ImageView img = (ImageView) findViewById(R.id.img);
        img.setImageResource(R.mipmap.ic_launcher);
    }

    public void calcular(View view){
        EditText peso = findViewById(R.id.peso);
        EditText altura = findViewById(R.id.altura);

        Float p = peso.getText().length()<1 ? 0 : Float.parseFloat( peso.getText().toString());
        Float a = altura.getText().length() <1 ? 0 : Float.parseFloat( altura.getText().toString());

        Float r = p / (a * a);

        TextView resultado = findViewById(R.id.resultado);
        resultado.setText( estado(r));
    }

    public String estado(Float res){
        ImageView img = (ImageView) findViewById(R.id.img);
        String es = "IMC " + res + ": ";
        if (res < 16){
            es += getResources().getString(R.string.faltapeso);
            img.setImageResource(R.drawable.imc05);
        } else if (res < 18) {
            img.setImageResource(R.drawable.imc04);
            es += "Delgado";
        } else if (res < 25) {
            img.setImageResource(R.drawable.imc03);
            es += "Peso ideal";
        } else if (res < 31) {
            img.setImageResource(R.drawable.imc02);
            es += "Sobrepeso";
        } else  {
            img.setImageResource(R.drawable.imc01);
            es += "Obeso";
        }
        return es;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MIAPP", "Estoy en onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MIAPP", "Estoy en onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MIAPP", "Estoy en onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MIAPP", "Estoy en onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MIAPP", "Estoy en onDestroy");
    }
}
