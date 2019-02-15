package com.shelatok.diceroller2

import android.content.Context
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    fun buttonClick(view: View){
        val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (vibrator.hasVibrator()) { // Vibrator availability checking
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                vibrator.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE)) // New vibrate method for API Level 26 or higher
            } else {
                vibrator.vibrate(100) // Vibrate method for below API Level 26
            }
        }

//        for (i in 1..100000) {
//            dieRoll.text = i.toString()
//        }
        var sides= view.tag.toString().toInt()
        //Toast.makeText(applicationContext, dieRoll.text, Toast.LENGTH_SHORT).show()
        val roll = Random().nextInt(sides) + 1
        currentDie.text = "d$sides"
        dieRoll.text = roll.toString()
        //dieRoll.text = "---"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        d4Button.setOnClickListener {
//            val roll = Random().nextInt(4) + 1
//            currentDie.text = "d4"
//            dieRoll.text = roll.toString()
//        }
//        d6Button.setOnClickListener {
//            val roll = Random().nextInt(6) + 1
//            currentDie.text = "d6"
//            dieRoll.text = roll.toString()
//        }
//        d8Button.setOnClickListener {
//            val roll = Random().nextInt(8) + 1
//            currentDie.text = "d8"
//            dieRoll.text = roll.toString()
//        }
//        d10Button.setOnClickListener {
//            val roll = Random().nextInt(10) + 1
//            currentDie.text = "d10"
//            dieRoll.text = roll.toString()
//        }
//        d12Button.setOnClickListener {
//            val roll = Random().nextInt(12) + 1
//            currentDie.text = "d12"
//            dieRoll.text = roll.toString()
//        }
//        d20Button.setOnClickListener {
//            val roll = Random().nextInt(20) + 1
//            currentDie.text = "d20"
//            dieRoll.text = roll.toString()
//        }
//        d100button.setOnClickListener {
//            val roll = Random().nextInt(100) + 1
//            currentDie.text = "d%"
//            dieRoll.text = roll.toString()
//        }
    }
}
