package com.studu.studu.ui.fragment.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.studu.studu.databinding.FragmentProfileBinding
import com.studu.studu.ui.*

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val profileViewModel =
            ViewModelProvider(this).get(ProfileViewModel::class.java)

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.ivEditProfile.setOnClickListener{
            val intent = Intent(activity, EditActivity::class.java)
            startActivity(intent)
        }

        binding.ivTentangAplikasi.setOnClickListener{
            val intent = Intent(activity, TentangActivity::class.java)
            startActivity(intent)
        }

        binding.btnKeluar.setOnClickListener{
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}