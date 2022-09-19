package com.udacity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)
        file_name.text= intent.getStringExtra("fileName").toString()
        file_status.text = intent.getStringExtra("status").toString()

        fab.setOnClickListener {
            val mainIntent = Intent(this,MainActivity::class.java)
            startActivity(mainIntent)
        }
    }


}
