package com.example.lab2_20186098_20190740;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class seleccionAsiento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_asiento);

        CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(view -> {
            int precio = 0;
            int contador = 0;
            if (cb1.isChecked()==true){
                precio+=30;
                contador++;
            }
            if (cb2.isChecked()==true){
                precio+=26;
                contador++;
            }
            if (cb3.isChecked()==true){
                precio+=23;
                contador++;
            }
            openDialog(precio, contador);
        });

        ImageButton btn2 = findViewById(R.id.imageView);

        btn2.setOnClickListener(view -> {
            onBackPressed();
        });

    }

    public void openDialog(int precio, int contador){
        Dialog dialogo = new Dialog();
        dialogo.setCantidad(contador);
        dialogo.setPrecio(precio);
        dialogo.show(getSupportFragmentManager(),"advertencia");
    }
}