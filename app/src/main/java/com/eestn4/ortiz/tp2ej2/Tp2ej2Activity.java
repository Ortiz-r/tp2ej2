package com.eestn4.ortiz.tp2ej2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tp2ej2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tp2ej2);
        Button boton1 = (Button)findViewById(R.id.BtnSuma);
        Button boton2 = (Button)findViewById(R.id.BtnResta);
        Button boton3 = (Button)findViewById(R.id.BtnMulti);
        Button boton4 = (Button)findViewById(R.id.BtnDivi);

        }

    public void suma(View view){
        EditText numero1 = (EditText)findViewById(R.id.EditNum1);
        EditText numero2 = (EditText)findViewById(R.id.EditNum2);
        int resultado;
        int num1 = Integer.parseInt(numero1.getText().toString());
        int num2 = Integer.parseInt(numero2.getText().toString());
        resultado = num1+num2;
        Toast toast1= Toast.makeText(getApplicationContext(),"el resultado de la suma es:"+resultado, Toast.LENGTH_SHORT);;
        toast1.show();
    }
    public void resta(View view){
        EditText numero1 = (EditText)findViewById(R.id.EditNum1);
        EditText numero2 = (EditText)findViewById(R.id.EditNum2);
        int resultado;
        int num1 = Integer.parseInt(numero1.getText().toString());
        int num2 = Integer.parseInt(numero2.getText().toString());
        resultado = num1-num2;
        Toast toast1= Toast.makeText(getApplicationContext(),"el resultado de la resta es:"+resultado, Toast.LENGTH_SHORT);;
        toast1.show();
    }

    public void divi(View view){
        EditText numero1 = (EditText)findViewById(R.id.EditNum1);
        EditText numero2 = (EditText)findViewById(R.id.EditNum2);
        int resultado;
        int num1 = Integer.parseInt(numero1.getText().toString());
        int num2 = Integer.parseInt(numero2.getText().toString());
        resultado = num1/num2;
        Toast toast1= Toast.makeText(getApplicationContext(),"el resultado de la division es:"+resultado, Toast.LENGTH_SHORT);;
        toast1.show();
    }

    public void multi(View view){
        EditText numero1 = (EditText)findViewById(R.id.EditNum1);
        EditText numero2 = (EditText)findViewById(R.id.EditNum2);
        int resultado;
        int num1 = Integer.parseInt(numero1.getText().toString());
        int num2 = Integer.parseInt(numero2.getText().toString());
        resultado = num1*num2;
        Toast toast1= Toast.makeText(getApplicationContext(),"el resultado de la multiplicacion es:"+resultado, Toast.LENGTH_SHORT);;
        toast1.show();
    }


}
