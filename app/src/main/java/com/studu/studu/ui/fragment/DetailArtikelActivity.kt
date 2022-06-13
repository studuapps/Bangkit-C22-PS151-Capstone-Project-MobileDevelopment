package com.studu.studu.ui.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.studu.studu.R

class DetailArtikelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_artikel)

        supportActionBar?.hide()
    }
}