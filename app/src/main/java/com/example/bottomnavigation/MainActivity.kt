package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LoadFragment(home_Fragment())
        val buttomNav= findViewById<BottomNavigationView>(R.id.bottomNav)
        buttomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home->LoadFragment(home_Fragment(

                ))
                R.id.store->LoadFragment(store_Fragment())
                R.id.saftey->LoadFragment(saftey_Fragment())
                R.id.wealth->LoadFragment(wealth_Fragment())
                R.id.history->LoadFragment(historyFragment())

            }
            true
        }}

    private fun LoadFragment(framgment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.container,framgment).commit()
    }
}