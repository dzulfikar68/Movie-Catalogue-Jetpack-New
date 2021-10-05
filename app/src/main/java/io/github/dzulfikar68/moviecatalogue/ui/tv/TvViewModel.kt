package io.github.dzulfikar68.moviecatalogue.ui.tv

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import io.github.dzulfikar68.moviecatalogue.data.MovieRepository
import io.github.dzulfikar68.moviecatalogue.data.source.local.entity.TvEntity

class TvViewModel(private val movieRepository: MovieRepository) : ViewModel() {

    fun getAllTvs(): LiveData<List<TvEntity>> = movieRepository.getAllTvs()

}