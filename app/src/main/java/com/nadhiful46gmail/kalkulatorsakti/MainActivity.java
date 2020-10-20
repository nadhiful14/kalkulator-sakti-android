package com.nadhiful46gmail.kalkulatorsakti;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout versi = (RelativeLayout) findViewById(R.id.versi);
        versi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mbuilder = new AlertDialog.Builder(MainActivity.this);
                View mview = getLayoutInflater().inflate(R.layout.activity_pop_up, null);
                mbuilder.setView(mview);
                AlertDialog dialog = mbuilder.create();
                dialog.show();
            }
        });
    }

    public void OpenDuaDimensi(View view) {
        Intent daftarRumus = new Intent(MainActivity.this, AwalActivity.class);
        startActivity(daftarRumus);
    }

    public void OpenAboutUs(View view) {
        Intent aboutUs = new Intent(MainActivity.this, AboutUsActivity.class);
        startActivity(aboutUs);
    }

    public void toEmail(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: " + "kasti@gmai.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Request rumus matematika");
        intent.putExtra(Intent.EXTRA_TEXT,
                "Silahkan diisikan rumus yang ingin di request ");
        if(intent.resolveActivity(getPackageManager()) != null ){
            startActivity(intent);
    }
    }

    public void FeedBack(View view) {
        Intent aboutUs = new Intent(MainActivity.this, pop_up1Activity.class);
        startActivity(aboutUs);
    }

}
