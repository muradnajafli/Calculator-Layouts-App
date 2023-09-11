package com.example.calculator_layout_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator_layout_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLinear.setOnClickListener {
            startActivity(Intent(this, LinearLayoutActivity::class.java))
        }

        binding.buttonFrame.setOnClickListener {
            startActivity(Intent(this, FrameLayoutActivity::class.java))
        }

        binding.buttonConstraint.setOnClickListener {
            startActivity(Intent(this, ConstraintLayoutActivity::class.java))
        }

    }
}