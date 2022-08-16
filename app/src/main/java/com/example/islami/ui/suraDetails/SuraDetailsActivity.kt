package com.example.islami.ui.suraDetails

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.islami.R

class SuraDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sura_details)
        setSupportActionBar(findViewById(R.id.toolbar))

    }
}