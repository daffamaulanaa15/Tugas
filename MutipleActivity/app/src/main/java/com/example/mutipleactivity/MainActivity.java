package com.example.mutipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        EditText   editText;
        Button button;

        String  nama;
         @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.namasaya);

        }

    public void KirimData(View view) {
             String namaisi=editText.getText().toString();
             Intent intent=new Intent(MainActivity.this,SecondActivity.class);
             intent.putExtra("nama",namaisi);
             startActivity(intent);
    }
}
