package com.example.mgc.broadcast_receiver2;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    BroadcastReceiver broadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        broadcastReceiver= new MyBroadcast();
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter= new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        registerReceiver(broadcastReceiver,intentFilter);
    }
    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcastReceiver);
    }
}


