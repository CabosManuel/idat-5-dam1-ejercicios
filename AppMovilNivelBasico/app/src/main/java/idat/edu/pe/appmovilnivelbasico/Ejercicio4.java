package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio4 extends AppCompatActivity implements View.OnClickListener {

    private Button btnVolver, btnSuma, btnResta, btnMultiplicacion, btnDivision;
    private EditText etNumeroNatural1, etNumeroNatural2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        btnVolver = findViewById(R.id.btnvolver);
        btnSuma = findViewById(R.id.btnsuma);
        btnResta = findViewById(R.id.btnresta);
        btnMultiplicacion = findViewById(R.id.btnmultiplicacion);
        btnDivision = findViewById(R.id.btndivision);
        etNumeroNatural1 = findViewById(R.id.etnum1);
        etNumeroNatural2 = findViewById(R.id.etnum2);
        tvResultado = findViewById(R.id.tvresultado);

        btnVolver.setOnClickListener(this);
        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnMultiplicacion.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (etNumeroNatural1.getText().toString().equals("")) {
            etNumeroNatural1.setError("Ingrese un número natural");
        }
        if (etNumeroNatural2.getText().toString().equals("")) {
            etNumeroNatural2.setError("Ingrese un número natural");
        } else {
            Double resultado = 0.0, n1, n2;
            n1 = Double.parseDouble(etNumeroNatural1.getText().toString());
            n2 = Double.parseDouble(etNumeroNatural2.getText().toString());

            switch (v.getId()) {
                case R.id.btnsuma:
                    resultado = n1 + n2;
                    break;
                case R.id.btnresta:
                    resultado = n1 - n2;
                    break;
                case R.id.btnmultiplicacion:
                    resultado = n1 * n2;
                    break;
                case R.id.btndivision:
                    resultado = n1 / n2;
                    break;
            }
            tvResultado.setText(resultado.toString());
        }
    }
}
