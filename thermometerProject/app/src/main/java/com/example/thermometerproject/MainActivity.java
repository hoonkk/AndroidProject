package com.example.thermometerproject;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMeasure, btnFormula, btnLog, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMeasure =(Button)findViewById(R.id.btnMeasure);
        btnFormula= (Button)findViewById(R.id.btnFormula);
        btnLog= (Button)findViewById(R.id.btnLog);
        btnExit =(Button)findViewById(R.id.btnExit);
        btnMeasure.setOnClickListener((View.OnClickListener) this);
        btnFormula.setOnClickListener((View.OnClickListener) this);
        btnLog.setOnClickListener((View.OnClickListener) this);
        btnExit.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v) {
        if(v.getId()==R.id.btnMeasure)
        {
            Intent intent = new Intent(getApplicationContext(), Thermometer.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.btnFormula)
        {
            Intent intent = new Intent(getApplicationContext(), Formula.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.btnLog)
        {
            Intent intent = new Intent(getApplicationContext(), Calendar.class);
            startActivity(intent);
        }
        else
        {
            finish();
        }
    }
}
