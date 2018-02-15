package com.example.max.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context= getApplicationContext();

        Button vibButton, sensorButton, smsButton;

        vibButton= (Button) findViewById(R.id.button);
        sensorButton= (Button) findViewById(R.id.button2);
        smsButton= (Button) findViewById(R.id.button3);

        vibButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, Activity_vib.class);

                startActivity(intent);
            }
        });

        sensorButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Activity_sensor.class);

                startActivity(intent);

            }
        });

        smsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context, Activity_sms.class);

                startActivity(intent);
            }
        });


    }
}
