package com.example.biodata;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnemail(View view) {
        Intent intent = new Intent();
        intent.setAction(intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("mailto:daffamaulanaa15@gmail.com"));
        startActivity(intent);


    }

    public void btphone(View view)
        {Intent intent = new Intent();
        intent.setAction(intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://wa.me/6287805947829"));
        startActivity(intent);



    }

    public void address(View view) {

            Intent intent = new Intent();
            intent.setAction(intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.google.com/maps?q=-7.810117721557617,112.03849029541016&z=17&hl=id"));
            startActivity(intent);

    }
}