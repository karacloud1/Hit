package com.cloud.hit

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*
import kotlin.system.exitProcess

class MenuActivity : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    private var easyScore = 0
    private var hardScore = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        sharedPreferences = this.getSharedPreferences("com.cloud.hit",
            Context.MODE_PRIVATE)
        easyScore = sharedPreferences.getInt("easyScore", 0)
        hardScore = sharedPreferences.getInt("hardScore", 0)

        textView_easy.text = "Kolay mod en yüksek skor: $easyScore"
        textView_hard.text = "Zor mod en yüksek skor: $hardScore"

        button_easy.setOnClickListener {

        }
        button_hard.setOnClickListener {

        }
        button_exit.setOnClickListener {
            moveTaskToBack(true);
            exitProcess(-1)
        }

    }
}