package com.studu.studu.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.studu.studu.R

class TentangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang)

        supportActionBar?.hide()
    }
}