package com.packsystem.Panop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class ActivityMagthGamePlus03 : AppCompatActivity() {
    private lateinit var tvplus01: TextView
    private lateinit var tvplus02: TextView
    private lateinit var btnResult01: Button
    private lateinit var btnResult02: Button
    private lateinit var btnResult03: Button
    private lateinit var btnResult04: Button
    private lateinit var numberText:String
    private  var mathScore:Int = 0
    private var mathResult:Boolean = false
    private var mathNumberResult:Int = Random.nextInt(1, 4)
    private var number1:Int = Random.nextInt(1, 100)
    private var number2:Int = Random.nextInt(1, 100)
    private var number3:Int = number1 + number2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magth_game_plus03)
        tvplus01 = findViewById(R.id.textNumberPlus01)
        tvplus02 = findViewById(R.id.textNumberPlus02)
        btnResult01 = findViewById(R.id.btnResult01)
        btnResult02 = findViewById(R.id.btnResult02)
        btnResult03 = findViewById(R.id.btnResult03)
        btnResult04 = findViewById(R.id.btnResult04)
        tvplus01.text = number1.toString()
        tvplus02.text = number2.toString()

        for (i in 1..4){
            when(i){
                1 ->{
                    if (i == mathNumberResult){
                        btnResult01.text = number3.toString()
                    }else{
                        btnResult01.text = NumberRandom(number3).toString()
                    }
                }
                2 ->{
                    if (i == mathNumberResult){
                        btnResult02.text = number3.toString()
                    }else{
                        btnResult02.text = NumberRandom(number3).toString()
                    }
                }
                3 ->{
                    if (i == mathNumberResult){
                        btnResult03.text = number3.toString()
                    }else{
                        btnResult03.text = NumberRandom(number3).toString()
                    }
                }
                4 ->{
                    if (i == mathNumberResult){
                        btnResult04.text = number3.toString()
                    }else{
                        btnResult04.text = NumberRandom(number3).toString()
                    }
                }
            }
        }

        var intentData = intent.extras
        if (intentData != null) {
            mathScore = intentData.getInt("MathScore")
        }

        btnResult01.setOnClickListener {
            numberText = btnResult01.text.toString();
            if (numberText == number3.toString()){
                mathResult = true
            }
            if (mathResult){
                mathScore++
                FIntentData(mathScore)
            }else{
                FIntentData(mathScore)
            }
        }
        btnResult02.setOnClickListener {
            numberText = btnResult02.text.toString();
            if (numberText == number3.toString()){
                mathResult = true
            }
            if (mathResult){
                mathScore++
                FIntentData(mathScore)
            }else{
                FIntentData(mathScore)
            }
        }
        btnResult03.setOnClickListener {
            numberText = btnResult03.text.toString();
            if (numberText == number3.toString()){
                mathResult = true
            }
            if (mathResult){
                mathScore++
                FIntentData(mathScore)
            }else{
                FIntentData(mathScore)
            }
        }
        btnResult04.setOnClickListener {
            numberText = btnResult04.text.toString();
            if (numberText == number3.toString()){
                mathResult = true
            }
            if (mathResult){
                mathScore++
                FIntentData(mathScore)
            }else{
                FIntentData(mathScore)
            }
        }
    }
    private fun NumberRandom(numResult:Int): Int {
        var num:Int = Random.nextInt(1, 4)
        when(num){
            1 -> return num + Random.nextInt(40)
            2 -> return num - Random.nextInt(10)
            3 -> return num / 2
            else -> return num + Random.nextInt(50, 90)
        }
    }

    private fun FIntentData(Score:Int){
        val magthGamePlus: Intent = Intent(this,ActivityMagthGamePlus04::class.java).apply {
            putExtra("MathScore",mathScore)
        }
        startActivity(magthGamePlus)
        finish()
    }
}