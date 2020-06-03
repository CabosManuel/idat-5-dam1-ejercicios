package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio23Activity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCalcular;
    private Button btnVolver;
    private EditText etNumero;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio23);

        btnCalcular = findViewById(R.id.btncalcular);
        btnVolver = findViewById(R.id.btnvolver);
        etNumero = findViewById(R.id.etnumero);
        tvResultado = findViewById(R.id.tvresultado);

        btnCalcular.setOnClickListener(this);
        btnVolver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btncalcular:
                if (etNumero.getText().toString().equals("")) {
                    etNumero.setError("Ingrese un número.");
                } else if(Integer.parseInt(etNumero.getText().toString())>92){
                    etNumero.setError("Esa cantidad no cabe en la variable de tipo long.");
                } else {
                    //Mostrar n terminos de la serie Fibonacci
                    Integer numero = Integer.parseInt(etNumero.getText().toString());

                    long a = 0;
                    long b = 1;
                    long c;
                    String resultado = "";

                    if (numero == 0) {
                        resultado = "0";
                    } else if (numero == 1) {
                        resultado = "1";
                    }else {
                        for (int i = 1; i < numero; i++) {
                            c = a + b;
                            a = b;
                            b = c;
                            resultado += c;
                            if (i < numero - 1) {
                                resultado += ", ";
                            }
                        }
                    }

                    tvResultado.setText(resultado);
                }
                break;
            case R.id.btnvolver:
                finish();
                break;
        }

    }
}
