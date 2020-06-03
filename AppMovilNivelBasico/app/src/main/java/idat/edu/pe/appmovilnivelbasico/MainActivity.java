package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
                startActivity(new Intent(MainActivity.this, Ejercicio1Activity.class));
                break;
            case R.id.btnmedio:
                startActivity(new Intent(MainActivity.this, NivelMedioActivity.class));
                break;
            case R.id.btnavanzado:
                startActivity(new Intent(MainActivity.this,NivelAvanzadoActivity.class));
                break;
            case R.id.btnejercicioalazar:
                tvEjercicioAlazar.setText(ejercicioAlazar().toString());
                break;
            default:
                Toast.makeText(getApplicationContext(), "El botón no esta mapeado", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private Integer ejercicioAlazar() {
        int[] resueltos = {1, 2, 3, 4, 15, 21};
        int ejercicio = 0;
        boolean existe = true;

        while (existe) {
            while (ejercicio > 28 || ejercicio == 0) {
                ejercicio = (int) Math.round(Math.random() * 100);
            }
            for (int resuelto : resueltos) {
                if (ejercicio == resuelto) {
                    ejercicio = 0;
                    break;
                }
                if (resuelto == resueltos[resueltos.length - 1]) {
                    existe = false;
                }
            }
        }
        return ejercicio;
    }
}
