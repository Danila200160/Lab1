package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import com.example.lab1.RandomDistinct

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById(R.id.textView) as TextView
        val textView2 = findViewById(R.id.textView2) as TextView
        val textView3 = findViewById(R.id.textView3) as TextView
        val button = findViewById(R.id.button) as Button
        val button2 = findViewById(R.id.button2) as Button
        val ranDis = RandomDistinct()
        val button3= findViewById(R.id.button3) as Button



        button.setOnClickListener {
            ranDis.updateNumbers()
            val numbers = ranDis.numbers
            textView.setText("Числа: "+numbers.joinToString())
        }
        button2.setOnClickListener {
            val numbers = ranDis.sort1()
            textView3.setText("Кол-во уникальных: "+numbers.joinToString())
        }
        button3.setOnClickListener {
            val numbers = ranDis.sort()
            textView2.setText("Отсортированные числа: "+numbers.joinToString())
        }

    }

}