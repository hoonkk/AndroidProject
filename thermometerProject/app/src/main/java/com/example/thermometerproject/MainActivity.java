package com.example.thermometerproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMeasure, btnFormula, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMeasure =(Button)findViewById(R.id.btnMeasure);
        btnFormula= (Button)findViewById(R.id.btnFormula);
        btnExit =(Button)findViewById(R.id.btnExit);
        btnMeasure.setOnClickListener((View.OnClickListener) this);
        btnFormula.setOnClickListener((View.OnClickListener) this);
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
        else
        {
            finish();
        }
    }
}
