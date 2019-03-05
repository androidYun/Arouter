package com.guiyunli.pjt

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.basemoudle.arouter.ARouterManger


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val jump = findViewById<TextView>(R.id.jump)
        jump.setOnClickListener {
            ARouterManger.getHomeProvider().jumpHomeDetailActivity(this@MainActivity, "4151451515151")
        }
    }
}
