package com.arteaga.kevin.p4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText log;
    EditText pass1;
    EditText pass2;
    EditText email;
    EditText pass3;
    RadioGroup sexo;
    DatePicker fecha;
    CheckBox musica;
    CheckBox deporte;
    CheckBox viajes;
    CheckBox compras;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;
    TextView t9;
    TextView t10;
    TextView t11;
    TextView t12;
    TextView t13;
    String loggin, con1,con2,con3,correo,sex,ciudad,mus,dep,via,com;
    String[] ciudades = { "Ninguna", "Barranquilla", "Bógota", "Bucaramanga", "Cali", "Medellín", "Montería", "Sincelejo", "Pereira"};
    int dia, mes, año;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log=(EditText)findViewById(R.id.eLoggin);
        pass1=(EditText)findViewById(R.id.ePassword1);
        pass2=(EditText)findViewById(R.id.ePassword2);
        email=(EditText)findViewById(R.id.eCorreo);
        pass3=(EditText)findViewById(R.id.ePassword3);
        sexo=(RadioGroup)findViewById(R.id.rSexo);
        fecha = (DatePicker) findViewById(R.id.dFecha);
        musica=(CheckBox)findViewById(R.id.cMusica);
        deporte=(CheckBox)findViewById(R.id.cDeporte);
        viajes=(CheckBox)findViewById(R.id.cViajes);
        compras=(CheckBox)findViewById(R.id.cCompras);
        t1=(TextView)findViewById(R.id.tLoggin);
        t2=(TextView)findViewById(R.id.tPass1);
        t3=(TextView)findViewById(R.id.tPass2);
        t4=(TextView)findViewById(R.id.tEmail);
        t5=(TextView)findViewById(R.id.tPass3);
        t6=(TextView)findViewById(R.id.tSex);
        t7=(TextView)findViewById(R.id.tFecha);
        t8=(TextView)findViewById(R.id.tCiudad);
        t9=(TextView)findViewById(R.id.tMus);
        t10=(TextView)findViewById(R.id.tDep);
        t11=(TextView)findViewById(R.id.tVia);
        t12=(TextView)findViewById(R.id.tCom);
        t13=(TextView)findViewById(R.id.tTittle);
        Spinner spciudades = (Spinner) findViewById (R.id.sCiudad);

        ArrayAdapter<String> a_ciudades = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, ciudades);

        spciudades.setAdapter(a_ciudades);
        spciudades.setOnItemSelectedListener(new SpinnerListener());
    }

    public class SpinnerListener implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            ciudad = parent.getItemAtPosition(pos).toString();
        }
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }

    public void onRadioClick(View v){
        ((RadioButton)v).setChecked(true);
    }

    public void onCheckClick(View v){
            ((CheckBox)v).setChecked(true);
    }

    public void onClick(View view){

        if (log.getText().toString().isEmpty() || pass1.getText().toString().isEmpty() || pass2.getText().toString().isEmpty() || pass3.getText().toString().isEmpty() || email.getText().toString().isEmpty()){
            Toast.makeText(this, "No puede dejar campos vacios", Toast.LENGTH_SHORT).show();
        }
        else if (!musica.isChecked() && !deporte.isChecked()&& !viajes.isChecked() && !compras.isChecked()){
            Toast.makeText(this, "Debe seleccionar algún hobbie", Toast.LENGTH_SHORT).show();
        }
        else if (!pass1.getText().toString().equals(pass2.getText().toString())){
            Toast.makeText(this, "Las contraseñas no son iguales", Toast.LENGTH_SHORT).show();
        }
        else{
            loggin=log.getText().toString();
            con1=pass1.getText().toString();
            con2=pass2.getText().toString();
            con3=pass3.getText().toString();
            correo=email.getText().toString();
            if (sexo.getCheckedRadioButtonId()==R.id.rMas){
                sex="Masculino";
            }
            else {
                sex="Femenino";
            }
            dia = fecha.getDayOfMonth();
            mes = fecha.getMonth() + 1;
            año = fecha.getYear();
            if (musica.isChecked()){
                mus="Música";
            }
            if (deporte.isChecked()){
                dep="Deporte";
            }
            if (viajes.isChecked()){
                via="Viajes";
            }
            if (compras.isChecked()){
                com="Compras";
            }
            t1.setText("Loggin: "+loggin);
            t2.setText("Password 1: "+con1);
            t3.setText("Password 2: "+con2);
            t4.setText("E-mail: "+correo);
            t5.setText("Password:"+con3);
            t6.setText("Sexo: "+sex);
            t7.setText("Fecha Nacimiento: Día: "+dia+" Mes: "+mes+" Año: "+año);
            t8.setText("Lugar Nacimiento: "+ciudad);
            t13.setText("Hobbies:");
            t9.setText(mus);
            t10.setText(dep);
            t11.setText(via);
            t12.setText(com);


        }

    }
}
