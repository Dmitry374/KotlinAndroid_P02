package com.example.kotlinandroid_p02

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

/*
*     Lesson
*     https://www.youtube.com/watch?v=vimoTCN5_E8&index=2&list=PLk7v1Z2rk4hj2rnU4Lcjs1GFw6Nqt-tlW
* */

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val KEY_NAME = "name"
    }

    private lateinit var edTextName: EditText
    private lateinit var btnClick: Button
    private lateinit var btnIntroduce: Button
    private lateinit var tvResult: TextView

    private lateinit var btnNextActivity: Button

    private lateinit var btnToList: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edTextName = findViewById(R.id.edTextName)
        btnClick = findViewById(R.id.btnClick)
        btnIntroduce = findViewById(R.id.buttonIntroduce)
        tvResult = findViewById(R.id.tvResult)

        btnNextActivity = findViewById(R.id.btnNextActivity)

        btnToList = findViewById(R.id.btnToList)

        btnClick.setOnClickListener {
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
            tvResult.text = "Hello ${edTextName.text}"
        }

        btnIntroduce.setOnClickListener {
            val name = edTextName.text
            tvResult.text = "Hello $name. I am your friend android."
        }

        tvResult.setOnClickListener {
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
        }

        btnNextActivity.setOnClickListener {
//            val intent: Intent = Intent(applicationContext, ResultActivity::class.java)
//            val name: String = edTextName.text.toString()
//            intent.putExtra(KEY_NAME , name)
//            startActivity(intent)


//            Passing String
//            startActivity(Intent(applicationContext, ResultActivity::class.java)
//                    .putExtra(KEY_NAME, edTextName.text.toString()))

//            Passing Object
            startActivity(Intent(applicationContext, ResultActivity::class.java)
                    .putExtra(KEY_NAME, Hero("Spider-Man", "Peter Parker")))
        }

        btnToList.setOnClickListener {
            startActivity(Intent(applicationContext, ListActivity::class.java))
        }

//        btnClick.setOnClickListener(this)
//        btnIntroduce.setOnClickListener(this)
//        tvResult.setOnClickListener(this)

//        ----------------------------------------------------------
//        btnClick.setOnClickListener {v ->
//            run {
//                val name = edTextName.text
//                tvResult.text = "Hello $name"
//            }
//        }

//        ----------------------------------------------------------
//        btnClick.setOnClickListener(object: View.OnClickListener{
//            override fun onClick(v: View?) {
//
//                val name = edTextName.text
//                tvResult.text = "Hello $name"
//            }
//        })

//        ----------------------------------------------------------
//        val myClickListener = object: View.OnClickListener{
//            override fun onClick(v: View?) {
//
//                when(v){
//                    btnClick ->{
//                        val name = edTextName.text
//                        tvResult.text = "Hello $name"
//                    }
//
//                    btnIntroduce ->{
//                        val name = edTextName.text
//                        tvResult.text = "Hello $name. I am your friend android."
//                    }
//
//                    tvResult -> {
//                        Toast.makeText(applicationContext, "Hello", Toast.LENGTH_SHORT).show()
//                    }
//                }
//
//            }
//        }
//
//        btnClick.setOnClickListener(myClickListener)
//        btnIntroduce.setOnClickListener(myClickListener)
//        tvResult.setOnClickListener(myClickListener)

//        ----------------------------------------------------------



    }



    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {

//        when(v){
//            btnClick ->{
//                val name = edTextName.text
//                tvResult.text = "Hello $name"
//            }
//
//            btnIntroduce ->{
//                val name = edTextName.text
//                tvResult.text = "Hello $name. I am your friend android."
//            }
//
//            tvResult -> Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
//        }

//        ----------------------------------------------------------

//        when(v?.id){
//            R.id.btnClick -> tvResult.text = "Hello $name"
//            R.id.buttonIntroduce -> Toast.makeText(this, "Introduce", Toast.LENGTH_SHORT).show()
//        }

    }

}
