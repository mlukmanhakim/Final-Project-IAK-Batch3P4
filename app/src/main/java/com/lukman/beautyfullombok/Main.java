package com.lukman.beautyfullombok;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.zip.Inflater;

public class Main extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    CardView wisata,kuliner,budaya,kerajinan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


//        aksi untuk btn wisata
        wisata = (CardView) findViewById(R.id.btnWisata);
        wisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailWisata.class);
                startActivity(i);
            }
        });

//        aksi untuk btn kuliner
        kuliner = (CardView) findViewById(R.id.btnKuliner);
        kuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailKuliner.class);
                startActivity(i);
            }
        });
            budaya = (CardView) findViewById(R.id.btnBudaya);
        budaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailBudaya.class);
                startActivity(i);
            }
        });

        kerajinan = (CardView) findViewById(R.id.btnKerajinan);
        kerajinan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailKerajinan.class);
                startActivity(i);
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            AlertDialog.Builder builder = (AlertDialog.Builder) new AlertDialog.Builder(Main.this);
            View v = getLayoutInflater().inflate(R.layout.costum_dialog, null);
//            View v = getApplication(DetailBudaya.class);
            builder.setView(v);
            AlertDialog dialog = builder.create();
            dialog.show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Snackbar snckbar = Snackbar.make(this.getCurrentFocus(), "Tahap Ini Masih Dalam Proses Pengembangan ", Snackbar.LENGTH_LONG);
            snckbar.show();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_wisata) {
            Intent i = new Intent(this.getApplicationContext(), DetailWisata.class);
            startActivity(i);
        }else if (id == R.id.nav_kuliner) {
            Intent i = new Intent(this.getApplicationContext(), DetailKuliner.class);
            startActivity(i);


        }else if (id == R.id.nav_budaya) {
            Intent i = new Intent(this.getApplicationContext(), DetailBudaya.class);
            startActivity(i);

        }else if (id == R.id.nav_kerajinan) {
            Intent i = new Intent(this.getApplicationContext(), DetailKerajinan.class);
            startActivity(i);

        }else if (id == R.id.nav_profil) {
            Intent i = new Intent(this.getApplicationContext(), Profil.class);
            startActivity(i);

        }else if (id == R.id.nav_tentang) {
            Intent i = new Intent(this.getApplicationContext(), TentangAplikasi.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void sadKeluar(View view) {
        finish();
    }

    public void netKeluar(View view) {
        finish();
    }

    public void sukaKeluar(View view) {
        finish();
    }

    public void btnKluar(View view) {
        finish();
    }

//        public void sadKeluar(){
//            finish();
//        }
//
//        public  void netKeluar(){
//            finish();
//        }
//
//        public void sukaKeluar(){
//            finish();
//        }
//
//        public void btnKeluar(){
//            finish();
//        }




}
