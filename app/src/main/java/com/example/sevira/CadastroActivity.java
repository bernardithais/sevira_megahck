package com.example.sevira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void cancelarCadastro(View v){
        this.finish();
    }

    public void completarCadastro(View v){
        startActivity(new Intent(CadastroActivity.this, QuizzActivity.class));
        this.finish();
    }

    public void launchCadastroEmpresa(View v){
        startActivity(new Intent(CadastroActivity.this, EmpresaActivity.class));
    }
}