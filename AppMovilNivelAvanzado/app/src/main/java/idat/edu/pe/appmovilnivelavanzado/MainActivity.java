package idat.edu.pe.appmovilnivelavanzado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnE21,btnE22,btnE23,btnE24,btnE25,btnE26,btnE27,btnE28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnE21 = findViewById(R.id.btne21);
        btnE22 = findViewById(R.id.btne22);
        btnE23 = findViewById(R.id.btne23);
        btnE24 = findViewById(R.id.btne24);
        btnE25 = findViewById(R.id.btne25);
        btnE26 = findViewById(R.id.btne26);
        btnE27 = findViewById(R.id.btne27);
        btnE28 = findViewById(R.id.btne28);

        btnE21.setOnClickListener(this);
        btnE22.setOnClickListener(this);
        btnE23.setOnClickListener(this);
        btnE24.setOnClickListener(this);
        btnE25.setOnClickListener(this);
        btnE26.setOnClickListener(this);
        btnE27.setOnClickListener(this);
        btnE28.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btne21:
                startActivity(new Intent(MainActivity.this,Ejercicio21.class));
                break;
            case R.id.btne22:
                //startActivity(new Intent(MainActivity.this,Ejercicio22.class));
                break;
            case R.id.btne23:
                //startActivity(new Intent(MainActivity.this,Ejercicio23.class));
                break;
            case R.id.btne24:
                //startActivity(new Intent(MainActivity.this,Ejercicio24.class));
                break;
            case R.id.btne25:
                startActivity(new Intent(MainActivity.this,Ejercicio25.class));
                break;
            case R.id.btne26:
                //startActivity(new Intent(MainActivity.this,Ejercicio26.class));
                break;
            case R.id.btne27:
                //startActivity(new Intent(MainActivity.this,Ejercicio27.class));
                break;
            case R.id.btne28:
                //startActivity(new Intent(MainActivity.this,Ejercicio28.class));
                break;
            default:
                Toast.makeText(getApplicationContext(), "El botón no esta mapeado", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
