package com.nightstalker.kbsustudentassistant.core

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nightstalker.kbsustudentassistant.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}