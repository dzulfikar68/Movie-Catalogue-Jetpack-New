package io.github.dzulfikar68.moviecatalogue.home.boundary

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import io.github.dzulfikar68.moviecatalogue.R
import io.github.dzulfikar68.moviecatalogue.home.control.HomeViewModel
import io.github.dzulfikar68.moviecatalogue.main.boundary.setActionBar
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.fragment_detail.*


class DetailActivity : AppCompatActivity() {

    var viewModel: HomeViewModel? = null

    companion object {
        const val EXTRA_MOVIE = "EXTRA_MOVIE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)
        setActionBar("Detail Movie", true)

        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        viewModel?.run()

        val id: Int = intent.getIntExtra(EXTRA_MOVIE, 0)
        val movie = viewModel?.getById(id)
        titleTextView.text = movie?.original_title ?: "-"
        overviewTextView.text = movie?.overview ?: "-"
        releaseTextView.text = movie?.release_date ?: "-"
        voteTextView.text = movie?.vote_average ?: "-"
        Glide.with(this).load(movie?.poster_path).into(coverImageView)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Coming Soon Feature!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

//    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return true
    }

}
