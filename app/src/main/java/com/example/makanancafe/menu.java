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
        final CheckBox cake = (CheckBox) findViewById (R.id.Cake);
        final CheckBox chiffon = (CheckBox) findViewById (R.id.Chiffon);
        final CheckBox donut = (CheckBox) findViewById (R.id.Donut);
        final CheckBox biscuit = (CheckBox) findViewById (R.id.Biscuit);
        final CheckBox cookies = (CheckBox) findViewById (R.id.Cookies);
        final CheckBox brownies = (CheckBox) findViewById (R.id.Brownies);
        final CheckBox puding = (CheckBox) findViewById (R.id.Puding);

        final EditText jml_Cake= (EditText) findViewById (R.id.quantitycake);
        final EditText jml_Chiffon= (EditText) findViewById (R.id.quantitychiffon);
        final EditText jml_Donut= (EditText) findViewById (R.id.quantitydonut);
        final EditText jml_Biscuit=(EditText) findViewById (R.id.quantitybiscuit);
        final EditText jml_Cookies=(EditText) findViewById (R.id.quantityrcookies);
        final EditText jml_Brownies=(EditText) findViewById (R.id.quantitybrownies);
        final EditText jml_Puding=(EditText) findViewById (R.id.quantitypuding);


        final int harga_cake = 15000;
        final int harga_chiffon =  17000;
        final int harga_donut = 7000;
        final int harga_biscuit = 10000;
        final int harga_cookies = 12000;
        final int harga_brownies = 15000;
        final int harga_puding = 8000;


        Button pesan = (Button)findViewById(R.id.button3);

        pesan.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View view){
                String summOrder = "";
                int totOrder = 0 ;
                if (cake.isChecked()) {
                    String txt = "- Cake";
                    int jml =Integer. parseInt (String.valueOf(jml_Cake.getText()));
                    int calc = jml*harga_cake;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if (chiffon.isChecked()) {
                    String txt = "- Chiffon";
                    int jml =Integer. parseInt (String.valueOf(jml_Chiffon.getText()));
                    int calc = jml*harga_chiffon;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if (donut.isChecked()) {
                    String txt = "- Donut ";
                    int jml =Integer. parseInt (String.valueOf(jml_Donut.getText()));
                    int calc = jml*harga_donut;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if (biscuit.isChecked()) {
                    String txt = "- Biscuit";
                    int jml =Integer. parseInt (String.valueOf(jml_Biscuit.getText()));
                    int calc = jml*harga_biscuit;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if (cookies.isChecked()) {
                    String txt = "- Cookies";
                    int jml = Integer.parseInt(String.valueOf(jml_Cookies.getText()));
                    int calc = jml * harga_cookies;
                    summOrder += txt + " " + jml + "\n";
                    totOrder += calc;
                }
                if (brownies.isChecked()) {
                    String txt = "- Brownies";
                    int jml = Integer.parseInt(String.valueOf(jml_Brownies.getText()));
                    int calc = jml * harga_brownies;
                    summOrder += txt + " " + jml + "\n";
                    totOrder += calc;
                }
                if (puding.isChecked()) {
                    String txt = "- Puding";
                    int jml = Integer.parseInt(String.valueOf(jml_Puding.getText()));
                    int calc = jml * harga_puding;
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
