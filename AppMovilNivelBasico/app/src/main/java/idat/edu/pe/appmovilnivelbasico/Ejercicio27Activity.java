package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio27Activity extends AppCompatActivity implements View.OnClickListener{

    private Button btnCalcular, btnVolver;
    private EditText etN1, etN2, etN3;
    private TextView tvCalculo,tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio27);

        btnCalcular = findViewById(R.id.btncalcular);
        btnVolver = findViewById(R.id.btnvolver);
        etN1 = findViewById(R.id.etn1);
        etN2 = findViewById(R.id.etn2);
        etN3 = findViewById(R.id.etn3);
        tvResultado = findViewById(R.id.tvresultado);
        tvCalculo = findViewById(R.id.tvcalculo);

        btnCalcular.setOnClickListener(this);
        btnVolver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btncalcular:
                if(etN1.getText().toString().equals(""))
                    etN1.setError("Ingrese un número.");
                if(etN2.getText().toString().equals(""))
                    etN2.setError("Ingrese un número.");
                if(etN3.getText().toString().equals(""))
                    etN3.setError("Ingrese un número.");
                else{
                    //Ingresar 3 números y calcular el máximo común divisor.

                    int n1=Integer.parseInt(etN1.getText().toString()),
                        n2=Integer.parseInt(etN2.getText().toString()),
                        n3=Integer.parseInt(etN3.getText().toString()),
                        nMin=Math.min(n1,Math.min(n2,n3));

                    int mcd=1;
                    String calculo="";

                    for (int i = 1; i<nMin; i++) {
                        if(n1 % i == 0 && n2 % i == 0 && n3 % i == 0) {
                            calculo+=n1 + " " + n2 + " " + n3 + " | " + i + "\n";
                            n1 = n1 / i;
                            n2 = n2 / i;
                            n3 = n3 / i;
                            mcd *= i;
                        }else{
                            continue;
                        }
                    }
                    calculo+=n1 + " " + n2 + " " + n3 + " |";

                    tvCalculo.setText(calculo);
                    tvResultado.setText("MCD: "+mcd);
                }
                break;
            case R.id.btnvolver:
                finish();
                break;
        }
    }
}
