package com.example.pizzeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button btn1;
    Button btn2;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 =(Button)findViewById(R.id.button2);
        btn2 =(Button)findViewById(R.id.button3);
        txt1=(TextView) findViewById((R.id.textView2));

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle extras = getIntent().getExtras();
                String ingre = extras.getString("ingrediente");
                double total = extras.getDouble("Total");
                String name = extras.getString("Nombre");


                txt1.setText("Estimad@ " + name+ ",tu pedido es el siguiente: \n"+ingre+"\n"+"Tu total es: $"+total+"\n");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent button1=new Intent (MainActivity2.this, MainActivity.class);
                startActivity(button1);
            }
        });
    }
}