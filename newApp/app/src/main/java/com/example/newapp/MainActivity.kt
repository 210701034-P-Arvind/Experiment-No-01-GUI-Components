package com.example.newapp

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.motion.widget.FloatLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearlayout:LinearLayout=findViewById(R.id.linear_layout);
        val maintext:TextView=findViewById(R.id.main_text);
        val fontbutton:Button=findViewById(R.id.font_button);
        val colorbutton:Button=findViewById(R.id.color_button);
        val bgcolorbutton:Button=findViewById(R.id.bg_color_button);

        var fontSize:Float=5f
        var fontColor:Int=0
        var bgColor:Int=0

        fontbutton.setOnClickListener{
            maintext.setTextSize(fontSize)
            fontSize=(fontSize+5)%50
        }

        colorbutton.setOnClickListener {
            when(fontColor%3){
                0 -> maintext.setTextColor(Color.RED)
                1 -> maintext.setTextColor(Color.GREEN)
                2 -> maintext.setTextColor(Color.BLUE)
            }
            fontColor++
        }

        bgcolorbutton.setOnClickListener {
            maintext.setBackgroundColor(bgColor)
            when(bgColor%3){
                0 -> linearlayout.setBackgroundColor(Color.RED)
                1 -> linearlayout.setBackgroundColor(Color.GREEN)
                2 -> linearlayout.setBackgroundColor(Color.BLUE)
            }
            bgColor++
        }
    }
}


