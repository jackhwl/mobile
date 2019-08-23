package net.wenlin.wikipedia.activaties

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import net.wenlin.wikipedia.R
import net.wenlin.wikipedia.fragments.ExploreFragment
import net.wenlin.wikipedia.fragments.FavoritesFragment
import net.wenlin.wikipedia.fragments.HistoryFragment

class MainActivity : AppCompatActivity() {

    private val exploreFragment: ExploreFragment
    private val favoritesFragment: FavoritesFragment
    private val historyFragment: HistoryFragment

    init {
        exploreFragment = ExploreFragment()
        favoritesFragment = FavoritesFragment()
        historyFragment = HistoryFragment()
    }

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        val transaction = supportFragmentManager.beginTransaction()
        transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)

        when(item.itemId) {
            R.id.navigation_explore -> transaction.replace(R.id.fragment_container, exploreFragment)
            R.id.navigation_favorites -> transaction.replace(R.id.fragment_container, favoritesFragment)
            R.id.navigation_history -> transaction.replace(R.id.fragment_container, historyFragment)
        }

        transaction.commit()

        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val navView: BottomNavigationView = findViewById(R.id.nav_view)
//
//        textMessage = findViewById(R.id.message)
        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        var transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, exploreFragment)
        transaction.commit()
    }
}
