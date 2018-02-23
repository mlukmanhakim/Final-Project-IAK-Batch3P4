package com.lukman.beautyfullombok;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Ojiq on 14/02/2018.
 */

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public  SlideAdapter(Context context){
        this.context = context;

    }

    //    Array
    public  int [] slide_image = {
            R.drawable.budaya_peresean,
            R.drawable.budaya_gendang_beleq,
            R.drawable.budaya_nyongkolan,

    };


    public  String [] slide_heading = {
            "Peresean",
            "Gendang Beleq",
            "Nyongkolan"
    };

    public int [] slide_desc = {
            R.string.peresean,
            R.string.gendang_beleq,
            R.string.desc_nyongkolan
    };

    public int[] slide_bg_image ={
            R.drawable.budaya_bg_peresean_blur,
            R.drawable.budaya_gendang_belek_blur,
            R.drawable.budaya_bg_nyongkolan
    };




    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == (LinearLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_budaya_layout, container,  false);
        ImageView slideBgImage = (ImageView) view.findViewById(R.id.slide_bg_image);
        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDesc = (TextView) view.findViewById(R.id.slide_desc);

        slideBgImage.setImageResource(slide_bg_image[position]);
        slideImageView.setImageResource(slide_image[position]);
        slideHeading.setText(slide_heading[position]);
        slideDesc.setText(slide_desc[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
