package com.example.sensortext;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SensorManager mSensorManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StringBuffer sb = new StringBuffer("");



        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);


        if (mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null) {

            sb.append("Sensor.TYPE_ACCELEROMETER\n");

        } else {

// Failure! No magnetometer.

        }


        if (mSensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE) != null) {

            sb.append("Sensor.TYPE_AMBIENT_TEMPERATURE\n");


        } else { sb.append("온도센서감지불가\n");

// Failure! No magnetometer.

        }


        if (mSensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY) != null) {

            sb.append("Sensor.TYPE_GRAVITY\n");

        } else {

// Failure! No magnetometer.

        }


        if (mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE) != null) {

            sb.append("Sensor.TYPE_GYROSCOPE\n");

        } else {

// Failure! No magnetometer.

        }


        if (mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT) != null) {

            sb.append("Sensor.TYPE_LIGHT\n");

        } else {

// Failure! No magnetometer.

        }


        if (mSensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION) != null) {

            sb.append("Sensor.TYPE_LINEAR_ACCELERATION\n");

        } else {

// Failure! No magnetometer.

        }


        if (mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD) != null) {

            sb.append("Sensor.TYPE_MAGNETIC_FIELD\n");

        } else {

// Failure! No magnetometer.

        }


        if (mSensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION) != null) {

            sb.append("Sensor.TYPE_ORIENTATION\n");

        } else {

// Failure! No magnetometer.

        }


        if (mSensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE) != null) {

            sb.append("Sensor.TYPE_PRESSURE\n");

        } else {

// Failure! No magnetometer.

        }


        if (mSensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY) != null) {

            sb.append("Sensor.TYPE_PROXIMITY\n");

        } else {

// Failure! No magnetometer.

        }


        if (mSensorManager.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY) != null) {

            sb.append("Sensor.TYPE_RELATIVE_HUMIDITY\n");

        } else {

// Failure! No magnetometer.

        }


        if (mSensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR) != null) {

            sb.append("Sensor.TYPE_ROTATION_VECTOR\n");

        } else {

// Failure! No magnetometer.

        }


        if (mSensorManager.getDefaultSensor(Sensor.TYPE_TEMPERATURE) != null) {

            sb.append("Sensor.TYPE_TEMPERATURE\n");

        } else { sb.append("온도센서 감지불가\n");

// Failure! No magnetometer.

        }


        TextView tv = (TextView)findViewById(R.id.textView);

        tv.setText(sb.toString());

    }

}
