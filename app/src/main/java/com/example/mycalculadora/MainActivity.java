package com.example.mycalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtNro1;
    private EditText txtNro2;
    private TextView tvResultado;
    private Button btSumar;
    private Button btRestar;
    private Button btMultiplicar;
    private Button btDividir;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNro1 = findViewById(R.id.txtNro1);
        txtNro2 = findViewById(R.id.txtNro2);
        tvResultado = findViewById(R.id.tvResultado);

        btSumar = findViewById(R.id.btSumar);
        btRestar = findViewById(R.id.btRestar);
        btMultiplicar = findViewById(R.id.btMultiplicar);
        btDividir = findViewById(R.id.btDividir);

        btSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumar();
            }
        });

        btRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restar();
            }
        });

        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplicar();
            }
        });

        btDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dividir();
            }
        });

    }
    public void sumar(){
        int valor1 = Integer.parseInt(txtNro1.getText().toString());
        int valor2 = Integer.parseInt(txtNro2.getText().toString());
        tvResultado.setText(String.valueOf(valor1+valor2));
    }
    public void restar(){
        int valor1 = Integer.parseInt(txtNro1.getText().toString());
        int valor2 = Integer.parseInt(txtNro2.getText().toString());
        tvResultado.setText(String.valueOf(valor1-valor2));
    }
    public void multiplicar(){
        int valor1 = Integer.parseInt(txtNro1.getText().toString());
        int valor2 = Integer.parseInt(txtNro2.getText().toString());
        tvResultado.setText(String.valueOf(valor1*valor2));
    }
    public void dividir(){
        int valor1 = Integer.parseInt(txtNro1.getText().toString());
        int valor2 = Integer.parseInt(txtNro2.getText().toString());
        if (valor2 != 0) {
            tvResultado.setText(String.valueOf(valor1 / valor2));
        } else {
            tvResultado.setText("Error: División por cero");
        }
    }
}