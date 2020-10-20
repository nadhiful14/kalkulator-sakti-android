package com.nadhiful46gmail.kalkulatorsakti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread myTh = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent in = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(in);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        myTh.start();
    }
}
