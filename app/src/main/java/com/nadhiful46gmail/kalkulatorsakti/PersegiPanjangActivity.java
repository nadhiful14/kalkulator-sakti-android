package com.nadhiful46gmail.kalkulatorsakti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class PersegiPanjangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

    }

    public void mulai(View view) {
        Intent masukrumus = new Intent(PersegiPanjangActivity.this, perhitungan_persegi_panjang.class);
        startActivity(masukrumus);

    }
}
