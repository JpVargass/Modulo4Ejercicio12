package cl.jpvs.modulo4ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cl.jpvs.modulo4ejercicio12.databinding.ActivityMainBinding;
// modulo 4 trabajo 12 jpvargas
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;   //paso1  el nombre depende del nombre de la clase
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityMenu = new Intent(getBaseContext(), SecondActivity.class);
                startActivity(activityMenu);
            }
        });



    }
}