package com.dss.janamdingreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }

    fun createjanamdincard(view: View) {
        val name = this.nameinput.editableText.toString()

        val intent = Intent(this,BdayGreetingActivity::class.java)
        intent.putExtra(BdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)


    }
}