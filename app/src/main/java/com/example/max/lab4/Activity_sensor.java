package com.example.max.lab4;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Activity_sensor extends AppCompatActivity {

    TextView close;
    Sensor proximitySensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);


         close = (TextView) findViewById(R.id.textView);
        close.setVisibility(View.INVISIBLE);

        SensorManager sensorManager =  (SensorManager)getSystemService(SENSOR_SERVICE);
        proximitySensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);


        if(proximitySensor == null) {}

        SensorEventListener proximitySensorListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent){

                if(sensorEvent.values[0] < proximitySensor.getMaximumRange()) {
                    close.setVisibility(View.VISIBLE);
                }

                else {
                    close.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

        };

        sensorManager.registerListener(proximitySensorListener, proximitySensor, SensorManager.SENSOR_DELAY_NORMAL);


    }
}
