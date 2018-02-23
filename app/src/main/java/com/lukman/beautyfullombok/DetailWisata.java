package com.lukman.beautyfullombok;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DetailWisata extends AppCompatActivity {
    CardView giliKedis,pantaiSemeti,mangkuSakti,pantaiNambung,sembalun,gunungRinjani;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setTitle("Wisata");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

//        kode untuk menuu detail setiap wisata
        giliKedis = (CardView) findViewById(R.id.clikGiliKedis);
        giliKedis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), GiliKedis.class);
                startActivity(i);

            }
        });
        pantaiSemeti = (CardView) findViewById(R.id.clikPantaiSemeti);
        pantaiSemeti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), PantaiSemeti.class);
                startActivity(i);
            }
        });

        mangkuSakti = (CardView) findViewById(R.id.clikMangkuSakti);
        mangkuSakti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), MangkuSakti.class);
                startActivity(i);

            }
        });

        pantaiNambung = (CardView) findViewById(R.id.clikPantaiNambung);
        pantaiNambung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),PantaiNambung.class);
                startActivity(i);
            }
        });

        sembalun = (CardView) findViewById(R.id.clickSembalun);
        sembalun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Sembalun.class);
                startActivity(i);
            }
        });

        gunungRinjani = (CardView) findViewById(R.id.clickGunungRinjani);
        gunungRinjani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), GunungRinjani.class);
                startActivity(i);
            }
        });

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }
}
