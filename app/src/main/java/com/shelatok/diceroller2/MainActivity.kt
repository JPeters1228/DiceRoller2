package com.shelatok.diceroller2

import android.content.Context
import android.os.*
import android.support.v7.app.AppCompatActivity
import android.view.View
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
        val sides= view.tag.toString().toInt()
        val roll = Random().nextInt(sides) + 1
        currentDie.text = "d$sides"

        val countDownTimer = object: CountDownTimer(100, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                dieRoll.text = "    "
            }
            override fun onFinish() {
                dieRoll.text = roll.toString()
            }
        }
        countDownTimer.start()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
