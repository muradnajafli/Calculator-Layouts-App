package com.example.calculator_layout_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator_layout_app.databinding.ActivityConstraintLayoutBinding

class ConstraintLayoutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityConstraintLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)
        binding = ActivityConstraintLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val displayEditText = binding.editTextNumber

        val digitButtons = listOf(
            binding.button1, binding.button2, binding.button3, binding.button4,
            binding.button5, binding.button6, binding.button7, binding.button8,
            binding.button9
        )

        digitButtons.forEach { button ->
            button.setOnClickListener {
                displayEditText.append(button.text)
            }
        }

        val operatorButtons = listOf(
            binding.buttonPlus, binding.buttonMinus, binding.buttonMultiply
        )

        operatorButtons.forEach { button ->
            button.setOnClickListener {
                displayEditText.append(button.text)
            }
        }
    }
}