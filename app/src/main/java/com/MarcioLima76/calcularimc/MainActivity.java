package com.MarcioLima76.calcularimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private EditText editPeso;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textResultado = findViewById(R.id.textResultado);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);

    }

    public void calcularIMC(View view){

    double peso = Double.parseDouble(editPeso.getText().toString());
    double altura = Double.parseDouble(editAltura.getText().toString());
    double resultado = peso / (altura * altura);

    if(resultado < 19){
        textResultado.setText("Você está abaixo do peso ideal!");

    }else if(resultado <= 19 || resultado < 25){
        textResultado.setText("Você está com o peso ideal!");
    }else if(resultado <= 25 || resultado < 30){
        textResultado.setText("Você está acima do peso ideal!");
    }else if(resultado <= 30 || resultado < 40){
        textResultado.setText("Você está com Obesidade Tipo I");
    }else if(resultado >=40){
        textResultado.setText("Você está com Obesidade Tipo II!");
    }


    }

}