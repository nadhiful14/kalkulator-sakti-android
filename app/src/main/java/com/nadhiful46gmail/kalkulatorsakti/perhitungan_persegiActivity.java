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

public class perhitungan_persegiActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_perhitungan_persegi);

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
        ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.array_dicari_persegi, android.R.layout.simple_spinner_item);
        genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        spinner_dicari.setAdapter(genderSpinnerAdapter);
        spinner_dicari.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selection = (String) adapterView.getItemAtPosition(i);
                if (!TextUtils.isEmpty(selection)) {
                    if (selection.equals("Keliling")) {
                        cari = 0;
                    } else if (selection.equals("Luas")) {
                        cari = 1;
                    } else
                        cari = 2;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cari = 2;
            }
        });
    }

    private void setupSpinner1() {
        if(cari==0){
            ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.array_dicari_persegi_keliling, android.R.layout.simple_spinner_item);
            genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

            spinner1.setAdapter(genderSpinnerAdapter);
            spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    String selection = (String) adapterView.getItemAtPosition(i);
                    if (!TextUtils.isEmpty(selection)) {
                        if (selection.equals("Luas")) {
                            cari1 = 0;
                            d="Luas";
                        } else
                            cari1 = 1;
                        d="Sisi";
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {
                    cari1 = 1;
                    d="Sisi";

                }
            });
        }

        else if(cari==1){
            ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.array_dicari_persegi_luas, android.R.layout.simple_spinner_item);
            genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

            spinner1.setAdapter(genderSpinnerAdapter);
            spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    String selection = (String) adapterView.getItemAtPosition(i);
                    if (!TextUtils.isEmpty(selection)) {
                        if (selection.equals("Keliling")) {
                            cari1 = 0;
                            d="Keliling";
                        } else
                            cari1 = 1;
                        d="Sisi";
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {
                    cari1 = 1;
                    d="Sisi";
                }
            });
        }

        else {
            ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.array_dicari_persegi_sisi, android.R.layout.simple_spinner_item);
            genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

            spinner1.setAdapter(genderSpinnerAdapter);
            spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    String selection = (String) adapterView.getItemAtPosition(i);
                    if (!TextUtils.isEmpty(selection)) {
                        if (selection.equals("Luas")) {
                            cari1 = 0;
                            d = "Keliling";
                        } else
                            cari1 = 1;
                        d = "Luas";
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {
                    cari1 = 1;
                    d = "Luas";
                }
            });
        }
    }

    public void cari(View view) {
        if (cari == 0) {
            label3.setText("Keliling");
            setupSpinner1();
        } else if (cari == 1) {
            label3.setText("Luas");
            setupSpinner1();
        }
        else {
            label3.setText("Sisi");
            setupSpinner1();
        }
    }

    public void hitung(View view) {
        a = diket1.getText().toString();
        x = Integer.valueOf(a);
        y=0;
        switch (x){
            case 0 : y = 0 ; break ;
            case 1 : y = 1 ; break ;
            case 4 : y = 2 ; break ;
            case 9 : y = 3 ; break ;
            case 16 : y = 4 ; break ;
            case 25 : y = 5 ; break ;
            case 36 : y = 6 ; break ;
            case 49 : y = 7 ; break ;
            case 64 : y = 8 ; break ;
            case 81 : y = 9 ; break ;
            case 100 : y = 10 ; break ;
            default: y=9999999;
        }
        if(y==9999999){
            hasil.setText("kerjakan sendiri coy");
        }
        else{
        z = operasi(x,y);
        hasil.setText(pesan(z));}
        y=0;
    }

    public String pesan(int z) {
        String kata="";
        if (cari == 0) {
            if (cari1 == 1) {
                kata =
                        "= " + 4 + " * " + d + "\n" +
                                "= " + 4 + " * " + x + "\n" +
                                "= " + z;
            }
            else {
                kata =
                        "= " + 4 + " * ( akar " + "Luas" + " ) \n" +
                                "= " + 4 + " * ( akar " + x + " ) \n" +
                                "= " + 4 + " * ( " + y + " ) \n" +
                                "= " + z;

            }
        }
        else if (cari == 1) {
            if (cari1 == 1){
                kata =
                        "= " + d + " * " + d + "\n" +
                                "= " + x + " * " + x + "\n" +
                                "= " + z;
            }
            else {
                kata =
                        "= ( ( " + "Keliling" + " / 4 ) * ( " + "Keliling" + " / 4 ) ) \n"+
                                "= ( ( " + x + " / 4 ) * ( " + x + " / 4 ) ) \n"+
                                "= ( ( " + (x/4) + " ) * ( " + (x/4) + " ) ) \n"+
                                "= " + z;
            }
        }
        else{
            if (cari1 == 0) {
                kata =
                        "= ( akar " + d + " ) \n" +
                                "= ( akar " + x + " ) \n" +
                                "= " + z;
            }
            else {
                kata =
                        "= ( " + "Keliling" + " / 4 ) \n" +
                                "= ( " + x + " / 4 ) \n" +
                                "= " + z;
            }
        }
        return kata;
    }

    public int operasi(int x, int y) {
        if (cari == 0) {
            if (cari1 == 1) {
                z = 4*x;
            }
            else{
                z=4*y;
            }
        }
        else if (cari == 1) {
            if (cari1 == 1) {
                z = x*x;
            }
            else{
                z = (x/4)*(x/4);
            }
        }
        else{
            if (cari1 == 0) {
                z=y;
            }
            else{
                z = x/4;
            }
        }
        return z;
    }

}
