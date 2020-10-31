package com.noelon.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_oscar_calculator.*

class OscarCalculatorActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oscar_calculator)
        addUp()
        minus()
        multiply()
        divide()
        clear()



    }

    fun isEmptyField(): Boolean{
        var check = true
      if( editText_num1.text.toString().isNotEmpty() && editText_num2.text.toString().isNotEmpty()) {
          return check;
      }
        else
          check = false
        return  check
    }

    private fun addUp(){
        button_add.setOnClickListener(View.OnClickListener {
            if(isEmptyField()) {
                val num1 = editText_num1.text.toString().toDouble()
                val num2 = editText_num2.text.toString().toDouble()
                textView_result_screen.text = "$num1 + $num2 = \n${num1 + num2}"
            }
            else textView_result_screen.text= "Input Values"
        })


    }

    private fun minus(){
        button_minus.setOnClickListener(View.OnClickListener {
            if(isEmptyField()){
                val num1 = editText_num1.text.toString().toDouble()
                val num2 = editText_num2.text.toString().toDouble()
                textView_result_screen.text = "$num1 - $num2 = \n${num1 - num2}"
            }
            else textView_result_screen.text= "Input Values"
        })

    }

    private fun multiply(){
        button_multiply.setOnClickListener(View.OnClickListener {
            if(isEmptyField()){
                val num1 = editText_num1.text.toString().toDouble()
                val num2 = editText_num2.text.toString().toDouble()
                textView_result_screen.text = " $num1 X $num2 =\n${num1 * num2}"
            }
            else textView_result_screen.text= "Input Values"
        })

    }

    private fun divide() {
        button_divide.setOnClickListener(View.OnClickListener {
            if (!isEmptyField())
                textView_result_screen.text= "Input Values"
            else{
                if (editText_num2.text.toString().toInt() == 0)
                    textView_result_screen.text ="Math Error \n Cannot divide by Zero"
                else{
                    val num1 = editText_num1.text.toString().toDouble()
                    val num2 = editText_num2.text.toString().toDouble()
                    textView_result_screen.text = " $num1 / $num2 = \n ${num1/num2}"
                }
            }

        })
    }

    fun clear(){
        floatingActionButton.setOnClickListener(View.OnClickListener {
            editText_num1.text.clear()
            editText_num2.text.clear()
            textView_result_screen.text = ""
        })
    }


}