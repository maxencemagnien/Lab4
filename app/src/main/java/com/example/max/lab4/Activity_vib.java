package com.example.max.lab4;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Activity_vib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vib);


        Button button =(Button)findViewById(R.id.vib);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long pattern[]={0,200,100,300,400};


                Vibrator vib = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                vib.vibrate(pattern, -1);


            }
        });



    }
}
