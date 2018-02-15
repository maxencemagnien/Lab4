package com.example.max.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_sms extends AppCompatActivity {

    EditText sms;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        Button smsButton = (Button) findViewById(R.id.sms);

        sms= (EditText) findViewById(R.id.message);

        smsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                message = sms.getText().toString();

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage("+524421071633", null, message,null,null);

                sms.setText("Sms sent");
                finish();
            }
        });
    }
}
