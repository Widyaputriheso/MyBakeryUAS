package com.example.makanancafe;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText pemesan = (EditText) findViewById (R.id.pemesan);
        Button menu = (Button) findViewById(R.id.button);
        Button keluar = (Button) findViewById(R.id.button2);


        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack (true);

            }
        });

        menu.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, menu.class);
                startActivity(pindah);
            }
        });
    }
}
