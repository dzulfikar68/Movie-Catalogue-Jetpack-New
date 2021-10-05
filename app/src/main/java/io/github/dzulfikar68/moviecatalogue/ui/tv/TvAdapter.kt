package io.github.dzulfikar68.moviecatalogue.ui.tv

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.github.dzulfikar68.moviecatalogue.data.source.local.entity.MovieEntity
import io.github.dzulfikar68.moviecatalogue.databinding.LayoutItemBinding
import io.github.dzulfikar68.moviecatalogue.ui.detail.DetailActivity
import io.github.dzulfikar68.moviecatalogue.ui.movie.MovieAdapter

class TvAdapter : RecyclerView.Adapter<TvAdapter.TvViewHolder>() {
    private var listTvs = ArrayList<MovieEntity>()

    fun setItems(courses: List<MovieEntity>?) {
        if (courses == null) return
        this.listTvs.clear()
        this.listTvs.addAll(courses)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvViewHolder {
        val itemsAcademyBinding = LayoutItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvViewHolder(itemsAcademyBinding)
    }

    override fun onBindViewHolder(holder: TvViewHolder, position: Int) {
        val item = listTvs[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = listTvs.size

    class TvViewHolder(private val binding: LayoutItemBinding) : RecyclerView.ViewHolder(binding.root) {
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