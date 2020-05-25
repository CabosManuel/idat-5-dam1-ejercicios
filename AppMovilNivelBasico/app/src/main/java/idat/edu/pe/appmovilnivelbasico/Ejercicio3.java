package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio3 extends AppCompatActivity implements View.OnClickListener{

    private Button btnVolver,btnCalcular;
    private EditText etNota;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        btnVolver = findViewById(R.id.btnvolver);
        btnCalcular = findViewById(R.id.btncalcular);
        etNota = findViewById(R.id.etnota);
        tvResultado = findViewById(R.id.tvresultado);

        btnVolver.setOnClickListener(this);
        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btncalcular:
                Double nota = Double.parseDouble(etNota.getText().toString());

                if(nota < 0 || nota > 20){
                    etNota.setError("Ingrese una nota entre 0-20.");
                }else {
                    String resultado;

                    if (nota <= 10.5)
                        resultado = "Malo";
                    else if (nota <= 14)
                        resultado = "Regular";
                    else if(nota <=18)
                        resultado = "Bueno";
                    else
                        resultado = "Excelente";

                    tvResultado.setText(resultado);
                }
                break;
            case R.id.btnvolver:
                finish();
                break;
        }
    }
}
