package com.example.makanancafe;


import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class struk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struk);
        setContentView (R.layout.activity_struk);
        TextView pesanan = (TextView) findViewById (R.id.totalpesanan);
        TextView total = (TextView) findViewById (R.id.totalharga);

        Intent intent =getIntent();
        String sum = intent.getStringExtra ("summaryOrder");
        int tot = intent.getIntExtra ("totalOrder",0);

        pesanan.setText(sum);
        total.setText ("Rp. "+tot);
    }
}
