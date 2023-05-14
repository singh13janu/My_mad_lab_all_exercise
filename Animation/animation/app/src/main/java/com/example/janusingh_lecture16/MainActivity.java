package com.example.janusingh_lecture16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isbird=true;
    public void change(View view)
    {
        ImageView imageView=findViewById(R.id.imageView);
        ImageView imageView2=findViewById(R.id.imageView2);
        if(isbird){
            imageView.animate().alpha(1).setDuration(2000);
            imageView2.animate().alpha(0).setDuration(2000);
            isbird=false;
        }
        else{
            imageView.animate().alpha(0).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);
            isbird=true;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.imageView);
        imageView.animate().setDuration(2000).rotationY(360);


    }
}