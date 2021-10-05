package io.github.dzulfikar68.moviecatalogue.data

import androidx.lifecycle.LiveData
import io.github.dzulfikar68.moviecatalogue.data.source.local.entity.MovieEntity
import io.github.dzulfikar68.moviecatalogue.data.source.local.entity.TvEntity
import io.github.dzulfikar68.moviecatalogue.data.source.remote.response.MovieResponse

interface MovieDataSource {
    fun getAllMovies(): LiveData<List<MovieEntity>>
    fun getAllTvs(): LiveData<List<TvEntity>>
}