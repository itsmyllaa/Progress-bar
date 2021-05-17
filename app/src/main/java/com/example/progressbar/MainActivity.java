package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {


    private ProgressBar progressBarHorizontal;
    private ProgressBar progressBarCircular;
    private  int progresso = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBarCircular = findViewById(R.id.progressBarCircular);
        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);

        //Barra de progresso circular oculta ao inicio do programa, só será iniciada durante o carregamento.
        progressBarCircular.setVisibility(View.GONE);

    }

    public void carregarProgressBar(View view){

        //ProgressBar horizontal
        this.progresso = this.progresso + 1;
        progressBarHorizontal.setProgress(this.progresso);
        //ProgressBar circular
        progressBarCircular.setVisibility(View.VISIBLE);

        //uso do if para uma condição referente a visibilidade da barra de progresso circular
        if (this.progresso == 10){
            progressBarCircular.setVisibility(View.GONE);
        }

    }


}
