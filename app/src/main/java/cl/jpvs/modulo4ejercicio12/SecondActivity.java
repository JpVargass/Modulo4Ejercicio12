package cl.jpvs.modulo4ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import cl.jpvs.modulo4ejercicio12.databinding.ActivityMainBinding;
import cl.jpvs.modulo4ejercicio12.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySecondBinding binding = ActivitySecondBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        List<String> ListaMenus = new ArrayList<>();

        ListaMenus.add("Puré de calabacín");
        ListaMenus.add("Tortilla de patatas");
        ListaMenus.add("Albóndigas de pollo");
        ListaMenus.add("Ensalada de tomate");
        ListaMenus.add("Leche, pan con aceite y fruta");
        ListaMenus.add("Lentejas vegetales");
        ListaMenus.add("Croquetas de atún");
        ListaMenus.add("Menestra de verduras");
        ListaMenus.add("Sardinas al horno");
        ListaMenus.add("Leche, pan con aceite y fruta");
        ListaMenus.add("Macarrones con verduras");
        ListaMenus.add("Pollo a la cerveza");
        ListaMenus.add("Sopa juliana");
        ListaMenus.add("Corvina al ajillo");
        ListaMenus.add("Leche, pan con aceite y fruta");

        ArrayAdapter adapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, ListaMenus);
        binding.ListaMenu.setAdapter(adapter);

    }
}