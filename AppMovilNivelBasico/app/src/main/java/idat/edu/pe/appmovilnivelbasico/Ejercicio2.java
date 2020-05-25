package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio2 extends AppCompatActivity {

    private EditText etC1,etC2;
    private Button btnCalcular,btnVolver;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        etC1 = findViewById(R.id.etc1);
        etC2 = findViewById(R.id.etc2);
        btnCalcular = findViewById(R.id.btncalcular);
        btnVolver = findViewById(R.id.btnvolver);
        tvResultado = findViewById(R.id.tvresultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etC1.getText().toString().equals("")){
                    etC1.setError("Ingrese un cateto 1.");
                }if(etC2.getText().toString().equals("")){
                    etC2.setError("Ingrese el cateto 2.");
                }else {

                    Double c1, c2, resultado;

                    c1 = Double.parseDouble(etC1.getText().toString());
                    c2 = Double.parseDouble(etC2.getText().toString());

                    resultado = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));

                    tvResultado.setText(resultado.toString());
                }
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
