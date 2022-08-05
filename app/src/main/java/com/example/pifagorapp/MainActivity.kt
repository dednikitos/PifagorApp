package com.example.pifagorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pifagorapp.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import java.lang.Math.sqrt
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    fun onClickResult(view : View){
        if(!isFieldEmpty(bindingClass.edA) || !isFieldEmpty(bindingClass.edB))
            return
        val result = resources.getString(R.string.result_info) + getResult(bindingClass.edA, bindingClass.edB)
        bindingClass.tvResult.text = result
    }

    private fun isFieldEmpty(valueEd : TextInputEditText) : Boolean{
        if(valueEd.text.isNullOrEmpty()) {
            valueEd.error = resources.getString(R.string.error_info)
            return false
        }
        return true
    }

    private fun getResult(aEd : TextInputEditText, bEd : TextInputEditText) : String{
        val a : Double = aEd.text.toString().toDouble()
        val b : Double = bEd.text.toString().toDouble()

        return sqrt((a.pow(2) + b.pow(2))).toString()
    }
}