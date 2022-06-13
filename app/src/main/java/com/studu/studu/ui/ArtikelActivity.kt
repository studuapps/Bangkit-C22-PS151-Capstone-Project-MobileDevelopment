package com.studu.studu.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.studu.studu.databinding.ActivityArtikelBinding
import com.studu.studu.ui.fragment.DetailArtikelActivity

private lateinit var binding: ActivityArtikelBinding

class ArtikelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArtikelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.imageView5.setOnClickListener {
            val intent = Intent(this, DetailArtikelActivity::class.java)
            startActivity(intent)
        }
    }
}