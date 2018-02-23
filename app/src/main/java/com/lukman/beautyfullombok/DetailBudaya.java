package com.lukman.beautyfullombok;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Ojiq on 14/02/2018.
 */

public class DetailBudaya extends AppCompatActivity {
    private ViewPager mSlideViewPager;
    private ImageView imageViewClose;


    private SlideAdapter sliderAapter;
    private int mCurrentPage;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_budaya);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        sliderAapter = new SlideAdapter(this);
        mSlideViewPager.setAdapter(sliderAapter);

        imageViewClose = (ImageView) findViewById(R.id.imgClose);

        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }


}
