package com.nadhiful46gmail.kalkulatorsakti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PersegiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
    }
    public void mulai(View view) {
        Intent masukrumus = new Intent(PersegiActivity.this, perhitungan_persegiActivity.class);
        startActivity(masukrumus);

    }
}
