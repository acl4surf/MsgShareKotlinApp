package com.andrewlee.android.msgsharekotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            // Lambda statement
            Log.i("MainActivity", "Button was clicked!")
            Toast.makeText(this, "Button clicked.", Toast.LENGTH_SHORT).show()
        }
    }
}
