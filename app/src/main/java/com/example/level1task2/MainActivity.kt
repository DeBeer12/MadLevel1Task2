package com.example.level1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        btnSubmit.setOnClickListener {
            checkAnswers()
        }
    }

    fun checkAnswers(){
        val answer1 = findViewById<EditText>(R.id.insAnswer1).text.trim().toString()
        val answer2 = findViewById<EditText>(R.id.insAnswer2).text.trim().toString()
        val answer3 = findViewById<EditText>(R.id.insAnswer3).text.trim().toString()
        val answer4 = findViewById<EditText>(R.id.insAnswer4).text.trim().toString()
        var correct = 0
        var wrong = 0

        if(answer1 == "T") correct++ else wrong++
        if(answer2 == "F") correct++ else wrong++
        if(answer3 == "F") correct++ else wrong++
        if(answer4 == "F") correct++ else wrong++
//        Toast.makeText(this@MainActivity, "$answer1, $answer2, $answer3, $answer4", Toast.LENGTH_SHORT).show()
        Toast.makeText(this@MainActivity, "You've got $correct answers correct and $wrong answers wrong", Toast.LENGTH_SHORT).show()
    }
}