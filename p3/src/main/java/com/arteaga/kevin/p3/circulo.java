package com.arteaga.kevin.p3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;
import java.lang.Math;

public class circulo extends AppCompatActivity {
    EditText radio;
    Button calcular;
    TextView resultado;
    DecimalFormat redondear = new DecimalFormat("#.###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        radio = (EditText) findViewById(R.id.eRadio);
        calcular = (Button) findViewById(R.id.bCalcular);
        resultado= (TextView) findViewById(R.id.tResult);
    }
        public void onClick2(View view) {
            double a,b;
            if (radio.getText().toString().isEmpty()){
                Toast.makeText(this,getString(R.string.error1),Toast.LENGTH_LONG).show();
            }
            else{
                a=Double.parseDouble(radio.getText().toString());
                b=Math.PI*Math.pow(a,2);
                resultado.setText(getString(R.string.area)+" "+String.valueOf(redondear.format(b)));
            }
        }
}
