package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.lang.ref.ReferenceQueue;

public class MainActivity extends AppCompatActivity {

    RadioButton rb1,rb2,rb3;
    CheckBox n1,n2,n3,n4,n5,n6,n7;
    String ingredientes, nombre;
    Button button;
    EditText edt1;
    double precio;
    int contador =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =(Button)findViewById(R.id.button);
        ingredientes="";
        rb3= (RadioButton) findViewById(R.id.radioButton3);
        rb2= (RadioButton) findViewById(R.id.radioButton2);
        rb1= (RadioButton) findViewById(R.id.radioButton);
        n1 = (CheckBox) findViewById(R.id.checkBox);
        n2 = (CheckBox) findViewById(R.id.checkBox2);
        n3 = (CheckBox) findViewById(R.id.checkBox3);
        n4 = (CheckBox) findViewById(R.id.checkBox4);
        n5 = (CheckBox) findViewById(R.id.checkBox5);
        n6 = (CheckBox) findViewById(R.id.checkBox6);
        n7 = (CheckBox) findViewById(R.id.checkBox7);
        edt1= (EditText) findViewById(R.id.editText);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(rb3.isChecked()==true) {
                    precio = precio + 50;
                    ingredientes += rb3.getText().toString();
                    ingredientes += "\n";
                    contador++;
                }
                else if (rb2.isChecked()==true)
                {
                    precio= precio + 30;
                    ingredientes += rb2.getText().toString();
                    ingredientes +="\n";
                    contador++;
                }
                else {

                    precio = precio + 15;
                    ingredientes += rb1.getText().toString();
                    ingredientes +="\n";
                    contador++;

                }


                if (n1.isChecked() == true) {
                    precio = precio + 4;
                    ingredientes += n1.getText().toString();
                    ingredientes += "\n";
                    contador++;
                }
                if (n2.isChecked() == true) {
                    precio = precio + 2;
                    ingredientes += n2.getText().toString();
                    ingredientes += "\n";
                    contador++;
                }
                if (n3.isChecked() == true) {
                    precio = precio + 4;
                    ingredientes += n3.getText().toString();
                    ingredientes += "\n";
                    contador++;
                }
                if (n4.isChecked() == true) {
                    precio = precio + 2;
                    ingredientes += n4.getText().toString();
                    ingredientes += "\n";
                    contador++;
                }
                if (n5.isChecked() == true) {
                    precio = precio + 2;
                    ingredientes += n5.getText().toString();
                    ingredientes += "\n";
                    contador++;
                }
                if (n6.isChecked() == true) {
                    precio = precio + 2;
                    ingredientes += n6.getText().toString();
                    ingredientes += "\n";
                    contador++;
                }
                if (n7.isChecked() == true) {
                    precio = precio + 2;
                    ingredientes += n7.getText().toString();
                    ingredientes += "\n";
                    contador++;
                }
                nombre=edt1.getText().toString();

                if (contador > 0) {
                    Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                    i.putExtra("ingrediente", ingredientes);
                    i.putExtra("Total", precio);
                    i.putExtra("Nombre", nombre);
                    startActivity(i);
                    finish();
                }
                Toast.makeText(getApplicationContext(),"Listo, pedido realizado con éxito. De clic en el botón ver pedido para conocer el total a pagar.",Toast.LENGTH_LONG).show();
            }
        });
    }
}