package com.studu.studu.ui.fragment.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.studu.studu.R
import com.studu.studu.databinding.FragmentHomeBinding
import com.studu.studu.ui.ArtikelActivity
import com.studu.studu.ui.HitungActivity
import com.studu.studu.ui.RiwayatActivity
import com.studu.studu.ui.fragment.DetailArtikelActivity
import com.studu.studu.ui.fragment.profile.ProfileFragment

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.imageView4.setOnClickListener{
            val intent = Intent(activity, HitungActivity::class.java)
            startActivity(intent)
        }

        binding.ivSelengkapnyaRp.setOnClickListener{
            val intent = Intent(activity, RiwayatActivity::class.java)
            startActivity(intent)
        }

        binding.ivSelengkapnyaArtikel.setOnClickListener{
            val intent = Intent(activity, ArtikelActivity::class.java)
            startActivity(intent)
        }

        binding.ivStunting1.setOnClickListener{
            val intent = Intent(activity, DetailArtikelActivity::class.java)
            startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}