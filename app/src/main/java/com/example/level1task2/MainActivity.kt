package com.example.level1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.level1task2.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit = binding.btnSubmit
        btnSubmit.setOnClickListener {
            checkAnswers()
        }
    }

    fun checkAnswers(){
        val answer1 = binding.insAnswer1.text.trim().toString()
        val answer2 = binding.insAnswer2.text.trim().toString()
        val answer3 = binding.insAnswer3.text.trim().toString()
        val answer4 = binding.insAnswer4.text.trim().toString()
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