package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NivelAvanzadoActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnE21,btnE22,btnE23,btnE24,btnE25,btnE26,btnE27,btnE28,btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_avanzado);

        btnE21 = findViewById(R.id.btne21);
        btnE22 = findViewById(R.id.btne22);
        btnE23 = findViewById(R.id.btne23);
        btnE24 = findViewById(R.id.btne24);
        btnE25 = findViewById(R.id.btne25);
        btnE26 = findViewById(R.id.btne26);
        btnE27 = findViewById(R.id.btne27);
        btnE28 = findViewById(R.id.btne28);
        btnVolver = findViewById(R.id.btnvolver);

        btnE21.setOnClickListener(this);
        btnE22.setOnClickListener(this);
        btnE23.setOnClickListener(this);
        btnE24.setOnClickListener(this);
        btnE25.setOnClickListener(this);
        btnE26.setOnClickListener(this);
        btnE27.setOnClickListener(this);
        btnE28.setOnClickListener(this);
        btnVolver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btne21:
                startActivity(new Intent(NivelAvanzadoActivity.this, Ejercicio21Activity.class));
                break;
            /*case R.id.btne22:
                startActivity(new Intent(NivelAvanzadoActivity.this,Ejercicio22Activity.class));
                break;*/
            case R.id.btne23:
                startActivity(new Intent(NivelAvanzadoActivity.this,Ejercicio23Activity.class));
                break;
            /*case R.id.btne24:
                startActivity(new Intent(NivelAvanzadoActivity.this,Ejercicio24Activity.class));
                break;
            case R.id.btne25:
                startActivity(new Intent(NivelAvanzadoActivity.this,Ejercicio25Activity.class));
                break;
            case R.id.btne26:
                startActivity(new Intent(NivelAvanzadoActivity.this,Ejercicio26Activity.class));
                break;
            case R.id.btne27:
                startActivity(new Intent(NivelAvanzadoActivity.this,Ejercicio27Activity.class));
                break;
            case R.id.btne28:
                startActivity(new Intent(NivelAvanzadoActivity.this,Ejercicio28Activity.class));
                break;*/
            case R.id.btnvolver:
                finish();
                break;
            default:
                Toast.makeText(getApplicationContext(), "El botón no esta mapeado", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
