package com.example.frecuenciacardiaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button pagina1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pagina1 = (Button) findViewById(R.id.btn1);

        pagina1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pagina1 = new Intent(MainActivity.this, MainActivity1.class);
                startActivity(pagina1);
            }
        });

    }
}