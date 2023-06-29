package cl.jpvs.modulo4ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.jpvs.modulo4ejercicio12.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;   //paso1  el nombre depende del nombre de la clase
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}