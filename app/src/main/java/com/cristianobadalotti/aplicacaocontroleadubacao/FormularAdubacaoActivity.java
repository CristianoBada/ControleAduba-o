package com.cristianobadalotti.aplicacaocontroleadubacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import java.text.DecimalFormat;

public class FormularAdubacaoActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView textView;
    private TextView textView3;
    private TextView textView4;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    private TextView textView13;
    private TextView textView11;
    private TextView textView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formular_adubacao);

        textView = findViewById(R.id.textView);
        seekBar = findViewById(R.id.seekBar);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView13 = findViewById(R.id.textView13);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int x = i/10;
                if ( x == 0) {
                    x = 10;
                } else {
                    x = x * 10;
                }
                int y = i - x;

                if (y > 0) {
                    x = x + 10;
                }
                textView.setText("Quantidade: " + x + " litros");
                double z = (double) x/100;

                DecimalFormat df = new DecimalFormat("###0.00");

                textView3.setText("OLIGOGREEN: " + (int)(500*z) + "g");
                textView4.setText("KINGLIFE 6-16-36+1,2MG+MICRO: " + df.format(17*z) + "Kg");
                textView6.setText("MOLYSTAR: " + (int)(100*z) + "ml");
                textView7.setText("SULFATO DE MAGNÉO: " + df.format(7.5*z) + "kg");
                textView8.setText("VIT-ORG: " + df.format(2*z) + "L");
                textView9.setText("SULFATO DE AMÓNIO 21%: " + df.format(8*z) + "Kg");
                textView11.setText("NITRATO DE CÁLCIO: " + df.format(21*z) + "Kg");
                textView12.setText("FISIOCAL: " + df.format(6*z) + "Kg");
                textView13.setText("KELAMYTH MP6: " + df.format(1*z) + "Kg");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                textView.setText("Quantidade: 10 litros");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


}
