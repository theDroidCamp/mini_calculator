package com.noelon.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_dianah__mini__calculator.*


class Dianah_Mini_Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dianah__mini__calculator)




        subtraction_button.setOnClickListener() {

            val firstNum = findViewById<EditText>(R.id.first_no);
            val secondNum = findViewById<EditText>(R.id.second_no);


            if (firstNum.text.toString().trim().isEmpty()) {

                firstNum.error = "Required"

            }

            if (secondNum.text.toString().trim().isEmpty()) {

                secondNum.error = "Required"

            }

            if (firstNum.text.toString().trim().isNotEmpty() && secondNum.text.toString().trim()
                    .isNotEmpty()
            ) {
                try {
                    val x = firstNum?.text.toString().toDouble();
                    val y = secondNum?.text.toString().toDouble();
                    val z = x - y;
                    val ans = z.toString();
                    answer.text =
                        "$ans"
                } catch (e: NumberFormatException) {
                    try {
                        val x = firstNum?.text.toString().toDouble();
                    } catch (e: NumberFormatException) {
                        firstNum.error = "Enter Valid Number"
                    }

                    try {
                        val y = secondNum?.text.toString().toDouble();
                    } catch (e: NumberFormatException) {
                        secondNum.error = "Enter Valid Number"
                    }
                }


            }

        }

        addition_button.setOnClickListener() {

            val firstNum = findViewById<EditText>(R.id.first_no);
            val secondNum = findViewById<EditText>(R.id.second_no);


            if (firstNum.text.toString().trim().isEmpty()) {

                firstNum.error = "Required"

            }

            if (secondNum.text.toString().trim().isEmpty()) {

                secondNum.error = "Required"

            }

            if (firstNum.text.toString().trim().isNotEmpty() && secondNum.text.toString().trim()
                    .isNotEmpty()
            ) {
                try {
                    val x = firstNum?.text.toString().toDouble();
                    val y = secondNum?.text.toString().toDouble();
                    val z = x + y;
                    val ans = z.toString();
                    answer.text =
                        "$ans"
                } catch (e: NumberFormatException) {
                    try {
                        val x = firstNum?.text.toString().toDouble();
                    } catch (e: NumberFormatException) {
                        firstNum.error = "Enter Valid Number"
                    }

                    try {
                        val y = secondNum?.text.toString().toDouble();
                    } catch (e: NumberFormatException) {
                        secondNum.error = "Enter Valid Number"
                    }
                }


            }


        }

        multiplication_button.setOnClickListener() {

            val firstNum = findViewById<EditText>(R.id.first_no);
            val secondNum = findViewById<EditText>(R.id.second_no);


            if (firstNum.text.toString().trim().isEmpty()) {

                firstNum.error = "Required"

            }

            if (secondNum.text.toString().trim().isEmpty()) {

                secondNum.error = "Required"

            }

            if (firstNum.text.toString().trim().isNotEmpty() && secondNum.text.toString().trim()
                    .isNotEmpty()
            ) {
                try {
                    val x = firstNum?.text.toString().toDouble();
                    val y = secondNum?.text.toString().toDouble();
                    val z = x * y;
                    val ans = z.toString();
                    answer.text =
                        "$ans"
                } catch (e: NumberFormatException) {
                    try {
                        val x = firstNum?.text.toString().toDouble();
                    } catch (e: NumberFormatException) {
                        firstNum.error = "Enter Valid Number"
                    }

                    try {
                        val y = secondNum?.text.toString().toDouble();
                    } catch (e: NumberFormatException) {
                        secondNum.error = "Enter Valid Number"
                    }
                }


            }


        }

        division_button.setOnClickListener() {

            val firstNum = findViewById<EditText>(R.id.first_no);
            val secondNum = findViewById<EditText>(R.id.second_no);


            if (firstNum.text.toString().trim().isEmpty()) {

                firstNum.error = "Required"

            }

            if (secondNum.text.toString().trim().isEmpty()) {

                secondNum.error = "Required"

            }

            if (firstNum.text.toString().trim().isNotEmpty() && secondNum.text.toString().trim()
                    .isNotEmpty()
            ) {
                try {
                    val x = firstNum?.text.toString().toDouble();
                    val y = secondNum?.text.toString().toDouble();
                    val z = x / y;
                    val ans = z.toString();
                    answer.text =
                        "$ans"
                } catch (e: NumberFormatException) {
                    try {
                        val x = firstNum?.text.toString().toDouble();
                    } catch (e: NumberFormatException) {
                        firstNum.error = "Enter Valid Number"
                    }

                    try {
                        val y = secondNum?.text.toString().toDouble();
                    } catch (e: NumberFormatException) {
                        secondNum.error = "Enter Valid Number"
                    }
                }


            }

        }


    }

}
