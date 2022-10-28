package com.example.mutipleactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    private RecyclerView    recKuliner;
    private ArrayList<Kuliner>  listkuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

            recKuliner =findViewById(R.id.rec_kuliner);
            initData();

            recKuliner.setAdapter(new KulinerAdapter(listkuliner));
            recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }
    private void    initData(){
        this.listkuliner    =   new ArrayList<>();
        listkuliner.add(new Kuliner("Soto Bok Ireng",
                "Kepanjen Kidul,Kota Blitar,Jawa Timur",
                "Soto Paling Jos di blitar",  R.drawable.soto));


        listkuliner.add(new Kuliner("Soto Bok Ireng",
                    "Kepanjen Kidul,Kota Blitar,Jawa Timur",
                    "Soto Paling Jos di blitar",  R.drawable.soto));



         listkuliner.add(new Kuliner("Gado-Gado Mbak Endh",
                        "Togokan Srengat,Blitar,Jawa Timur",
                        "Gado-Gado Paling Laris Di Srengat",  R.drawable.gadogado));


        listkuliner.add(new Kuliner("Bakso Dieng",
                            "Jl. Sudanco Supriyadi, Blitar,,Jawa Timur",
                            "Spesial Bakso Super Endulita",  R.drawable.bakso));

                }
}