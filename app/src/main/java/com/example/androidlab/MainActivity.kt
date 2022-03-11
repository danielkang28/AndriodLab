package com.example.androidlab

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //이름 문자열 출력 TextView 생성
        val name = TextView(this).apply {
            typeface = Typeface.DEFAULT_BOLD
            text = "Lake Louise"
        }

        // 이미지 출력 ImageView 생성
        val image = ImageView(this).also {
            it.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.lake_1))
        }
        setContentView(R.layout.activity_main)
    }
}