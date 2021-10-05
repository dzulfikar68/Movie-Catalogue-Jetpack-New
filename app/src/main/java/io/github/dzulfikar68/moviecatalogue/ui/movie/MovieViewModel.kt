package io.github.dzulfikar68.moviecatalogue.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import io.github.dzulfikar68.moviecatalogue.data.MovieRepository
import io.github.dzulfikar68.moviecatalogue.data.source.local.entity.MovieEntity
import io.github.dzulfikar68.moviecatalogue.data.source.local.entity.TvEntity

class MovieViewModel(private val movieRepository: MovieRepository) : ViewModel() {

    fun getAllMovies(): LiveData<List<MovieEntity>> = movieRepository.getAllMovies()

}