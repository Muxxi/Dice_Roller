package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    internal lateinit var diceImage : ImageView
    internal lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)

        rollButton.setOnClickListener{ rollDice() }

    }

    private fun rollDice() {
        var randomNumberGenerator = Random().nextInt(6)+1

        val randomDiceImage = when(randomNumberGenerator){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        Log.d("ValueGenerated",randomNumberGenerator.toString())

        diceImage.setImageResource(randomDiceImage)

    }
}
