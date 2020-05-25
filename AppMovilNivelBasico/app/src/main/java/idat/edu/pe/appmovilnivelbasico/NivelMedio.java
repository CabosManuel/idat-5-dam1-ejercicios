package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NivelMedio extends AppCompatActivity implements View.OnClickListener{

    private Button btnE11,btnE12,btnE13,btnE14,btnE15,btnE16,btnE17,btnE18,btnE19,btnE20;
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_medio);

        btnE11 = findViewById(R.id.btne11);
        btnE12 = findViewById(R.id.btne12);
        btnE13 = findViewById(R.id.btne13);
        btnE14 = findViewById(R.id.btne14);
        btnE15 = findViewById(R.id.btne15);
        btnE16 = findViewById(R.id.btne16);
        btnE17 = findViewById(R.id.btne17);
        btnE18 = findViewById(R.id.btne18);
        btnE19 = findViewById(R.id.btne19);
        btnE20 = findViewById(R.id.btne20);

        btnE11.setOnClickListener(this);
        btnE12.setOnClickListener(this);
        btnE13.setOnClickListener(this);
        btnE14.setOnClickListener(this);
        btnE15.setOnClickListener(this);
        btnE16.setOnClickListener(this);
        btnE17.setOnClickListener(this);
        btnE18.setOnClickListener(this);
        btnE19.setOnClickListener(this);
        btnE20.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            /*case R.id.btne11:
                startActivity(new Intent(NivelMedio.this,Ejercicio11.class));
                break;
            case R.id.btne12:
                startActivity(new Intent(NivelMedio.this,Ejercicio12.class));
                break;
            case R.id.btne13:
                startActivity(new Intent(NivelMedio.this,Ejercicio13.class));
                break;
            case R.id.btne14:
                startActivity(new Intent(NivelMedio.this,Ejercicio14.class));
                break;*/
            case R.id.btne15:
                startActivity(new Intent(NivelMedio.this,Ejercicio15.class));
                break;
            /*case R.id.btne16:
                startActivity(new Intent(NivelMedio.this,Ejercicio16.class));
                break;
            case R.id.btne17:
                startActivity(new Intent(NivelMedio.this,Ejercicio17.class));
                break;
            case R.id.btne18:
                startActivity(new Intent(NivelMedio.this,Ejercicio18.class));
                break;
            case R.id.btne19:
                startActivity(new Intent(NivelMedio.this,Ejercicio19.class));
                break;
            case R.id.btne20:
                startActivity(new Intent(NivelMedio.this,Ejercicio20.class));
                break;*/
            default:
                Toast.makeText(getApplicationContext(), "El botón no esta mapeado", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
