package com.nadhiful46gmail.kalkulatorsakti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AwalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal);
    }

    public void OpenPersegi(View view) {
        Intent persegiIntent = new Intent(AwalActivity.this, PersegiActivity.class);
        startActivity(persegiIntent);
    }

    public void OpenPersegiPanjang(View view) {
        Intent persegiPanjangIntent = new Intent(AwalActivity.this, PersegiPanjangActivity.class);
        startActivity(persegiPanjangIntent);
    }

    public void OpenLingkaran(View view) {
        Intent lingkaranIntent = new Intent(AwalActivity.this, LingkaranActivity.class);
        startActivity(lingkaranIntent);
    }

    public void OpenBelahKetupat(View view) {
        Intent belahketupatIntent = new Intent(AwalActivity.this, Belah_KetupatActivity.class);
        startActivity(belahketupatIntent);
    }

    public void OpenLayang2(View view) {
        Intent layang2Intent = new Intent(AwalActivity.this, Layang2Activity.class);
        startActivity(layang2Intent);
    }

    public void OpenTrapesium(View view) {
        Intent trapesiumIntent = new Intent(AwalActivity.this, TrapesiumActivity.class);
        startActivity(trapesiumIntent);
    }

    public void OpenJajarGenjang(View view) {
        Intent jajargenjangIntent = new Intent(AwalActivity.this, jajar_genjangActivity.class);
        startActivity(jajargenjangIntent);
    }

    public void OpenSegitiga(View view) {
        Intent segitigaIntent = new Intent(AwalActivity.this, segitigaActivity.class);
        startActivity(segitigaIntent);
    }
}
