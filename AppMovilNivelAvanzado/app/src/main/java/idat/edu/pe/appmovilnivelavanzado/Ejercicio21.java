package idat.edu.pe.appmovilnivelavanzado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ejercicio21 extends AppCompatActivity implements View.OnClickListener{

    private Button btnVolver,btnCalcular;
    private EditText etNFactorial;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio21);

        btnVolver = findViewById(R.id.btnvolver);
        btnCalcular = findViewById(R.id.btncalcular);
        etNFactorial = findViewById(R.id.etnfactorial);
        tvResultado = findViewById(R.id.tvresultado);

        btnVolver.setOnClickListener(this);
        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btncalcular:
                if(etNFactorial.getText().toString().equals(""))
                    etNFactorial.setError("Ingrese un número");
                else{
                    Integer n = 1;
                    n = Integer.parseInt(etNFactorial.getText().toString());

                    int factorial = n;
                    for (int i=1;i<factorial;i++){
                        n*=i;
                    }
                    tvResultado.setText(n.toString());
                }
                break;
            case R.id.btnvolver:
                finish();
                break;
        }
    }
}
