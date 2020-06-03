package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ejercicio15Activity extends AppCompatActivity implements View.OnClickListener{

    private Button btnVolver,btnCalcular;
    private EditText etNumero;
    private TextView tvResultadoSuma,tvResultadoSerie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio15);

        btnVolver = findViewById(R.id.btnvolver);
        btnCalcular = findViewById(R.id.btncalcular);
        etNumero = findViewById(R.id.etnumero);
        tvResultadoSuma = findViewById(R.id.tvresultadosuma);
        tvResultadoSerie = findViewById(R.id.tvresultadoserie);

        btnVolver.setOnClickListener(this);
        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btncalcular:
                if(etNumero.getText().toString().equals("")) {
                    etNumero.setError("Ingrese un número");
                }else{
                    Integer numero = Integer.parseInt(etNumero.getText().toString());

                    int limite=numero;
                    numero=0;
                    String serie="";
                    for(int i=1;i<=limite;i++){
                        numero+=i;
                        serie+=i;

                        if(i<limite){
                            serie+=",";
                        }
                    }
                    tvResultadoSerie.setText(serie);
                    tvResultadoSuma.setText(numero.toString());
                }
                break;
            case R.id.btnvolver:
                finish();
                break;
        }
    }
}
