package io.github.dzulfikar68.moviecatalogue.ui.tv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import io.github.dzulfikar68.moviecatalogue.databinding.FragmentListBinding
import io.github.dzulfikar68.moviecatalogue.ui.movie.MovieViewModel
import io.github.dzulfikar68.moviecatalogue.viewmodel.ViewModelFactory

class TvFragment : Fragment() {

    private lateinit var fragmentBinding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentBinding = FragmentListBinding.inflate(layoutInflater, container, false)
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]

            val tvAdapter = TvAdapter()

//            fragmentBinding.progressBar.visibility = View.VISIBLE
            viewModel.getAllMovies().observe(requireActivity(), { courses ->
//                fragmentBinding.progressBar.visibility = View.GONE
                tvAdapter.setItems(courses)
                tvAdapter.notifyDataSetChanged()
            })

            with(fragmentBinding.contentListRecycleView) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvAdapter
            }
        }
    }
}