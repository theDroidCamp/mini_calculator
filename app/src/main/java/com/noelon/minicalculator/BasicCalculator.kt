package com.noelon.minicalculator

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.noelon.minicalculator.databinding.ActivityBasicCalculatorBinding

class BasicCalculator : AppCompatActivity() {

    private lateinit var binding:ActivityBasicCalculatorBinding
    private lateinit var firstValue: EditText
    private lateinit var secondValue: EditText
    private lateinit var total: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBasicCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firstValue = binding.firstValue
        secondValue = binding.secondValue
        total = binding.total

        binding.minus.setOnClickListener{ calculate(binding.minus) }
        binding.plus.setOnClickListener{ calculate(binding.plus) }
        binding.multiply.setOnClickListener{ calculate(binding.multiply) }
        binding.divide.setOnClickListener{ calculate(binding.divide)}
    }

    private fun viewIsNotEmpty(): Boolean {
        var numEntered = true
        if (TextUtils.isEmpty(firstValue.text) || TextUtils.isEmpty(secondValue.text)) {
            Toast.makeText(this , "Two numbers are required", Toast.LENGTH_SHORT).show()
            numEntered = false
        }
        return numEntered
    }

    private fun calculate(symbol: View?) {
        when (symbol) {
            binding.minus -> {
                if (viewIsNotEmpty()) {
                    val first = firstValue.text.toString().toInt()
                    val second = secondValue.text.toString().toInt()
                    val difference = first.minus(second)
                    total.text = difference.toString()
                }
            }

            binding.plus -> {
                if (viewIsNotEmpty()) {
                    val first = firstValue.text.toString().toInt()
                    val second = secondValue.text.toString().toInt()
                    val sum = first.plus(second)
                    total.text = sum.toString()
                }
            }

            binding.multiply -> {
                if (viewIsNotEmpty()) {
                    val first = firstValue.text.toString().toInt()
                    val second = secondValue.text.toString().toInt()
                    val product = first.times(second)
                    total.text = product.toString()
                }
            }

            binding.divide -> {
                if (viewIsNotEmpty()) {
                    val first = firstValue.text.toString().toInt()
                    val second = secondValue.text.toString().toInt()
                    val ratio = first.div(second)
                    total.text = ratio.toString()
                }
            }
        }
    }
}