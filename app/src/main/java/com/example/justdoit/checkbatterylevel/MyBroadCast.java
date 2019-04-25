package com.example.justdoit.checkbatterylevel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.SeekBar;
import android.widget.TextView;

public class MyBroadCast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
        MainActivity.setValues(level);

    }
}
