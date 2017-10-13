package com.example.android.cookies

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  @SuppressLint("SetTextI18n")
      /**
   * Called when the cookies should be eaten
   */

  fun eatCookie(view: View) {
    var android_cookie_image_view:ImageView = findViewById(R.id.android_cookie_image_view)
    var status_text_view:TextView = findViewById(R.id.status_text_view)
    android_cookie_image_view.setImageResource(R.drawable.after_cookie)
    status_text_view.text = "I'm so full"

  }
}
