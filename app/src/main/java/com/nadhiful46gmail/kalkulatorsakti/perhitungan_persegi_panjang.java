package com.nadhiful46gmail.kalkulatorsakti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class perhitungan_persegi_panjang extends AppCompatActivity {
    EditText diket1;
    EditText diket2;
    TextView label3;
    TextView hasil;
    String a;
    String b;
    String c;
    String d = "";
    String e = "";
    Integer x = 0;
    Integer y = 0;
    Integer z = 0;
    Integer cari = 0;
    Integer cari1 = 0;
    Integer cari2 = 0;
    Spinner spinner_dicari;
    Spinner spinner1;
    Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perhitungan_persegi_panjang);

        spinner_dicari = (Spinner) findViewById(R.id.dicari);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        diket1 = (EditText) findViewById(R.id.diket1);
        diket2 = (EditText) findViewById(R.id.diket2);
        label3 = (TextView) findViewById(R.id.label3);
        hasil = (TextView) findViewById(R.id.hasil);
        setupSpinner();
    }

    private void setupSpinner() {
        ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.array_dicari, android.R.layout.simple_spinner_item);
        genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        spinner_dicari.setAdapter(genderSpinnerAdapter);
        spinner_dicari.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selection = (String) adapterView.getItemAtPosition(i);
                if (!TextUtils.isEmpty(selection)) {
                    if (selection.equals("Panjang")) {
                        cari = 2;
                    } else if (selection.equals("Lebar")) {
                        cari = 3;
                    } else if (selection.equals("Luas")) {
                        cari = 1;
                    } else
                        cari = 0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cari = 0;
            }
        });
    }

    private void setupSpinner1() {
        if(cari==0){
            ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.array_dicari_Keliling, android.R.layout.simple_spinner_item);
            genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

            spinner1.setAdapter(genderSpinnerAdapter);
            spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    String selection = (String) adapterView.getItemAtPosition(i);
                    if (!TextUtils.isEmpty(selection)) {
                        if (selection.equals("Luas")) {
                            cari1 = 1;
                            d="Luas";
                        } else
                            cari1 = 0;
                        d="Panjang";
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {
                    cari1 = 0;
                    d="Panjang";

                }
            });
        }

        else if(cari==1){
            ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.array_dicari_Luas, android.R.layout.simple_spinner_item);
            genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

            spinner1.setAdapter(genderSpinnerAdapter);
            spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    String selection = (String) adapterView.getItemAtPosition(i);
                    if (!TextUtils.isEmpty(selection)) {
                        if (selection.equals("Keliling")) {
                            cari1 = 1;
                            d="Keliling";
                        } else
                            cari1 = 0;
                        d="Panjang";
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {
                    cari1 = 0;
                    d="Panjang";
                }
            });
        }

        else {
            ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.array_dicari_panjang_lebar, android.R.layout.simple_spinner_item);
            genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

            spinner1.setAdapter(genderSpinnerAdapter);
            spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    String selection = (String) adapterView.getItemAtPosition(i);
                    if (!TextUtils.isEmpty(selection)) {
                        if (selection.equals("Luas")) {
                            cari1 = 1;
                            d = "Luas";
                        } else
                            cari1 = 0;
                        d = "Keliling";
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {
                    cari1 = 0;
                    d = "Keliling";
                }
            });
        }
    }

    private void setupSpinner2() {
        ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.array_dicari_panjanglebar, android.R.layout.simple_spinner_item);
        genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        spinner2.setAdapter(genderSpinnerAdapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selection = (String) adapterView.getItemAtPosition(i);
                if (!TextUtils.isEmpty(selection)) {
                    if (selection.equals("Panjang")) {
                        cari2 = 1;
                        e="Panjang";
                    }
                    else {
                        cari2 = 0;
                        e="Lebar";
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cari2 = 0;
                e="Lebar";
            }
        });
    }

    public void cari(View view) {
        if (cari == 2) {
            label3.setText("Panjang");
            setupSpinner1();
            setupSpinner2();
        } else if (cari == 3) {
            label3.setText("Lebar");
            setupSpinner1();
            setupSpinner2();
        } else if (cari == 1) {
            label3.setText("Luas");
            setupSpinner1();
            setupSpinner2();
        } else {
            label3.setText("Keliling");
            setupSpinner1();
            setupSpinner2();
        }
    }

    public void hitung(View view) {
        a = diket1.getText().toString();
        b = diket2.getText().toString();
        x = Integer.valueOf(a);
        y = Integer.valueOf(b);
        z = operasi(x, y);
        hasil.setText(pesan(z));
    }

    public String pesan(int z) {
        String kata="";
        if (cari == 1) {
            if ((cari1 == 0) && (cari2 == 0)) {
                kata =
                        "= " + d + " * " + e + "\n" +
                                "= " + x + " * " + y + "\n" +
                                "= " + z;
            }
            else if ((cari1 == 1) && (cari2 == 0)) {
                kata =
                        "=  ( ( " + "Keliling" + " /  2 ) - " + e + " ) * " + e + "\n" +
                                "=  ( ( " + x + " /  2 ) - " + y + " ) * " + y + "\n" +
                                "=  ( ( " + (x/2) + " ) - " + y + " ) * " + y + "\n" +
                                "=  ( " + ((x/2)-y) + " ) * " + y + "\n" +
                                "= " + z;
            }
            else if ((cari1 == 0) && (cari2 == 1)) {
                kata ="Rumus Salah coy";
            }
            else {
                kata =
                        "=  ( ( " + "Keliling" + " /  2 ) - " + e + " ) * " + e + "\n" +
                                "=  ( ( " + x + " /  2 ) - " + y + " ) * " + y + "\n" +
                                "=  ( ( " + (x/2) + " ) - " + y + " ) * " + y + "\n" +
                                "=  ( " + ((x/2)-y) + " ) * " + y + "\n" +
                                "= " + z;
            }
        }
        else if (cari == 2) {
            if ((cari1 == 0) && ((cari2 == 0))) {
                kata =
                        "= ( ( " + d + " / 2 ) - " + e + "\n" +
                                "= ( ( " + x + " / 2 ) - " + y + "\n" +
                                "= ( " + (x / 2) + " ) - " + y + "\n" +
                                "= " + z;
            }
            else if ((cari1 == 1) && ((cari2 == 0))) {
                kata =
                        "= " + "Luas" + " / " + e + "\n" +
                                "= " + x + " / " + y + "\n" +
                                "= " + z;
            }
            else {
                kata ="Rumus Salah coy";
            }
        }
        else if (cari == 0) {
            if ((cari1 == 0) && (cari2 == 0)) {
                kata =
                        "= 2 * ( " + d + " + " + e + " ) " + "\n" +
                                "= 2 * ( " + x + " + " + y + " ) " + "\n" +
                                "= 2 * ( " + (x + y) + " ) " + "\n" +
                                "= " + z;
            }
            else if ((cari1 == 1) && (cari2 == 0)) {
                kata =
                        "= 2 * (( " + "Luas" + " / " + e + " ) + " + e + ")" + "\n" +
                                "= 2 * (( " + x + " / " + y + " ) + " + y + ")" + "\n" +
                                "= 2 * ( " + (x / y) + " + " + y + ")" + "\n" +
                                "= 2 * ( " + ((x / y) + y) + ")" + "\n" +
                                "= " + z;
            }

            else if ((cari1 == 0) && (cari2 == 1)) {
                kata ="Rumus Salah coy";
            }

            else {
                kata =
                        "= 2 * (( " + "Luas" + " / " + e + " ) + " + e + ")" + "\n" +
                                "= 2 * (( " + x + " / " + y + " ) + " + y + ")" + "\n" +
                                "= 2 * ( " + (x / y) + " + " + y + ")" + "\n" +
                                "= 2 * ( " + ((x / y) + y) + ")" + "\n" +
                                "= " + z;
            }
        }
        else{
            if ((cari1 == 0) && ((cari2 == 1))) {
                kata =
                        "= ( ( " + d + " / 2 ) - " + e + "\n" +
                                "= ( ( " + x + " / 2 ) - " + y + "\n" +
                                "= ( " + (x / 2) + " ) - " + y + "\n" +
                                "= " + z;
            }
            else if ((cari1 == 1) && ((cari2 == 1))) {
                kata =
                        "= " + "Luas" + " / " + e + "\n" +
                                "= " + x + " / " + y + "\n" +
                                "= " + z;
            }
            else {
                kata ="Rumus Salah coy";
            }
        }
        return kata;
    }

    public int operasi(int x, int y) {
        if (cari == 0) {
            if ((cari1 == 0) && (cari2 == 0)) {
                z = 2*(x+y);
            }
            else if ((cari1 == 1) && (cari2 == 0)) {
                z = 2*((x/y)+y);
            }
            else{
                z = 2*((x/y)+y);
            }
        }
        else if (cari == 1) {
            if ((cari1 == 0) && (cari2 == 0)) {
                z = x*y;
            }
            else if ((cari1 == 1) && (cari2 == 0)) {
                z = ((x/2)-y)*y;
            }
            else{
                z = ((x/2)-y)*y;
            }
        }
        else if (cari == 2) {
            if ((cari1 == 0) && ((cari2 == 0)||(cari2 == 1))) {
                z = ((x/2)-y);
            }
            else if ((cari1 == 1) && ((cari2 == 0)||(cari2 == 1))) {
                z = x/y;
            }
            else{
                z = ((x/2)-y)*y;
            }
        }
        else {
            if ((cari1 == 0) && ((cari2 == 0)||(cari2 == 1))) {
                z = ((x/2)-y);
            }
            else if ((cari1 == 1) && ((cari2 == 0)||(cari2 == 1))) {
                z = x/y;
            }
            else{
                z = ((x/2)-y)*y;
            }
        }
        return z;
    }

}
