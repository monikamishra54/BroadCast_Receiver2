package com.example.mgc.broadcast_receiver2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"BroadCast Receiver Triggered",Toast.LENGTH_LONG).show();
    }
}







