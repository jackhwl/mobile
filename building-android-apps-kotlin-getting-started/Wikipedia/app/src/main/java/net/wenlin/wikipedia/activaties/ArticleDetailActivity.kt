package net.wenlin.wikipedia.activaties

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
//import androidx.appcompat.widget.Toolbar
//import android.support.v.app
import kotlinx.android.synthetic.main.activity_article_detail.*
import net.wenlin.wikipedia.R

class ArticleDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_detail)

        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item!!.itemId == android.R.id.home) {
            finish()
        }
        return true
    }
}