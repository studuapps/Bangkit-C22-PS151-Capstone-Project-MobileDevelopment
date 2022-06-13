package com.studu.studu.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.studu.studu.databinding.ActivityHitungBinding

private lateinit var binding: ActivityHitungBinding

class HitungActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHitungBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btnHitung.setOnClickListener {
            val intent = Intent(this, HasilActivity::class.java)
            startActivity(intent)
        }
    }
}