package net.robertorodriguez.activitybottombar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navegador = findViewById( R.id.navegador );
        navegador.setSelectedItemId( R.id.itInicio );

        navegador.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.itAlamacen:
                    startActivity( new Intent( this, TerceraActivity.class) );
                    overridePendingTransition(0,0);
                    break;
                case R.id.itInicio:
                    break;
                case R.id.itLista:
                    startActivity( new Intent( this, SegundaActivity.class) );
                    overridePendingTransition(0,0);
                    break;
            }
            return true;

        });

    }
}