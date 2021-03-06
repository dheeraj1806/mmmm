package com.smartherd.msgshareapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            // Code
            Log.i("MainActivity", "Button was clicked !")

            Toast.makeText(this, "Button was clicked !", Toast.LENGTH_SHORT).show()
        }
    }
}