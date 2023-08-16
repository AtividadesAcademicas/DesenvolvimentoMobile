package com.example.aula01;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ActivityPrincipal", "On Create executado");
        setContentView(R.layout.activity_principal);
        Log.d("ActivityPrincipal", "Tela carregada");
        View v = findViewById(R.id.bt1);
        TextView tv = (TextView) findViewById(R.id.textView2);

        if (v instanceof Button) {
            Button b = (Button) v;
            b.setOnClickListener(view -> {
                Log.d("ActivityPrincipal", "Botão clicado - arrow function");
                tv.setText("Pedro");
            });
        }

    }

    protected void onStart() {
        super.onStart();
        Log.d("ActivityPrincipal", "On Start executado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityPrincipal", "On Resume executado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityPrincipal", "On Pause executado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityPrincipal", "On Stop executado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityPrincipal", "On Destroy executado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityPrincipal", "On Restart executado");
    }
}