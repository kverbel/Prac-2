package com.arteaga.kevin.p3;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;


public class cuadro extends AppCompatActivity {
    EditText lado;
    Button calcular;
    TextView resultado;
    DecimalFormat redondear = new DecimalFormat("#.###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadro);
        lado = (EditText) findViewById(R.id.eLado);
        calcular = (Button) findViewById(R.id.bCalcular);
        resultado= (TextView) findViewById(R.id.tResult);
    }

        public void onClick(View view) {
            double a,b;
            if (lado.getText().toString().isEmpty()){
                Toast.makeText(this,getString(R.string.error1),Toast.LENGTH_LONG).show();
            }
            else{
                a=Double.parseDouble(lado.getText().toString());
                b=a*a;
                resultado.setText(getString(R.string.area)+" "+String.valueOf(redondear.format(b)));
            }
        }

}

