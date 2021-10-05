package io.github.dzulfikar68.moviecatalogue.data.source.remote

import android.os.Handler
import android.os.Looper
import io.github.dzulfikar68.moviecatalogue.data.source.remote.response.ListMovieResponse
import io.github.dzulfikar68.moviecatalogue.data.source.remote.response.ListTvResponse
import io.github.dzulfikar68.moviecatalogue.data.source.remote.response.MovieResponse
import io.github.dzulfikar68.moviecatalogue.data.source.remote.response.TvResponse
import io.github.dzulfikar68.moviecatalogue.utils.API_KEY
import io.github.dzulfikar68.moviecatalogue.utils.EspressoIdlingResource
import io.github.dzulfikar68.moviecatalogue.utils.MovieServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource private constructor(private val services: MovieServices) {

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(services: MovieServices): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(services).apply { instance = this }
            }
    }

    fun getAllMovies(callback: AllMoviesCallback) {
        EspressoIdlingResource.increment()
        services.getListMovie(API_KEY).enqueue(object: Callback<ListMovieResponse> {
            override fun onResponse(
                call: Call<ListMovieResponse>,
                response: Response<ListMovieResponse>
            ) {
                callback.onAllMoviesReceived(response.body()?.results ?: listOf())
                EspressoIdlingResource.decrement()
            }
            override fun onFailure(call: Call<ListMovieResponse>, t: Throwable) {
                callback.onAllMoviesReceived(listOf())
                EspressoIdlingResource.decrement()
            }
        })
    }

    fun getAllTvs(callback: AllTvsCallback) {
        EspressoIdlingResource.increment()
        services.getListTv(API_KEY).enqueue(object: Callback<ListTvResponse> {
            override fun onResponse(
                call: Call<ListTvResponse>,
                response: Response<ListTvResponse>
            ) {
                callback.onAllTvsReceived(response.body()?.results ?: listOf())
                EspressoIdlingResource.decrement()
            }
            override fun onFailure(call: Call<ListTvResponse>, t: Throwable) {
                callback.onAllTvsReceived(listOf())
                EspressoIdlingResource.decrement()
            }
        })
    }

    interface AllMoviesCallback {
        fun onAllMoviesReceived(movieResponses: List<MovieResponse>)
    }

    interface AllTvsCallback {
        fun onAllTvsReceived(tvResponses: List<TvResponse>)
    }

}