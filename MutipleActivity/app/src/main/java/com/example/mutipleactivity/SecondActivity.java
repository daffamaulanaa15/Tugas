package com.example.mutipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView    namasaya;
    String  name="nama";

    String  namanya;
    Button  button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        namasaya=findViewById(R.id.kirimannama);

        Bundle  bundle=getIntent().getExtras();
        namanya=bundle.getString(name);
        namasaya.setText(namanya);


    }


    public void PesanMakan(View view) {
            Button  =   findViewById(R.id.mainLayout)
    }

}
