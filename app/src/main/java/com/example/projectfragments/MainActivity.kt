package com.example.projectfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonRed.setOnClickListener {
            var redFragment = FragmentRed()
            supportFragmentManager.beginTransaction().replace(R.id.fragmentYellow,redFragment).commit()
        }

        buttonBlue.setOnClickListener {
            var blueFragment = FragmentBlue()
            supportFragmentManager.beginTransaction().replace(R.id.fragmentYellow,blueFragment).commit()
        }
    }
}