package net.wenlin.wikipedia.activaties

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import net.wenlin.wikipedia.R

class MainActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val navView: BottomNavigationView = findViewById(R.id.nav_view)
//
//        textMessage = findViewById(R.id.message)
        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
