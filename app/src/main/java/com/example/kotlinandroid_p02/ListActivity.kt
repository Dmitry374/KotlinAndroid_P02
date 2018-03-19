package com.example.kotlinandroid_p02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class ListActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var edNewHero: EditText
    private lateinit var btnAddNewHero: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

//        val heroes = arrayOf("Spider-Man", "Iron Man", "Gamora", "Thor")

        listView = findViewById(R.id.listView)
        edNewHero = findViewById(R.id.edNewHero)
        btnAddNewHero = findViewById(R.id.btnAddNewHero)

        val heroes: ArrayList<String> = arrayListOf("Spider-Man", "Iron Man", "Gamora", "Thor")

        listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, heroes)

        btnAddNewHero.setOnClickListener {
            heroes.add(edNewHero.text.toString())

            listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, heroes)

            edNewHero.text.clear()
        }

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext, heroes.get(position), Toast.LENGTH_SHORT).show()
        }

    }
}
