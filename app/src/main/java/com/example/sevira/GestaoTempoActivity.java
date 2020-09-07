package com.example.sevira;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GestaoTempoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestao_tempo);

        ((TextView)findViewById(R.id.diaSemana)).setText("Segunda-feira");

        ((TextView)findViewById(R.id.horario1)).setText(getString(R.string.nove));
        ((TextView)findViewById(R.id.horario2)).setText(getString(R.string.onzetrinta));
        ((TextView)findViewById(R.id.horario3)).setText(getString(R.string.dozetrinta));
        ((TextView)findViewById(R.id.horario4)).setText(getString(R.string.treze));
        ((TextView)findViewById(R.id.horario5)).setText(getString(R.string.treze));
        ((TextView)findViewById(R.id.horario6)).setText(getString(R.string.dezoito30));
        ((TextView)findViewById(R.id.horario7)).setText(getString(R.string.dezenovetrinta));
        ((TextView)findViewById(R.id.horario8)).setText(getString(R.string.vinteum));

        ((TextView)findViewById(R.id.atividade1)).setText(getString(R.string.atv2));
        ((TextView)findViewById(R.id.atividade2)).setText(getString(R.string.atv3));
        ((TextView)findViewById(R.id.atividade3)).setText(getString(R.string.atv4));
        ((TextView)findViewById(R.id.atividade4)).setText(getString(R.string.atv1));
        ((TextView)findViewById(R.id.atividade5)).setText(getString(R.string.atv6));
        ((TextView)findViewById(R.id.atividade6)).setText(getString(R.string.atv8));
        ((TextView)findViewById(R.id.atividade7)).setText(getString(R.string.atv10));
        ((TextView)findViewById(R.id.atividade8)).setText(getString(R.string.atv13));
    }

    public void showTerca(View v){

        ((TextView)findViewById(R.id.diaSemana)).setText("Terça-feira");


        ((TextView)findViewById(R.id.horario1)).setText(getString(R.string.oito));
        ((TextView)findViewById(R.id.horario2)).setText(getString(R.string.onzetrinta));
        ((TextView)findViewById(R.id.horario3)).setText(getString(R.string.dozetrinta));
        ((TextView)findViewById(R.id.horario4)).setText(getString(R.string.treze));
        ((TextView)findViewById(R.id.horario5)).setText(getString(R.string.quatorze));
        ((TextView)findViewById(R.id.horario6)).setText(getString(R.string.dezoito));
        ((TextView)findViewById(R.id.horario7)).setText(getString(R.string.dezenovetrinta));
        ((TextView)findViewById(R.id.horario8)).setText(getString(R.string.vinte));

        ((TextView)findViewById(R.id.atividade1)).setText(getString(R.string.atv1));
        ((TextView)findViewById(R.id.atividade2)).setText(getString(R.string.atv3));
        ((TextView)findViewById(R.id.atividade3)).setText(getString(R.string.atv4));
        ((TextView)findViewById(R.id.atividade4)).setText(getString(R.string.atv1));
        ((TextView)findViewById(R.id.atividade5)).setText(getString(R.string.atv14));
        ((TextView)findViewById(R.id.atividade6)).setText(getString(R.string.atv7));
        ((TextView)findViewById(R.id.atividade7)).setText(getString(R.string.atv5));
        ((TextView)findViewById(R.id.atividade8)).setText(getString(R.string.atv10));

    }

    public void showSabado(View v){

        ((TextView)findViewById(R.id.diaSemana)).setText("Sábado");

        ((TextView)findViewById(R.id.horario1)).setText(getString(R.string.oito));
        ((TextView)findViewById(R.id.horario2)).setText(getString(R.string.nove));
        ((TextView)findViewById(R.id.horario3)).setText(getString(R.string.treze));
        ((TextView)findViewById(R.id.horario4)).setText(getString(R.string.quatorze));
        ((TextView)findViewById(R.id.horario5)).setText(getString(R.string.dezoito));
        ((TextView)findViewById(R.id.horario6)).setText(getString(R.string.dezenovetrinta));
        ((TextView)findViewById(R.id.horario7)).setText(getString(R.string.vinte));
        ((TextView)findViewById(R.id.horario8)).setText(getString(R.string.vintedois));

        ((TextView)findViewById(R.id.atividade1)).setText(getString(R.string.atv12));
        ((TextView)findViewById(R.id.atividade2)).setText(getString(R.string.atv11));
        ((TextView)findViewById(R.id.atividade3)).setText(getString(R.string.atv4));
        ((TextView)findViewById(R.id.atividade4)).setText("Almoço na casa dos pais");
        ((TextView)findViewById(R.id.atividade5)).setText(getString(R.string.atv5));
        ((TextView)findViewById(R.id.atividade6)).setText("Visitas!");
        ((TextView)findViewById(R.id.atividade7)).setText(getString(R.string.atv10));
        ((TextView)findViewById(R.id.atividade8)).setText(getString(R.string.atv4));

    }


}