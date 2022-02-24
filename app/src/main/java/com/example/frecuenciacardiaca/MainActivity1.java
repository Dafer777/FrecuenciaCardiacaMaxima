package com.example.frecuenciacardiaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {
    Button pagina3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        EditText n1;
        Button btnCardiaco;
        TextView ResultadoFinal;

        n1 = (EditText)findViewById(R.id.et);

        btnCardiaco= (Button)findViewById(R.id.btnFinal);

        ResultadoFinal =(TextView) findViewById(R.id.tv);





        btnCardiaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1= Integer.parseInt(n1.getText().toString());
                int valor2FreMax = 222;
                int ResCardiaco = valor2FreMax - valor1;
                ResultadoFinal.setText(ResCardiaco+" Es tu frecuencia cardiaca maxima");


            }
        });


        pagina3 = (Button) findViewById(R.id.btnAutores);

        pagina3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pagina3 = new Intent(MainActivity1.this, MainActivity2.class);
                startActivity(pagina3);
            }
        });
    }
}