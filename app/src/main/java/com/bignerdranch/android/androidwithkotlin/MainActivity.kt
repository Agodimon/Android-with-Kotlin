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

        closedRangeCycleReverse()
        closedRangeCycleReverseWithStep()
        closedRangeCycle()
        getChangeTextByPressSwitch()

        val btnPersList = findViewById<View>(R.id.btn_getListPerson)
        btnPersList.setOnClickListener(View.OnClickListener { view ->
            GetNamePersonList()
            forEachCycle()
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

    private fun forEachCycle() {
        val arrayList = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        for (i in arrayList) {
            Log.d("forEachCycle", i.toString())
        }
    }

    private fun closedRangeCycle() {
        for (i in 1..50) {
            Log.d("closedRangeCycle", i.toString())
        }
    }

    private fun closedRangeCycleReverse() {
        for (i in 100 downTo 50) {
            Log.d("closedRangeCycleReverse", i.toString())
        }
    }

    private fun closedRangeCycleReverseWithStep() {
        for (i in 50 downTo 0 step 5) {
            Log.d("TAG", i.toString())
        }

    }
}
