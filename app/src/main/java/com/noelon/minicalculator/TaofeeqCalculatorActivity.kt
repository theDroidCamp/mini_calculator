package com.noelon.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_taofeeq_calculator.*
import java.math.BigDecimal
import java.math.RoundingMode

class TaofeeqCalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taofeeq_calculator)

        btn_subtract.setOnClickListener() {
            subtract()
        }

        btn_add.setOnClickListener() {
            add()
        }

        btn_multiply.setOnClickListener() {
            multiply()
        }

        btn_divide.setOnClickListener() {
            divide()
        }
    }

    fun subtract() {
        if (inputIsNotEmpty()) {
            val input1 = inputNum1.text.toString().trim().toBigDecimal()
            val input2 = inputNum2.text.toString().trim().toBigDecimal()
            tv_result.text = input1.subtract(input2).toString()
        }
    }

    fun add() {
        if (inputIsNotEmpty()) {
            val input1 = inputNum1.text.toString().trim().toBigDecimal()
            val input2 = inputNum2.text.toString().trim().toBigDecimal()
            tv_result.text = input1.add(input2).toString()
        }
    }

    fun multiply() {
        if (inputIsNotEmpty()) {
            val input1 = inputNum1.text.toString().trim().toBigDecimal()
            val input2 = inputNum2.text.toString().trim().toBigDecimal()
            tv_result.text = input1.multiply(input2).toString()
        }
    }

    fun divide() {
        if (inputIsNotEmpty()) {
            val input1 = inputNum1.text.toString().trim().toBigDecimal()
            val input2 = inputNum2.text.toString().trim().toBigDecimal()
            if (input2.compareTo(BigDecimal.ZERO) == 0) {
                inputNum2.error = "Invalid input"
            }else {
                tv_result.text = input1.divide(input2, 2, RoundingMode.HALF_UP).toString()
            }
        }
    }


    fun inputIsNotEmpty() :Boolean {
        var b = true
        if (inputNum1.text.toString().trim().isEmpty()){
            inputNum1.error = "Required"
            b = false
        }
        if (inputNum2.text.toString().trim().isEmpty()){
            inputNum2.error = "Required"
            b = false
        }
        return b
    }
}