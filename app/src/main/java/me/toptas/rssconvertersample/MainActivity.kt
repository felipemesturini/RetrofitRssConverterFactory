package me.toptas.rssconvertersample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        https://rss.tecmundo.com.br/feed
        supportFragmentManager
                .beginTransaction()
                .add(R.id.rlContainer, RssFragment.newInstance("https://rss.tecmundo.com.br/feed"))
                .commit()


    }
}
