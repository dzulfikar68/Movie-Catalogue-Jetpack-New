package io.github.dzulfikar68.moviecatalogue.home.boundary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.bottomnavigation.BottomNavigationView
import io.github.dzulfikar68.moviecatalogue.R
import io.github.dzulfikar68.moviecatalogue.home.control.HomeViewModel
import io.github.dzulfikar68.moviecatalogue.main.boundary.openFragment
import io.github.dzulfikar68.moviecatalogue.main.boundary.setActionBar
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {

    private var viewModel: HomeViewModel? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_movie -> {
                supportFragmentManager.openFragment(MovieFragment(),
                    R.id.container
                )
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_tv -> {
                supportFragmentManager.openFragment(TvFragment(),
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

        //run view model
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        viewModel?.run()

        //set listener
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
