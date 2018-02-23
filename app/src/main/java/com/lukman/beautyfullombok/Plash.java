package com.lukman.beautyfullombok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;



/**
 * Created by Ojiq on 15/02/2018.
 */

public class Plash extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plash);

        ImageView imageView = (ImageView) findViewById(R.id.img);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.plash);

        imageView.startAnimation(animation);

        Thread timer = new Thread(){
            @Override
            public void run(){

                try {
                    sleep(4000);
                    Intent i = new Intent(getApplicationContext(), Main.class);
                    startActivity(i);
                    finish();
                    super.run();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }

        };

            timer.start();

    }

}
