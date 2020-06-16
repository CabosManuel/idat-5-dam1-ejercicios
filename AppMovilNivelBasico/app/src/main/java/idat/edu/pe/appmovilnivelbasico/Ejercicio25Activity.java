package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio25Activity extends AppCompatActivity implements View.OnClickListener{

    private EditText etN1, etN2;
    private Button btnCalcular, btnVolver;
    private TextView tvCalculo,tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio25);

        etN1 = findViewById(R.id.etn1);
        etN2 = findViewById(R.id.etn2);
        btnCalcular = findViewById(R.id.btncalcular);
        btnVolver = findViewById(R.id.btnvolver);
        tvCalculo = findViewById(R.id.tvcalculo);
        tvResultado = findViewById(R.id.tvresultado);

        btnCalcular.setOnClickListener(this);
        btnVolver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btncalcular:
                if(etN1.getText().toString().equals("")){
                    etN1.setError("Ingrese un número.");
                }
                if(etN2.getText().toString().equals("")){
                    etN2.setError("Ingrese un número.");
                }else{
                    int n1 = Integer.parseInt(etN1.getText().toString()),
                        n2 = Integer.parseInt(etN2.getText().toString()),
                        nMax = Math.max(n1, n2);
                    Integer mcm = 1;

                    String calculo="";

                    if(n1!=0 && n2 != 0) {
                        for (int i = 1; n1 != 1 || n2 != 1; i++) {
                            if (n1 % i == 0 || n2 % i == 0) {
                                calculo+=n1 + " " + n2 + " | " + i+"\n";

                                if(n1 % i == 0){
                                    n1 /= i;
                                }

                                if (n2 % i ==0 ){
                                    n2 /= i;
                                }

                                mcm *= i;
                            } else if (i > nMax) {
                                i = 1;
                            }else{
                                continue;
                            }
                        }
                    }else{
                        mcm=0;
                    }
                    calculo+=n1 + " " + n2 + " | ";

                    tvCalculo.setText(calculo);
                    tvResultado.setText(mcm.toString());
                }

                break;
            case R.id.btnvolver:
                finish();
                break;
        }
    }
}
