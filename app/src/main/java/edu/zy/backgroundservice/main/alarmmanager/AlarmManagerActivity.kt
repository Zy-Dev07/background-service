package edu.zy.backgroundservice.main.alarmmanager

import android.app.Activity
import android.app.AlarmManager
import android.app.PendingIntent
import android.app.PendingIntent.FLAG_UPDATE_CURRENT
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import edu.zy.backgroundservice.R
import java.time.ZoneId
import java.time.ZonedDateTime


class AlarmManagerActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_manager)

        val alarmRequestCode = 59
        val alarmManager = applicationContext.getSystemService(Activity.ALARM_SERVICE) as AlarmManager

        val alarmDateInFuture1 = ZonedDateTime.of(2021, 5, 1, 20, 46, 17, 0, ZoneId.systemDefault())
        val alarmDateInFuture2 = ZonedDateTime.now().plusSeconds(4)

        findViewById<Button>(R.id.createAlarm).setOnClickListener {
            alarmManager.set(
                AlarmManager.RTC_WAKEUP, alarmDateInFuture2.toInstant().toEpochMilli(), Intent(applicationContext, AlarmBroadcastReceiver::class.java).let { intent ->
                    PendingIntent.getBroadcast(applicationContext, alarmRequestCode, intent, FLAG_UPDATE_CURRENT)
                }
            )
        }

        findViewById<Button>(R.id.cancelAlarm).setOnClickListener {
            alarmManager.cancel(Intent(applicationContext, AlarmBroadcastReceiver::class.java).let { intent ->
                PendingIntent.getBroadcast(applicationContext, alarmRequestCode, intent, FLAG_UPDATE_CURRENT)
            })
        }
    }
}