package com.example.stdcapp.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.stdcapp.MainActivity
import com.example.stdcapp.R
import com.example.stdcapp.databinding.FragmentLoginBinding
import com.example.stdcapp.databinding.FragmentSlideshowBinding
import java.net.URI
import java.net.URL

class LoginFragment :Fragment() {
    private var _binding:FragmentLoginBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val editTextAccount :EditText = binding.editTextTextAccount
        val editTextPassword :EditText = binding.editTextTextPassword
        val button:Button = binding.buttonSubmit
        val root: View = binding.root
        button.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.nav_error)
            URL("").readText()
            URL("").readText()
            URL("").readText()
            URL("").readText()
        }

        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

