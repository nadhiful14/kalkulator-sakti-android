package com.nadhiful46gmail.kalkulatorsakti;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class pop_up1Activity extends AppCompatActivity {
    EditText deskripsi;
    EditText telpon;
    EditText subject;
    String deskripsi1="";
    String telpon1="";
    String subject1="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up1);

        deskripsi = (EditText) findViewById(R.id.deskripsi);
        telpon = (EditText) findViewById(R.id.telpon);
        subject = (EditText) findViewById(R.id.subjek);
    }

    public void kirim(View view){
        deskripsi1=deskripsi.getText().toString();
        telpon1=telpon.getText().toString();
        subject1=subject.getText().toString();
        email();
    }

    public void email(){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: " + " kasti@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, subject1);
        intent.putExtra(Intent.EXTRA_TEXT,
                deskripsi1+"\n"+
                        telpon1);
        if(intent.resolveActivity(getPackageManager()) != null ){
            startActivity(intent);
        }
    }
}
