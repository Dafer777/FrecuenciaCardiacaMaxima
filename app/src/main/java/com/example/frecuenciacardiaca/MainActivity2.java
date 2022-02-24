package com.example.frecuenciacardiaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
Button pagina4;
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        pagina4 = (Button) findViewById(R.id.button);

        pagina4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pagina4 = new Intent(MainActivity2.this, MainActivity1.class);
                startActivity(pagina4);
            }
        });
    }

}