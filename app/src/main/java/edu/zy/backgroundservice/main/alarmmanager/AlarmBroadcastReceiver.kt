package edu.zy.backgroundservice.main.alarmmanager

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat
import edu.zy.backgroundservice.MainActivity
import edu.zy.backgroundservice.R
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.concurrent.atomic.AtomicInteger

class AlarmBroadcastReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        Log.e("AlarmBroadcastReceiver", "Received ${intent.data}")

        setNotification(context)
    }

    private fun setNotification(context: Context) {

        //region shared pref to monitor and cache notification ID
        val prefs: SharedPreferences = context.getSharedPreferences(
            "my_prefs",
            Context.MODE_PRIVATE
        )

        val cacheId = prefs.getInt("notification_id", 0)
        val editor: Editor = prefs.edit()
        editor.putInt("notification_id", AtomicInteger(cacheId).incrementAndGet())
        editor.apply()
        //endregion

        //region pending intent
        val pendingIntent = PendingIntent.getActivity(
            context, 0,
            Intent(context, MainActivity::class.java), 0
        )
        //endregion

        //region notification
        val mBuilder = NotificationCompat.Builder(context, "Your_channel_id")
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("My notification")
            .setContentText("Hello World! ${ZonedDateTime.now().toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm:ss"))}")

        mBuilder.setContentIntent(pendingIntent)
        mBuilder.setDefaults(Notification.DEFAULT_SOUND)
        val mNotificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val channelId = "Your_channel_id"
            val channel = NotificationChannel(
                channelId,
                "Channel human readable title",
                NotificationManager.IMPORTANCE_HIGH
            )
            mNotificationManager.createNotificationChannel(channel)
        }

        mNotificationManager.notify(cacheId, mBuilder.build())
        //endregion
    }
}