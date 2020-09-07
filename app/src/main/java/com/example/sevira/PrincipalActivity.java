package com.example.sevira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void launchGestaoTempo(View v){
        startActivity(new Intent(PrincipalActivity.this, GestaoTempoActivity.class));
    }

    public void launchInfos(View v){
        startActivity(new Intent(PrincipalActivity.this, InformacoesActivity.class));
    }

    public void launchListaEmpreendedoras(View v){
        startActivity(new Intent(PrincipalActivity.this, ListaEmpreendedorasActivity.class));
    }
}