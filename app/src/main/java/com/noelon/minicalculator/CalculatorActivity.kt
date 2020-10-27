package com.noelon.minicalculator

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.noelon.minicalculator.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityCalculatorBinding
    private lateinit var firstNumEt: EditText
    private lateinit var secondNumEt: EditText
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        firstNumEt = binding.firstNumEt
        secondNumEt = binding.secondNumEt
        result = binding.resultTv

        binding.addBtn.setOnClickListener { onClick(binding.addBtn) }
        binding.subtractBtn.setOnClickListener { onClick(binding.subtractBtn) }
        binding.multiplyBtn.setOnClickListener { onClick(binding.multiplyBtn) }
        binding.divideBtn.setOnClickListener { onClick(binding.divideBtn) }


    }

    private fun viewIsNotEmpty(): Boolean {
        var filled = true
        if (TextUtils.isEmpty(firstNumEt.text) || TextUtils.isEmpty(secondNumEt.text)) {
            Toast.makeText(this, "All fields are required!", Toast.LENGTH_SHORT).show()
            filled =false
        }
        return filled
    }

        override fun onClick(v: View?) {
            when (v) {
                binding.addBtn -> {
                    if (viewIsNotEmpty()) {
                        val firstNumber: Int = firstNumEt.text.toString().toInt()
                        val secondNumber: Int = secondNumEt.text.toString().toInt()
                        val sum = firstNumber.plus(secondNumber)
                        result.text = sum.toString()
                    }
                }
                binding.subtractBtn -> {
                    if (viewIsNotEmpty()) {
                        val firstNumber: Int = firstNumEt.text.toString().toInt()
                        val secondNumber: Int = secondNumEt.text.toString().toInt()
                        val difference = firstNumber.minus(secondNumber)
                        result.text = difference.toString()
                    }
                }
                binding.multiplyBtn -> {
                    if (viewIsNotEmpty()) {
                        val firstNumber: Int = firstNumEt.text.toString().toInt()
                        val secondNumber: Int = secondNumEt.text.toString().toInt()
                        val product = firstNumber.times(secondNumber)
                        result.text = product.toString()
                    }
                }
                binding.divideBtn -> {
                    if (viewIsNotEmpty()) {
                        val firstNumber: Float = firstNumEt.text.toString().toFloat()
                        val secondNumber: Float = secondNumEt.text.toString().toFloat()
                        val quotient = firstNumber.div(secondNumber)
                        result.text = quotient.toString()
                    }
                }
            }
        }

}