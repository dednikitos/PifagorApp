package com.example.pifagorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pifagorapp.databinding.ActivityMainBinding
import com.example.pifagorapp.databinding.TwoActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import java.lang.Math.sqrt
import kotlin.math.pow

class TwoMainActivity : AppCompatActivity() {

    lateinit var bindingClass : TwoActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = TwoActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    fun onClickResult(view : View){
        if(!isFieldEmpty(bindingClass.edC) || !isFieldEmpty(bindingClass.edCathetus))
            return
        val result = resources.getString(R.string.result_info) + getResult(bindingClass.edC, bindingClass.edCathetus)
        bindingClass.tvResult.text = result
    }

    private fun isFieldEmpty(valueEd : TextInputEditText) : Boolean{
        if(valueEd.text.isNullOrEmpty()) {
            valueEd.error = resources.getString(R.string.error_info)
            return false
        }
        return true
    }

    private fun getResult(cEd : TextInputEditText, a_bEd : TextInputEditText) : String{
        val c : Double = cEd.text.toString().toDouble()
        val a_b : Double = a_bEd.text.toString().toDouble()

        return sqrt((c.pow(2) - a_b.pow(2))).toString()
    }
}