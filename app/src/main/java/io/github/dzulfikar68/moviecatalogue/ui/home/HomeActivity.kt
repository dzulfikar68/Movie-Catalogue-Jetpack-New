package io.github.dzulfikar68.moviecatalogue.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import io.github.dzulfikar68.moviecatalogue.R
import io.github.dzulfikar68.moviecatalogue.databinding.ActivityMainBinding
import io.github.dzulfikar68.moviecatalogue.ui.movie.MovieFragment
import io.github.dzulfikar68.moviecatalogue.ui.tv.TvFragment
import io.github.dzulfikar68.moviecatalogue.utils.openFragment
import io.github.dzulfikar68.moviecatalogue.utils.setActionBar

class HomeActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_movie -> {
                supportFragmentManager.openFragment(
                    MovieFragment(),
                    R.id.container
                )
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_tv -> {
                supportFragmentManager.openFragment(
                    TvFragment(),
                    R.id.container
                )
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //init view
        setContentView(R.layout.activity_main)
        setActionBar("Home Movie", false)
        supportFragmentManager.openFragment(MovieFragment(), R.id.container)

        //set listener
        findViewById<BottomNavigationView>(R.id.navigation).setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        supportActionBar?.elevation = 0f
    }
}
