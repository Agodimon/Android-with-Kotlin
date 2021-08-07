package com.bignerdranch.android.androidwithkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        getChangeTextByPressSwitch()

        val btnPersList = findViewById<View>(R.id.btn_getListPerson)
        btnPersList.setOnClickListener(View.OnClickListener { view ->
            GetNamePersonList()
        })

        val btn = findViewById<View>(R.id.btn_getNamePerson)
        btn.setOnClickListener(View.OnClickListener { view ->
            getNamePerson()
        })


    }

    private fun getChangeTextByPressSwitch() {
        val switchChangeText = findViewById<SwitchCompat>(R.id.sw_switch1)
        switchChangeText.setOnClickListener() {
            when (switchChangeText.isChecked) {
                true -> getTextOnPressSwitch()
                else -> getTextOnPressSwitchOne()
            }
        }

    }

    @SuppressLint("SetTextI18n")
    private fun getTextOnPressSwitch() {
        val texts = findViewById<TextView>(R.id.textView_for_switch)
        texts.text = "изменил текст, switch нажат(активен)"
    }

    @SuppressLint("SetTextI18n")
    private fun getTextOnPressSwitchOne() {
        val textsOne = findViewById<TextView>(R.id.textView_for_switch)
        textsOne.text = "еще раз нажми switch"
    }

    private fun GetNamePersonList() {
        for (namePers in NamePerson.values()) {
            Log.i("TAG", "${namePers.firstNameOne} ${namePers.secondNameTwo}")
        }
    }

    private fun getNamePerson() {
        val data = Person("Dmitri", "Agoshkov")
        val data2 = data.copy("Ivan", "Petrov")

        val toast = Toast.makeText(
            this, "Name:${data.firstName} ${data.secondName}",
            Toast.LENGTH_LONG
        )
        toast.setGravity(Gravity.TOP, 10, 50)
        toast.show()

        for (n in 1..10) {
            Log.i("TAG", "$n")
        }

        Log.i("TAG", "${data2.firstName} ${data2.secondName}")
    }

}
