package com.packsystem.Panop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnMathGame01(view: View){
        val magthGamePlus:Intent = Intent(this,ActivityMagthGamePlus::class.java)
        startActivity(magthGamePlus)
    }
    fun btnMathGame02(view: View){
        val magthGamePlus:Intent = Intent(this,ActivityMagthGameMinus::class.java)
        startActivity(magthGamePlus)
    }
    fun btnMathGame03(view: View){
        val magthGamePlus:Intent = Intent(this,ActivityMagthGameMultiplied::class.java)
        startActivity(magthGamePlus)
    }
}