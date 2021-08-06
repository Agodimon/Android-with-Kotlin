package com.bignerdranch.android.androidwithkotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<View>(R.id.btn_getNamePerson)
        btn.setOnClickListener(View.OnClickListener { view ->
            getNamePerson()

        })
    }

    private fun getNamePerson() {
        val data = Person("Dmitri", "Agoshkov")
        val data2=data.copy("Ivan","Petrov")

        val toast = Toast.makeText(
                this, "Name:${data.firstName} ${data.secondName}",
                Toast.LENGTH_LONG
            )
        toast.setGravity(Gravity.TOP, 10, 50)
        toast.show()

        for(n in 1..10) {
            Log.i("TAG","$n")
        }

        Log.i("TAG","${data2.firstName} ${data2.secondName}" )
    }
}
