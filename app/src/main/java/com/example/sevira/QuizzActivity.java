package com.example.sevira;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuizzActivity extends AppCompatActivity {
    private static int questionsQtde = 6;
    private int nQuestion;
    String[] questions = new String[6];
    String[][] answersText = new String[6][4];
    int[] correctAnswers = {1, 2, 3, 0, 1, 2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);

            questions[0] = getString(R.string.questao1);
            questions[1] = getString(R.string.questao2);
            questions[2] = getString(R.string.questao3);
            questions[3] = getString(R.string.questao4);
            questions[4] = getString(R.string.questao5);
            questions[5] = getString(R.string.questao6);

            answersText[0] = new String[]{getString(R.string.a1), getString(R.string.b1), getString(R.string.c1), getString(R.string.d1)};
            answersText[1] = new String[]{getString(R.string.a2), getString(R.string.b2), getString(R.string.c2), getString(R.string.d2)};
            answersText[2] = new String[]{getString(R.string.a3), getString(R.string.b3), getString(R.string.c3), getString(R.string.d3)};
            answersText[3] = new String[]{getString(R.string.a4), getString(R.string.b4), getString(R.string.c4), getString(R.string.d4)};
            answersText[4] = new String[]{getString(R.string.a5), getString(R.string.b5), getString(R.string.c5), getString(R.string.d5)};
            answersText[5] = new String[]{getString(R.string.a6), getString(R.string.b6), getString(R.string.c6), getString(R.string.d6)};


        nQuestion = 0;
        updateQuizz(nQuestion);
    }

    @SuppressLint("ResourceType")
    public void updateQuizz(int i){
        ((TextView)findViewById(R.id.quizzQuestion)).setText(questions[nQuestion]);
        ((RadioButton)findViewById(R.id.alternativaA)).setText(answersText[nQuestion][0]);
        ((RadioButton)findViewById(R.id.alternativaB)).setText(answersText[nQuestion][1]);
        ((RadioButton)findViewById(R.id.alternativaC)).setText(answersText[nQuestion][2]);
        ((RadioButton)findViewById(R.id.alternativaD)).setText(answersText[nQuestion][3]);

        ((RadioButton)findViewById(R.id.alternativaA)).setChecked(false);
        ((RadioButton)findViewById(R.id.alternativaB)).setChecked(false);
        ((RadioButton)findViewById(R.id.alternativaC)).setChecked(false);
        ((RadioButton)findViewById(R.id.alternativaD)).setChecked(false);

        ((RadioButton)findViewById(R.id.alternativaA)).setBackgroundColor(Color.parseColor(getString(R.color.azul)));
        ((RadioButton)findViewById(R.id.alternativaB)).setBackgroundColor(Color.parseColor(getString(R.color.azul)));;
        ((RadioButton)findViewById(R.id.alternativaC)).setBackgroundColor(Color.parseColor(getString(R.color.azul)));
        ((RadioButton)findViewById(R.id.alternativaD)).setBackgroundColor(Color.parseColor(getString(R.color.azul)));
    }

    public void proximaAcao(View v){
        if (nQuestion < (questionsQtde - 1)){
            nQuestion++;
            updateQuizz(nQuestion);
        }else{
            startActivity(new Intent(QuizzActivity.this, PrincipalActivity.class));
        }
    }

    @SuppressLint("ResourceType")
    public void mostrarResposta(View v){

        switch(correctAnswers[nQuestion]){
            case 0:
                ((RadioButton)findViewById(R.id.alternativaA)).setBackgroundColor(Color.parseColor(getString(R.color.coral)));
                break;
            case 1:
                ((RadioButton)findViewById(R.id.alternativaB)).setBackgroundColor(Color.parseColor(getString(R.color.coral)));
                break;
            case 2:
                ((RadioButton)findViewById(R.id.alternativaC)).setBackgroundColor(Color.parseColor(getString(R.color.coral)));
                break;
            case 3:
                ((RadioButton)findViewById(R.id.alternativaD)).setBackgroundColor(Color.parseColor(getString(R.color.coral)));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + correctAnswers[nQuestion]);
        }
    }
}