package com.coreywjohnson.setlists

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    (application as SetlistsApplication).applicationComponent.inject(this)
    setContentView(R.layout.activity_main)
  }
}