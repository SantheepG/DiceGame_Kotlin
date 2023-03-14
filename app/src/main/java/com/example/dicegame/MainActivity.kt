package com.example.dicegame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var playerScore = 0
    private var pltempScore = 0
    private var computerScore = 0
    private var comtempScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playerDice = mutableListOf<ImageButton>(findViewById(R.id.plDice1),findViewById(R.id.plDice2),findViewById(R.id.plDice3),findViewById(R.id.plDice4),findViewById(R.id.plDice5))
        val computerDice = mutableListOf<ImageButton>(findViewById(R.id.comDice1),findViewById(R.id.comDice2),findViewById(R.id.comDice3),findViewById(R.id.comDice4),findViewById(R.id.comDice5))
        val throwBtn = findViewById<Button>(R.id.throwBtn)
        throwBtn.setOnClickListener {
            pltempScore = 0
            comtempScore = 0
            for(iv in playerDice){
                playerDice(iv)
            }
            for (iv in computerDice){
                computerDice(iv)
            }
            findViewById<TextView>(R.id.tmpPlScore).setText(""+pltempScore)
            findViewById<TextView>(R.id.tmpCmScore).setText(""+comtempScore)
        }
        val scoreBtn = findViewById<Button>(R.id.scoreBtn)
        scoreBtn.setOnClickListener {
            playerScore += pltempScore
            computerScore += comtempScore
            pltempScore = 0
            comtempScore = 0
            findViewById<TextView>(R.id.comScore).setText("Human score: "+computerScore)
            findViewById<TextView>(R.id.playerScore).setText("Player score: "+playerScore)
        }

    }

    private fun playerDice(img: ImageView) {
        val randomInt = (1..6).random()
        pltempScore += randomInt
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

    private fun computerDice(img: ImageView) {
        val randomInt = (1..6).random()
        comtempScore += randomInt
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
    private fun reRoll(){
        
    }

    private fun winner(){
        if (computerScore>=101 || playerScore>=101){
            if(computerScore>=101){ }
        }
    }
}