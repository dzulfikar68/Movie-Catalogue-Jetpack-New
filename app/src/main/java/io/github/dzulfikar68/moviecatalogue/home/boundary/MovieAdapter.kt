package io.github.dzulfikar68.moviecatalogue.home.boundary

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.github.dzulfikar68.moviecatalogue.R
import io.github.dzulfikar68.moviecatalogue.main.entity.MovieResult

class MovieAdapter(private val context: Context, private val list: List<MovieResult>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder =
        MovieViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_item, parent, false))

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) = holder.bindItem(list[position])

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var titleTextView = itemView.findViewById<TextView>(R.id.titleTextView)
        private var coverImageView = itemView.findViewById<ImageView>(R.id.coverImageView)
        private var voteTextView = itemView.findViewById<TextView>(R.id.voteTextView)
        private var releaseTextView = itemView.findViewById<TextView>(R.id.releaseTextView)
        fun bindItem(movie: MovieResult) {
            this.titleTextView.text = movie.original_title
            Glide.with(context).load(movie.poster_path).into(coverImageView)
            this.voteTextView.text = movie.vote_average
            this.releaseTextView.text = movie.release_date
            itemView.setOnClickListener {
                context.startActivity(
                    Intent(context, DetailActivity::class.java)
                        .putExtra(DetailActivity.EXTRA_MOVIE, movie.id)
                )
            }
        }
    }

}