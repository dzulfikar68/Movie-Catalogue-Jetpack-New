package io.github.dzulfikar68.moviecatalogue.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.github.dzulfikar68.moviecatalogue.data.source.local.entity.MovieEntity
import io.github.dzulfikar68.moviecatalogue.databinding.LayoutItemBinding
import io.github.dzulfikar68.moviecatalogue.ui.detail.DetailActivity

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    private var listMovies = ArrayList<MovieEntity>()

    fun setItems(courses: List<MovieEntity>?) {
        if (courses == null) return
        this.listMovies.clear()
        this.listMovies.addAll(courses)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemsAcademyBinding = LayoutItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsAcademyBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val item = listMovies[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = listMovies.size

    class MovieViewHolder(private val binding: LayoutItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MovieEntity) {
            with(binding) {
                Glide.with(itemView.context).load(item.posterPath).into(coverImageView)
//                .apply(
//                    RequestOptions.placeholderOf(R.drawable.ic_loading)
//                        .error(R.drawable.ic_error))
                titleTextView.text = item.originalTitle
                releaseTextView.text = item.releaseDate
                voteTextView.text = item.voteAverage
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_MOVIE, item.id)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}