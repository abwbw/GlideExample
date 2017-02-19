package com.example.abwbw.glideexample.image;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Created by abwbw on 2017/2/18.
 */

public class ImageUtil {
    public static void loadBitmap(Context context, String url, ImageView target){
        Glide.with(context).load(url).diskCacheStrategy(DiskCacheStrategy.RESULT);
    }

    public void loadBitmap(Context context, ImageView target){

    }
}
