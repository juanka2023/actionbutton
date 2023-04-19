package com.example.actionbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //metodo para mostrar botones de accion
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.id.menuaccion, menu);
        return true;
    }
    //Método para agregar las acciones de nuestros botones
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.item1compartir){
            Toast.makeText(this, "Compartir", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.iten2buscar){
            Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.iten1){
            Toast.makeText(this, "Opción 1", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.iten2){
            Toast.makeText(this, "Opción 2", Toast.LENGTH_SHORT).show();
            return true;
        } return super.onOptionsItemSelected(item);
    }
}