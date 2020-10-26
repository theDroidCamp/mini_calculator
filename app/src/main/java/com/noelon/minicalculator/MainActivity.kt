package com.noelon.minicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button_next.setOnClickListener {

            //Todo: Incase you want to test your work, uncomment this intent to lead to your activity, but comment it back when you're done

//            val intent = Intent(this, TaofeeqCalculatorActivity::class.java)
//            startActivity(intent)
        }
    }
}