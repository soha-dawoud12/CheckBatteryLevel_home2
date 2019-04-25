package com.example.justdoit.checkbatterylevel;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static SeekBar seekBar;
    static  TextView batteryTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batteryTxt =findViewById(R.id.batteryTxt);
        seekBar= findViewById(R.id.seekBar);


        MyBroadCast myBroadCast= new MyBroadCast();

        this.registerReceiver(myBroadCast,
                new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

    }

    public  static void setValues(int level ){
        batteryTxt.setText(level + "%");
        seekBar.setProgress(level);
        seekBar.setMax(100);
    }
}
