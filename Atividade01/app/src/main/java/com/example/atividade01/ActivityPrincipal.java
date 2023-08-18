package com.example.atividade01;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityPrincipal extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        Log.d("ActivityPrincipal", "onCreate executado");
        setContentView(R.layout.activity_principal);
        Log.d("ActivityPrincipal", "View carregada");
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
