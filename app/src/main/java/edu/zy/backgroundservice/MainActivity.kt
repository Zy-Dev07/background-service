package edu.zy.backgroundservice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import edu.zy.backgroundservice.main.alarmmanager.AlarmManagerActivity
import edu.zy.backgroundservice.main.workmanager.WorkManagerActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        findViewById<Button>(R.id.workManager).setOnClickListener {

            val intent = Intent(this, WorkManagerActivity::class.java)
            startActivity(intent)
            finish()
        }

        findViewById<Button>(R.id.alarmManager).setOnClickListener {

            val intent = Intent(this, AlarmManagerActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}