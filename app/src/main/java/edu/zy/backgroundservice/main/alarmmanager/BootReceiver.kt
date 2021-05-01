package edu.zy.backgroundservice.main.alarmmanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class BootReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        if ("android.intent.action.BOOT_COMPLETED" == intent.action) {

            Log.e("BootReceiver", "Notify who ever needs to know that this app went from a reboot")
            // save to cache that this app rebooted
        }
    }
}