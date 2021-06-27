package io.github.dzulfikar68.moviecatalogue.home.boundary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.github.dzulfikar68.moviecatalogue.R
import io.github.dzulfikar68.moviecatalogue.home.control.HomeViewModel
import io.github.dzulfikar68.moviecatalogue.main.entity.MovieResult
import kotlinx.android.synthetic.main.fragment_list.*

class MovieFragment : Fragment() {

    private var viewModel: HomeViewModel? = null

//    private val listObserver = Observer<List<MovieResult>> {
//        contentListRecycleView?.setRecyclerView(it ?: listOf())
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.apply {
            viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
//            viewModel?.moviesLiveData?.observe(this, listObserver)
        }

        contentListRecycleView?.setRecyclerView(viewModel?.getMovies() ?: listOf())
    }

    private fun RecyclerView.setRecyclerView(list: List<MovieResult>) {
        this.layoutManager = LinearLayoutManager(this.context)
        this.adapter = MovieAdapter(context, list)
//        this.adapter?.notifyDataSetChanged()
    }

}