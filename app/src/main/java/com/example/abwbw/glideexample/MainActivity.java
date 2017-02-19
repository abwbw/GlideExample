package com.example.abwbw.glideexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.abwbw.glideexample.image.ImageUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageUtil.loadBitmap(this, null, null);
    }
}
