package com.packsystem.Panop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityMathScore : AppCompatActivity() {
    private lateinit var tvMathScore:TextView
    private var score:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_score)
        tvMathScore = findViewById(R.id.textView2)

        var intentData = intent.extras
        if (intentData != null) {
            score = intentData.getInt("MathScore")
        }

        tvMathScore.text = "คุณได้คะแนน $score/5 คะแนนครับ"
    }
}