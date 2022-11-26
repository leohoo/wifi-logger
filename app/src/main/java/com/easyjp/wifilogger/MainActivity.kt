package com.easyjp.wifilogger

import android.content.Context
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.easyjp.wifilogger.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        updateWifiName()
    }

    fun updateWifiName() {
        val wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

        wifiManager.let {
            val info = wifiManager.connectionInfo
            info?.let {
                var ssid = info.ssid
                binding.wifiName.text = "Connected to $ssid"
            }

        }
    }
}