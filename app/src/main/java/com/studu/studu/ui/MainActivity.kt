package com.studu.studu.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.studu.studu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var email: String? = null
    private var password: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btnMasuk.setOnClickListener {
            email = binding.etEmail.text.toString()
            password = binding.etPassword.text.toString()
            if( email!!.length < 1) {
                Toast.makeText(this@MainActivity,"Email tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            } else if(password!!.length < 1){
                Toast.makeText(this@MainActivity,"Password tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }

        binding.tvDaftar.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}