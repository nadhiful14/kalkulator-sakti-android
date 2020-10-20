package com.nadhiful46gmail.kalkulatorsakti;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Belah_KetupatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belah__ketupat);
    }
    public void mulai(View view) {
        AlertDialog.Builder mbuilder = new AlertDialog.Builder(Belah_KetupatActivity.this);
        View mview = getLayoutInflater().inflate(R.layout.activity_pop_up2, null);
        mbuilder.setView(mview);
        AlertDialog dialog = mbuilder.create();
        dialog.show();
    }
}
