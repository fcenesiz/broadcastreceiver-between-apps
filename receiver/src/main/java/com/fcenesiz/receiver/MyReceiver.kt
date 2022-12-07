package com.fcenesiz.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    companion object{
        public val TAG: String = MyReceiver::class.simpleName.toString()
    }

    override fun onReceive(p0: Context?, p1: Intent?) {
        Log.i(TAG, "Got some data!")
        Toast.makeText(p0, "Got some data!", Toast.LENGTH_LONG).show()
    }
}