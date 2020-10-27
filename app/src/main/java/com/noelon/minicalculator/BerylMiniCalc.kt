package com.noelon.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_berylminicalc.*


class BerylMiniCalc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berylminicalc)

        val a= no1.text.toString().toInt()
        val b=no2.text.toString().toInt()

        button.setOnClickListener {
            this.textView.text= "${a+b}"
        }
        button2.setOnClickListener {
            this.textView.text="${a-b}"
        }
        button3.setOnClickListener {
            this.textView.text="${a*b}"
        }
        button4.setOnClickListener {
            this.textView.text="${a/b}"
        }
    }
}




