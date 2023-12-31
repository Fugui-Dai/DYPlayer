package com.dfg.dyplayer

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dfg.dyplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binder: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binder.root)

        binder.btnStart.setOnClickListener{
            binder.dy3.start()
        }

        binder.btnStop.setOnClickListener{
            binder.dy3.stop()
        }
    }
}