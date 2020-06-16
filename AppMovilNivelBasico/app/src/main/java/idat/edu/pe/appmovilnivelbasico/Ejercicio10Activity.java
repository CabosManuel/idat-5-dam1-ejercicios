package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio10Activity extends AppCompatActivity implements View.OnClickListener{

    private Button btnVolver,btnCalcular;
    private TextView tvResultado;
    private EditText etVelocidadKm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio10);
        //10.	Ingrese la velocidad de un automóvil, expresada en kilómetros por hora,
        // calcule la velocidad en metros por segundo.

        btnVolver = findViewById(R.id.btnvolver);
        btnCalcular = findViewById(R.id.btncalcular);
        tvResultado = findViewById(R.id.tvresultado);
        etVelocidadKm = findViewById(R.id.etvelocidadkm);

        btnVolver.setOnClickListener(this);
        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btncalcular:
                if(etVelocidadKm.getText().toString().equals("")){
                    etVelocidadKm.setError("Ingrese una velocidad en km/h");
                }else{
                    double km = Double.parseDouble(etVelocidadKm.getText().toString());
                    Double resultado = km/3.6;
                    tvResultado.setText(String.format("%.2f m/s",resultado));
                }
                break;
            case R.id.btnvolver:
                finish();
                break;
        }
    }
}
