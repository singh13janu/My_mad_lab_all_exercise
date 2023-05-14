package com.example.janusingh_lecture_15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isdogimg=true;
    public void change(View view){
        ImageView iv=findViewById(R.id.imageView);
        if (isdogimg) {
            iv.setImageResource(R.drawable.carimg);
            isdogimg = false;
        }else
        {
            iv.setImageResource(R.drawable.dogimg);
            isdogimg=true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}