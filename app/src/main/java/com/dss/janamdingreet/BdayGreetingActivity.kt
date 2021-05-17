package com.dss.janamdingreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bday_greeting.*

class BdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = " name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bday_greeting)
        val name = intent.getStringExtra(NAME_EXTRA)
      birthdaygreetings.text = " Happy Birthday\n$name!"
    }
}