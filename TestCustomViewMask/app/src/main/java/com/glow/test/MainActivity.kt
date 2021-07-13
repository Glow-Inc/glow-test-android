package com.glow.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    mask.setOnClickListener {
      hint.text = "Clicked on mask"
    }
    button1.setOnClickListener {
      hint.text = "Clicked on Button 1"
    }
    button2.setOnClickListener {
      hint.text = "Clicked on Button 2"
    }
  }
}
