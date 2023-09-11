package com.example.calculator_layout_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator_layout_app.databinding.ActivityLinearLayoutBinding

class LinearLayoutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLinearLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLinearLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val displayEditText = binding.editText

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