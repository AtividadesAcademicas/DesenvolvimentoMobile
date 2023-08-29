package com.example.atividade02;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityCalculadoraIMC extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        Log.d("ActivityCalculadoraIMC", "onCreate executado");
        setContentView(R.layout.activity_imc);
        Log.d("ActivityCalculadoraIMC", "View carregada");

        View view = findViewById(R.id.btCacularIMC);
        EditText altura = (EditText) findViewById(R.id.InputAltura);
        EditText peso = (EditText) findViewById(R.id.InputPeso);
        TextView imcTxt = (TextView) findViewById(R.id.OutputIMC);

        if (view instanceof Button) {
            Button bt = (Button) view;
            bt.setOnClickListener(v -> {
                Double imc = Double.parseDouble(peso.getText().toString()) / (Double.parseDouble(altura.getText().toString()) * Double.parseDouble(altura.getText().toString()));
                if(imc<17) {
                    imcTxt.setBackgroundColor(Color.RED);
                    imcTxt.setText("Muito abaixo do peso");
                }
                if(imc>17&&imc<18.49) {
                    imcTxt.setBackgroundColor(Color.YELLOW);
                    imcTxt.setText("Abaixo do peso");
                }
                if(imc>18.5&&imc<24.99) {
                    imcTxt.setBackgroundColor(Color.GREEN);
                    imcTxt.setText("Peso normal");
                }
                if(imc>25&&imc<29.99) {
                    imcTxt.setBackgroundColor(Color.YELLOW);
                    imcTxt.setText("Acima do peso");
                }
                if(imc>30&&imc<34.99) {
                    imcTxt.setBackgroundColor(Color.rgb(255,165,0));
                    imcTxt.setText("Obesidade I");
                }
                if(imc>35&&imc<39.99) {
                    imcTxt.setBackgroundColor(Color.RED);
                    imcTxt.setText("Obesidade II (severa)");
                }
                if(imc>40) {
                    imcTxt.setBackgroundColor(Color.RED);
                    imcTxt.setText("Obesidade III (mórbida)");
                }
            });
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityCalculadoraIMC", "onStart executado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityCalculadoraIMC", "onResume executado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityCalculadoraIMC", "onPause executado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityCalculadoraIMC", "onStop executado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityCalculadoraIMC", "onDestroy executado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityCalculadoraIMC", "onRestart executado");
    }
}