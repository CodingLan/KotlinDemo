package com.lxq.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.lxq.base.startActivityU
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivityU(this, MainActivity::class.java, null, null, null)
    }

    fun init() {
        var url = ""
        Glide.with(this).load(url).into(imgView)
    }
}
