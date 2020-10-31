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
            //val intent = Intent(this, EmuActivity::class.java)
            //startActivity(intent)
            //Todo: In case you want to test your work, uncomment this intent to lead to your activity, but comment it back when you're done

//            val intent = Intent(this, BasicCalculator::class.java)
 //           startActivity(intent)

            //val intent = Intent(this, CalculatorActivity::class.java)
            //val intent = Intent(this, BerylMiniCalc::class.java)
            // startActivity(intent)

            //val intent = Intent(this, TaofeeqCalculatorActivity::class.java)

            //startActivity(intent)

            val intent = Intent(this, OscarCalculatorActivity::class.java)
            startActivity(intent)
        }
    }
}