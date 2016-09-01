package com.arteaga.kevin.p3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {
    RadioGroup figura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        figura=(RadioGroup)findViewById(R.id.rFiguras);

    }



    public void onClick(View v) {
        ((RadioButton)v).setChecked(true);


        if (figura.getCheckedRadioButtonId() == R.id.rCuadro){
            Intent intent = new Intent(v.getContext(), cuadro.class);
            startActivityForResult(intent, 0);
        }
        else if (figura.getCheckedRadioButtonId() == R.id.rTriangulo){
            Intent intent = new Intent(v.getContext(), triangulo.class);
            startActivityForResult(intent, 0);
        }
        else if (figura.getCheckedRadioButtonId() == R.id.rRectangulo){
            Intent intent = new Intent(v.getContext(), rectangulo.class);
            startActivityForResult(intent, 0);
        }
        else if (figura.getCheckedRadioButtonId() == R.id.rCirculo){
            Intent intent = new Intent(v.getContext(), circulo.class);
            startActivityForResult(intent, 0);
        }
    }
}