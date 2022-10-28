package com.example.kalkulatorbangunruang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText    panjang,    lebar,  alas,   tinggi, jarijari;
    TextView    luasnya,    kelilingnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        panjang=(EditText) findViewById(R.id.panjang);
        lebar=(EditText) findViewById(R.id.lebar);
        alas=(EditText) findViewById(R.id.alas);
        tinggi=(EditText) findViewById(R.id.tinggi);
        jarijari=(EditText)findViewById(R.id.jarijari);
        luasnya=(TextView) findViewById(R.id.luas);
        kelilingnya=(TextView) findViewById(R.id.keliling);
    }

    public void hitungpersegi(View view) {
        int a1=Integer.parseInt(panjang.getText().toString());
        int a2=Integer.parseInt(lebar.getText().toString());

        Integer hsl1 = a1*a2;
        Integer hsl2 = 4*a1;

        luasnya.setText(hsl1.toString());
        kelilingnya.setText(hsl2.toString());

    }

    public void hitungsegitiga(View view) {
        int a2=Integer.parseInt(alas.getText().toString());
        int a3=Integer.parseInt(tinggi.getText().toString());

        Integer hsl3    =   (a2*a3)/2;
        Integer hsl4    =   3*a2;

        luasnya.setText(hsl3.toString());
        kelilingnya.setText(hsl4.toString());
    }

    public void hitunglingkaran(View view) {
        double a1=Double.parseDouble(jarijari.getText().toString());

        Double hsl5= 22*a1*a1/7;
        Double hsl6= 22*(a1*2)/7;

        luasnya.setText(hsl5.toString());
        kelilingnya.setText(hsl6.toString());

    }

    public void Clear(View view) {
        panjang.setText("");
        lebar.setText("");
        alas.setText("");
        tinggi.setText("");
        jarijari.setText("");
        kelilingnya.setText("");
        luasnya.setText("");
    }
}

