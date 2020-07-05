package com.example.makanancafe;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setContentView (R.layout.activity_menu);
        final CheckBox burger = (CheckBox) findViewById (R.id.burger);
        final CheckBox Tomyum = (CheckBox) findViewById (R.id.Tomyum);
        final CheckBox Rice = (CheckBox) findViewById (R.id.Rice);
        final CheckBox tea = (CheckBox) findViewById (R.id.tea);
        final CheckBox lemon = (CheckBox) findViewById (R.id.lemon);
        final CheckBox milkshake = (CheckBox) findViewById (R.id.milkshake);
        final CheckBox juice = (CheckBox) findViewById (R.id.juice);

        final EditText jml_burger = (EditText) findViewById (R.id.quantityburger);
        final EditText jml_Tomyum = (EditText) findViewById (R.id.quantityTomyum);
        final EditText jml_Rice = (EditText) findViewById (R.id.quantityrice);
        final EditText jml_tea =(EditText) findViewById (R.id.quantitytea);
        final EditText jml_lemon=(EditText) findViewById (R.id.quantityrlemon);
        final EditText jml_milkshake=(EditText) findViewById (R.id.quantitymilkshake);
        final EditText jml_juice=(EditText) findViewById (R.id.quantityjuice);


        final int harga_burger = 15000;
        final int harga_Tomyum =  17000;
        final int harga_Rice = 12000;
        final int harga_tea = 7000;
        final int harga_lemon = 12000;
        final int harga_milkshake = 9000;
        final int harga_juice = 8000;


        Button pesan = (Button)findViewById(R.id.button3);

        pesan.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View view){
                String summOrder = "";
                int totOrder = 0 ;
                if (burger.isChecked()) {
                    String txt = "- Burger";
                    int jml =Integer. parseInt (String.valueOf(jml_burger.getText()));
                    int calc = jml*harga_burger;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if (Tomyum.isChecked()) {
                    String txt = "- Tomyum";
                    int jml =Integer. parseInt (String.valueOf(jml_Tomyum.getText()));
                    int calc = jml*harga_Tomyum;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if (Rice.isChecked()) {
                    String txt = "- Rice Bowl";
                    int jml =Integer. parseInt (String.valueOf(jml_Rice.getText()));
                    int calc = jml*harga_Rice;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if (tea.isChecked()) {
                    String txt = "- Ice Tea";
                    int jml = Integer.parseInt(String.valueOf(jml_tea.getText()));
                    int calc = jml * harga_tea;
                    summOrder += txt + " " + jml + "\n";
                    totOrder += calc;
                }
                if (lemon.isChecked()) {
                    String txt = "- Lemon Tea";
                    int jml =Integer. parseInt (String.valueOf(jml_lemon.getText()));
                    int calc = jml*harga_lemon;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if (milkshake.isChecked()) {
                    String txt = "- Milkshake";
                    int jml = Integer.parseInt(String.valueOf(jml_milkshake.getText()));
                    int calc = jml * harga_milkshake;
                    summOrder += txt + " " + jml + "\n";
                    totOrder += calc;
                }

                if (juice.isChecked()) {
                    String txt = "- Juice";
                    int jml = Integer.parseInt(String.valueOf(jml_juice.getText()));
                    int calc = jml * harga_juice;
                    summOrder += txt + " " + jml + "\n";
                    totOrder += calc;
                }

                Intent myIntent = new Intent(menu.this, struk.class);
                myIntent.putExtra("summaryOrder", summOrder);
                myIntent.putExtra("totalOrder", totOrder);
                startActivity(myIntent);
            }
        });
    }
}
