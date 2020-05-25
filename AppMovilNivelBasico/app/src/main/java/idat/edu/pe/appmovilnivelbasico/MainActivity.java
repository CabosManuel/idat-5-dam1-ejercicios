package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnBasico,btnMedio,btnAvanzado,btnEjercicioAlazar;
    private TextView tvEjercicioAlazar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBasico = findViewById(R.id.btnbasico);
        btnMedio = findViewById(R.id.btnmedio);
        btnAvanzado = findViewById(R.id.btnavanzado);
        btnEjercicioAlazar = findViewById(R.id.btnejercicioalazar);
        tvEjercicioAlazar = findViewById(R.id.tvejercicioalazar);

        btnBasico.setOnClickListener(this);
        btnMedio.setOnClickListener(this);
        btnAvanzado.setOnClickListener(this);
        btnEjercicioAlazar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnbasico:
                startActivity(new Intent(MainActivity.this,Ejercicio1.class));
                break;
            case R.id.btnmedio:
                startActivity(new Intent(MainActivity.this,NivelMedio.class));
                break;
            /*case R.id.btnavanzado:
                startActivity(new Intent(MainActivity.this,NivelAvanzado.class));
                break;*/
            case R.id.btnejercicioalazar:
                tvEjercicioAlazar.setText(ejercicioAlazar());
                break;
            default:
                //Toast.makeText(getApplicationContext(), "El botón no esta mapeado", Toast.LENGTH_SHORT).show();

                break;
        }
    }

    private String ejercicioAlazar() {
        Integer ejercicio = 29;

        int[] resueltos={1,2,3,4,15,21};
        boolean resuelto=false;

        while(!(ejercicio>28 & !resuelto)){
            ejercicio = (int) Math.round(Math.random() * 100);
            for (int  i: resueltos) {
                if (ejercicio == i) {
                    resuelto = true;
                    break;
                }
            }
        }

        return ejercicio.toString();
    }
}
