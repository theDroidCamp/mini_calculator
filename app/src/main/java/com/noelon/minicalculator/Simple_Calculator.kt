package com.noelon.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.noelon.minicalculator.databinding.ActivitySimpleCalculatorBinding
import java.math.RoundingMode

class Simple_Calculator : AppCompatActivity() {

    private lateinit var binding: ActivitySimpleCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple__calculator)

        binding = ActivitySimpleCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addButton.setOnClickListener {
            add()
        }
        binding.substractButton.setOnClickListener {
            subtract()
        }
        binding.multiplyButton.setOnClickListener {
            multiply()
        }
        binding.divisionButton.setOnClickListener {
            divide()
        }
    }

    fun add() {
        if (inputisnotempty()) {
            val firstInput = binding.firstInput.text.toString().toBigDecimal()
            val secondInput = binding.secondInput.text.toString().toBigDecimal()
            binding.calculatedView.text = firstInput.add(secondInput).toString()

        }
    }

    fun subtract() {
        if (inputisnotempty()) {
            val firstInput = binding.firstInput.text.toString().toBigDecimal()
            val secondInput = binding.secondInput.text.toString().toBigDecimal()
            binding.calculatedView.text = firstInput.subtract(secondInput).toString()
        }
    }



    fun multiply() {
        if (inputisnotempty()) {
            val firstInput = binding.firstInput.text.toString().toBigDecimal()
            val secondInput = binding.secondInput.text.toString().toBigDecimal()
            binding.calculatedView.text = firstInput.multiply(secondInput).toString()
        }
    }

    fun divide() {
        if (inputisnotempty()) {
            val firstInput = binding.firstInput.text.toString().toBigDecimal()
            val secondInput = binding.secondInput.text.toString().toBigDecimal()
            binding.calculatedView.text = firstInput.divide(secondInput, 2, RoundingMode.HALF_UP).toString()
        }
    }



    fun inputisnotempty() :Boolean {
        var input = true
        if (binding.firstInput.toString().isEmpty()) {
            input = false
        }

        if (binding.secondInput.toString().isEmpty()) {
            input = false
        }

        return input
    }
}


