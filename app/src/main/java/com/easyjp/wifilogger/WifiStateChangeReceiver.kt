package com.easyjp.wifilogger

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class WifiStateChangeReceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        Log.d("StateChangeReceiver", "State Changed")
    }
}