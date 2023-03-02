package com.example.dicegame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dice = mutableListOf<ImageView>(findViewById(R.id.Dice1),findViewById(R.id.Dice2),findViewById(R.id.Dice3),findViewById(R.id.Dice4),findViewById(R.id.Dice5))

        val rollBtn: Button = findViewById(R.id.Roll)

        rollBtn.setOnClickListener()

    }

    private fun rollDice(img: ImageView) {
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        img.setImageResource(drawableResource)

    }
}