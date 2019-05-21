package com.example.thermometerproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Thermometer extends AppCompatActivity {

    ImageView thermometer;
    ImageView humiditymeter;

    float temp, hum;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thermometer);
        temp = 20;
        hum = 15;

        thermometer = (ImageView)findViewById(R.id.thermometer);
        humiditymeter = (ImageView)findViewById(R.id.humiditymeter);

        if(temp<10)
            thermometer.setImageResource(R.drawable.thermometer4);
        else if(temp<20)
            thermometer.setImageResource(R.drawable.thermometer3);
        else if(temp<30)
            thermometer.setImageResource(R.drawable.thermometer2);
        else
            thermometer.setImageResource(R.drawable.thermometer1);

        if(hum<10)
            humiditymeter.setImageResource(R.drawable.humiditymeter1);
        else if(hum<20)
            humiditymeter.setImageResource(R.drawable.humiditymeter2);
        else if(hum<30)
            humiditymeter.setImageResource(R.drawable.humiditymeter3);
        else
            humiditymeter.setImageResource(R.drawable.humiditymeter4);
    }
}
