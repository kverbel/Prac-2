package com.arteaga.kevin.p2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    EditText enum1;
    EditText enum2;
    TextView tres;
    Button calcular;
    RadioGroup operacion ;
    DecimalFormat redondear = new DecimalFormat("#.###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        enum1 = (EditText) findViewById(R.id.eNum1);
        enum2 = (EditText) findViewById(R.id.eNum2);
        tres = (TextView) findViewById(R.id.tRes);
        calcular = (Button) findViewById(R.id.bCal);
        operacion = (RadioGroup) findViewById(R.id.rOperaciones);

        }
            public void onRadioClick(View v){
                ((RadioButton)v).setChecked(true);
            }

            public void onClick(View v) {
                double a, b, res;

                if (enum1.getText().toString().isEmpty() || enum2.getText().toString().isEmpty()){
                    Toast.makeText(this, "Ingrese correctamente los números", Toast.LENGTH_LONG).show();
                }
                else{
                    a=Float.parseFloat(enum1.getText().toString());
                    b=Float.parseFloat(enum2.getText().toString());
                    if (operacion.getCheckedRadioButtonId() == R.id.rSuma){
                        res=a+b;
                        tres.setText(String.valueOf(redondear.format(res)));
                    }
                    else if (operacion.getCheckedRadioButtonId() == R.id.rResta){
                        res=a-b;
                        tres.setText(String.valueOf(redondear.format(res)));
                    }
                    else if (operacion.getCheckedRadioButtonId() == R.id.rMul){
                        res=a*b;
                        tres.setText(String.valueOf(redondear.format(res)));
                    }
                    else if (operacion.getCheckedRadioButtonId() == R.id.rDiv){
                        res=a/b;
                        tres.setText(String.valueOf(redondear.format(res)));
                    }
                }








            }


}
