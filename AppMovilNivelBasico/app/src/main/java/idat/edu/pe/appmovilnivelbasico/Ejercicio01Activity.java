package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio01Activity extends AppCompatActivity {

    private Button btnVolver,btnCalcular;
    private EditText etNumero;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio01);

        btnVolver = findViewById(R.id.btnvolver);
        etNumero = findViewById(R.id.etnumero);
        btnCalcular = findViewById(R.id.btncalcular);
        tvResultado = findViewById(R.id.tvresultado);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etNumero.getText().toString().equals("")){
                    etNumero.setError("Debe ingresar un número");
                }else{
                    Integer numero;
                    String resultado="";

                    numero = Integer.parseInt(etNumero.getText().toString());

                    if(numero%2==0){
                        resultado = "PAR";
                        tvResultado.setTextColor(getResources().getColor(R.color.colorPrimary));
                    }else{
                        resultado="IMPAR";
                        tvResultado.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    }
                    tvResultado.setText("El número es "+ resultado+". ");
                }
            }
        });
    }
}
