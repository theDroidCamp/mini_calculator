package com.noelon.minicalculator

import android.graphics.Insets.subtract
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_chibufirst.*

class ChibufirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chibufirst)
    }

    fun validateInputs(view: View) {
        val num1: String = edit_first.text.toString().trim()
        val num2: String = edit_second.text.toString().trim()

        if (num1.isEmpty()) {
            edit_first.error = "Enter the first number"
            edit_first.requestFocus()
        } else {
            if (num2.isEmpty()) {
                edit_second.error = "Enter the second number"
                edit_second.requestFocus()
            } else {
                when (view.id) {
                    R.id.button_add -> add(num1.toDouble(), num2.toDouble())
                    R.id.button_subtract -> subtract(num1.toDouble(), num2.toDouble())
                    R.id.button_multiply -> multiply(num1.toDouble(), num2.toDouble())
                    R.id.button_divide -> divide(num1.toDouble(), num2.toDouble())
                    else -> return
                }
            }
        }
    }

    private fun add(num1: Double, num2: Double) {
        text_answer.text = (num1 + num2).toString()
    }

    private fun subtract(num1: Double, num2: Double) {
        text_answer.text = (num1 - num2).toString()
    }

    private fun multiply(num1: Double, num2: Double) {
        text_answer.text = (num1 * num2).toString()
    }

    private fun divide(num1: Double, num2: Double) {
        text_answer.text = (num1 / num2).toString()
    }
}