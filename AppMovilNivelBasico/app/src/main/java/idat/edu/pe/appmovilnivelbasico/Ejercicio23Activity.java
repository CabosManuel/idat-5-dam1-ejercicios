package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

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
                if (etNumero.getText().toString().equals("")||etNumero.getText().toString().equals("0")) {
                    etNumero.setError("Ingrese un número positivo.");
                } else if(Integer.parseInt(etNumero.getText().toString())>93){
                    etNumero.setError("Esa cantidad no cabe en la variable de tipo long.");
                } else {
                    //Mostrar n terminos de la serie Fibonacci
                    Integer numero = Integer.parseInt(etNumero.getText().toString());

                    String resultado = "";

                    long a = 0;
                    long b = 0;
                    long c;

                    for (int i = 0; i < numero; i++) {
                        if (i== 1) {
                            a=1;
                            b=0;
                        }

                        c = a + b;
                        a = b;
                        b = c;
                        resultado += c;

                        if (i < numero - 1) {
                            resultado += ", ";
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
