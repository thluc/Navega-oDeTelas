package com.teste.navegaodecores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Random;
import android.content.SharedPreferences;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button botaovermelho;
    Button botaoverde;
    Button botaoazul;
    Button botaoaleatorio;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaovermelho = findViewById(R.id.botaovermelho);
        botaoverde = findViewById(R.id.botaoverde);
        botaoazul = findViewById(R.id.botaoazul);
        botaoaleatorio = findViewById(R.id.botaoaleatorio);
        layout = findViewById(R.id.linearlayout);

        botaovermelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.RED);
            }
        });
        botaoverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.GREEN);
            }
        });
        botaoazul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.BLUE);
            }
        });
        botaoaleatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int red = random.nextInt(256); // Valores vão de 0 a 255
                int green = random.nextInt(256);
                int blue = random.nextInt(256);

                int corAleatoria = Color.rgb(red, green, blue);

                layout.setBackgroundColor(corAleatoria);
            }
        });



    }

    public void proxtela(View view) {
        Intent in = new Intent(MainActivity.this, tela2.class);
        startActivity(in);
    }

}