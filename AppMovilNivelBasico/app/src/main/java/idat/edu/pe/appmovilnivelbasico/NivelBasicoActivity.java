package idat.edu.pe.appmovilnivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NivelBasicoActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnE1,btnE2,btnE3,btnE4,btnE5,btnE6,btnE7,btnE8,btnE9,btnE10;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_basico);

        btnE1 = findViewById(R.id.btne1);
        btnE2 = findViewById(R.id.btne2);
        btnE3 = findViewById(R.id.btne3);
        btnE4 = findViewById(R.id.btne4);
        btnE5 = findViewById(R.id.btne5);
        btnE6 = findViewById(R.id.btne6);
        btnE7 = findViewById(R.id.btne7);
        btnE8 = findViewById(R.id.btne8);
        btnE9 = findViewById(R.id.btne9);
        btnE10 = findViewById(R.id.btne10);

        btnE1.setOnClickListener(this);
        btnE2.setOnClickListener(this);
        btnE3.setOnClickListener(this);
        btnE4.setOnClickListener(this);
        btnE5.setOnClickListener(this);
        btnE6.setOnClickListener(this);
        btnE7.setOnClickListener(this);
        btnE8.setOnClickListener(this);
        btnE9.setOnClickListener(this);
        btnE10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btne1:
                startActivity(new Intent(NivelBasicoActivity.this, Ejercicio1Activity.class));
                break;
            case R.id.btne2:
                startActivity(new Intent(NivelBasicoActivity.this, Ejercicio2Activity.class));
                break;
            case R.id.btne3:
                startActivity(new Intent(NivelBasicoActivity.this, Ejercicio3Activity.class));
                break;
            case R.id.btne4:
                startActivity(new Intent(NivelBasicoActivity.this, Ejercicio4Activity.class));
                break;
            /*case R.id.btne5:
                startActivity(new Intent(NivelBasicoActivity.this,Ejercicio5.class));
                break;
            case R.id.btne6:
                startActivity(new Intent(NivelBasicoActivity.this,Ejercicio6.class));
                break;
            case R.id.btne7:
                startActivity(new Intent(NivelBasicoActivity.this,Ejercicio7.class));
                break;
            case R.id.btne8:
                startActivity(new Intent(NivelBasicoActivity.this,Ejercicio8.class));
                break;
            case R.id.btne9:
                startActivity(new Intent(NivelBasicoActivity.this,Ejercicio9.class));
                break;
            case R.id.btne10:
                startActivity(new Intent(NivelBasicoActivity.this,Ejercicio10.class));
                break;*/
            default:
                Toast.makeText(getApplicationContext(), "El botón no esta mapeado", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
