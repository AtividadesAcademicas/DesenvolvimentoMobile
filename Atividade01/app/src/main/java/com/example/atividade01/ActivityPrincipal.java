package com.example.atividade01;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityPrincipal extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        Log.d("ActivityPrincipal", "onCreate executado");
        setContentView(R.layout.activity_principal);
        Log.d("ActivityPrincipal", "View carregada");

        View view = findViewById(R.id.btSalvar);
        EditText nome = (EditText) findViewById(R.id.InputNome);
        EditText email = (EditText) findViewById(R.id.InputEmail);
        EditText telefone = (EditText) findViewById(R.id.InputTelefone);

        if (view instanceof Button) {
            Button bt = (Button) view;
            bt.setOnClickListener(v -> {
                Log.d("ActivityPrincipal", "Botão Salvar clicado");
                Log.d("ActivityPrincipal", "Nome: " + nome.getText().toString());
                Log.d("ActivityPrincipal", "Email: " + email.getText().toString());
                Log.d("ActivityPrincipal", "Telefone: " + telefone.getText().toString());
            });
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityPrincipal", "onStart executado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityPrincipal", "onResume executado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityPrincipal", "onPause executado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityPrincipal", "onStop executado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityPrincipal", "onDestroy executado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityPrincipal", "onRestart executado");
    }
}
