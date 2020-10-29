package com.noelon.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_emu.*
import java.math.BigDecimal
import java.math.RoundingMode


class EmuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emu)
        add_btn.setOnClickListener { add() }
        subtract_btn.setOnClickListener { subtract() }
        divide_btn.setOnClickListener { divide() }
        multiply_btn.setOnClickListener { multiply() }

    }

    fun add() {
        if (inputNotEmpty()) {
            val input1 = edit1.text.toString().trim().toBigDecimal()
            val input2 = edit2.text.toString().trim().toBigDecimal()
            result_text.text = input1.add(input2).toString()
        }
    }

    fun subtract() {
        if (inputNotEmpty()) {
            val input1 = edit1.text.toString().trim().toBigDecimal()
            val input2 = edit2.text.toString().trim().toBigDecimal()
            result_text.text = input1.subtract(input2).toString()
        }
    }

    fun multiply() {
        if (inputNotEmpty()) {
            val input1 = edit1.text.toString().trim().toBigDecimal()
            val input2 = edit2.text.toString().trim().toBigDecimal()
            result_text.text = input1.multiply(input2).toString()
        }
    }

    fun divide() {
        if (inputNotEmpty()) {
            val input1 = edit1.text.toString().trim().toBigDecimal()
            val input2 = edit2.text.toString().trim().toBigDecimal()
            if (input2.compareTo(BigDecimal.ZERO) == 0) {
                edit2.error = "Invalid Input"
            } else {
                result_text.text = input1.divide(input2, 2, RoundingMode.HALF_UP).toString()
            }
        }
    }

    fun inputNotEmpty(): Boolean {
        var b = true
        if (edit1.text.toString().trim().isEmpty()) {
            edit1.error = "Required"
            b = false
        }
        if (edit2.text.toString().trim().isEmpty()) {
            edit2.error = "Required"
            b = false
        }
        return b
    }
}