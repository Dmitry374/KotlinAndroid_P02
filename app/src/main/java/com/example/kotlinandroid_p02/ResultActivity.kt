package com.example.kotlinandroid_p02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    lateinit var tvResult: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        tvResult = findViewById(R.id.tvResult)

//        Getting String
//        val name = intent.getStringExtra(MainActivity.KEY_NAME)
//        tvResult.text = "Hello, My name is $name"

//        Getting Object
        val hero = intent.getSerializableExtra(MainActivity.KEY_NAME) as Hero

        tvResult.text = "Hero name is ${hero.name}, but real name is ${hero.realName}"
    }
}
