package com.example.abwbw.glideexample.image;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/**
 * Created by abwbw on 2017/2/19.
 */

public class DrawableResource {
    private static final int DEFAULT_RESOURCE_ID = -1;
    private static final Drawable DEFAULT_RESOURCE_DRAWABLE = new BitmapDrawable();

    private final int resId;
    private final Drawable resDrawable;

    public DrawableResource(int resourceID){
        resId = resourceID;
        resDrawable = DEFAULT_RESOURCE_DRAWABLE;
    }

    public DrawableResource(Drawable resouceDrawable){
        resDrawable = resouceDrawable;
        resId = DEFAULT_RESOURCE_ID;
    }

    public boolean isNull(){
        return resDrawable == DEFAULT_RESOURCE_DRAWABLE  && resId == DEFAULT_RESOURCE_ID;
    }

    public boolean isResourceIDNull(){
        return resId == DEFAULT_RESOURCE_ID;
    }

    public boolean isResourceDrawableNull(){
        return resDrawable == DEFAULT_RESOURCE_DRAWABLE;
    }

    public int getResourceID(){
        return resId;
    }

    public Drawable getResouceDrawable(){
        return resDrawable;
    }
}
