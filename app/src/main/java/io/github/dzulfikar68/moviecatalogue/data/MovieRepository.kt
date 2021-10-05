package io.github.dzulfikar68.moviecatalogue.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.github.dzulfikar68.moviecatalogue.data.source.local.entity.MovieEntity
import io.github.dzulfikar68.moviecatalogue.data.source.local.entity.TvEntity
import io.github.dzulfikar68.moviecatalogue.data.source.remote.RemoteDataSource
import io.github.dzulfikar68.moviecatalogue.data.source.remote.response.MovieResponse
import io.github.dzulfikar68.moviecatalogue.data.source.remote.response.TvResponse
import java.util.*

class MovieRepository constructor(private val remoteDataSource: RemoteDataSource) : MovieDataSource {

    companion object {
        @Volatile
        private var instance: MovieRepository? = null
        fun getInstance(remoteData: RemoteDataSource): MovieRepository =
            instance ?: synchronized(this) {
                instance ?: MovieRepository(remoteData).apply { instance = this }
            }
    }

    override fun getAllMovies(): LiveData<List<MovieEntity>> {
        val movieResults = MutableLiveData<List<MovieEntity>>()
        remoteDataSource.getAllMovies(object : RemoteDataSource.AllMoviesCallback {
            override fun onAllMoviesReceived(movieResponses: List<MovieResponse>) {
                val list = ArrayList<MovieEntity>()
                for (response in movieResponses) {
                    val item = MovieEntity(
                        response.id,
                        response.original_title,
                        response.overview,
                        response.poster_path,
                        response.release_date,
                        response.vote_average
                    )
                    list.add(item)
                }
                movieResults.postValue(list)
            }
        })
        return movieResults
    }

    override fun getAllTvs(): LiveData<List<TvEntity>> {
        val tvResults = MutableLiveData<List<TvEntity>>()
        remoteDataSource.getAllTvs(object : RemoteDataSource.AllTvsCallback {
            override fun onAllTvsReceived(tvResponses: List<TvResponse>) {
                val list = ArrayList<TvEntity>()
                for (response in tvResponses) {
                    val item = TvEntity(
                        response.id,
                        response.original_name,
                        response.overview,
                        response.poster_path,
                        response.first_air_date,
                        response.vote_average
                    )
                    list.add(item)
                }
                tvResults.postValue(list)
            }
        })
        return tvResults
    }
}