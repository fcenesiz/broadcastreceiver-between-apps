package com.fcenesiz.broadcastreceiverbetweenapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fcenesiz.broadcastreceiverbetweenapps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSendBroadcast.setOnClickListener {
            val intent = Intent("my.action.name")
            sendBroadcast(intent, "my.own.permission")
        }
    }
}