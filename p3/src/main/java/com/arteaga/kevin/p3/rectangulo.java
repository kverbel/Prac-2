package com.arteaga.kevin.p3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

public class rectangulo extends AppCompatActivity {
    EditText base;
    EditText altura;
    Button calcular;
    TextView resultado;
    DecimalFormat redondear = new DecimalFormat("#.###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        altura = (EditText) findViewById(R.id.eAltura) ;
        base = (EditText) findViewById(R.id.eBase);
        calcular = (Button) findViewById(R.id.bCalcular);
        resultado= (TextView) findViewById(R.id.tResult);
    }

    public void onClick3(View view) {
        double a,b,c;
        if (base.getText().toString().isEmpty()){
            Toast.makeText(this,getString(R.string.error2),Toast.LENGTH_LONG).show();
        }
        else{
            a=Double.parseDouble(base.getText().toString());
            b=Double.parseDouble(altura.getText().toString());
            c=a*b;
            resultado.setText(getString(R.string.area)+" "+String.valueOf(redondear.format(c)));
        }
    }
}
