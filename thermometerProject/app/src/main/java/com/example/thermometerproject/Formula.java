package com.example.thermometerproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class Formula extends AppCompatActivity implements View.OnClickListener{
    LinearLayout btnHome;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formula);

        btnHome =(LinearLayout)findViewById(R.id.btnHome2);
        btnHome.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v)
    {
        finish();
    }
}
