package com.example.islami

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.islami.ui.home.fragments.RadioFragment
import com.example.islami.ui.home.fragments.SebhaFragment
import com.example.islami.ui.home.hadeth.HadethFragment
import com.example.islami.ui.home.quran.QuranFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class HomeActivity : AppCompatActivity() {
    lateinit var bottomNavigation: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        bottomNavigation = findViewById(R.id.home_bottom_navigation)
        bottomNavigation.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { menuItem ->
            if (menuItem.itemId == R.id.ic_quran) {
                pushFragment(QuranFragment())
            } else if (menuItem.itemId == R.id.ic_ahadeth) {
                pushFragment(HadethFragment())
            } else if (menuItem.itemId == R.id.ic_sebha) {
                pushFragment(SebhaFragment())
            } else if (menuItem.itemId == R.id.ic_radio) {
                pushFragment(RadioFragment())
            }
            return@OnItemSelectedListener true
        })
        bottomNavigation.selectedItemId = R.id.ic_quran
    }

    private fun pushFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment)
            .commit()
    }

}

