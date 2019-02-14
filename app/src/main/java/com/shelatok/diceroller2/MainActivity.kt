package com.shelatok.diceroller2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        d4Button.setOnClickListener {
            val roll = Random().nextInt(4) + 1
            currentDie.text = "d4"
            dieRoll.text = roll.toString()
        }
        d6Button.setOnClickListener {
            val roll = Random().nextInt(6) + 1
            currentDie.text = "d6"
            dieRoll.text = roll.toString()
        }
        d8Button.setOnClickListener {
            val roll = Random().nextInt(8) + 1
            currentDie.text = "d8"
            dieRoll.text = roll.toString()
        }
        d10Button.setOnClickListener {
            val roll = Random().nextInt(10) + 1
            currentDie.text = "d10"
            dieRoll.text = roll.toString()
        }
        d12Button.setOnClickListener {
            val roll = Random().nextInt(12) + 1
            currentDie.text = "d12"
            dieRoll.text = roll.toString()
        }
        d20Button.setOnClickListener {
            val roll = Random().nextInt(20) + 1
            currentDie.text = "d20"
            dieRoll.text = roll.toString()
        }
        d100button.setOnClickListener {
            val roll = Random().nextInt(100) + 1
            currentDie.text = "d%"
            dieRoll.text = roll.toString()
        }
    }
}
