package com.example.myapplication_alerdialog_211b152;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Be Alert!")
                .setMessage("Follow social Distancing")
                .setNeutralButton("Ok",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog ,int which){
                        Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();

                    }

        }).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}