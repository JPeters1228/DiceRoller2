package com.shelatok.diceroller2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intro_screen.*

class IntroScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_screen)

        startButton.setOnClickListener {
            val rollIntent = Intent(this, MainActivity::class.java)
            startActivity(rollIntent)
        }
    }
}
