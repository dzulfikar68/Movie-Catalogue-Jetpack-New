package io.github.dzulfikar68.moviecatalogue.main.control

import io.github.dzulfikar68.moviecatalogue.main.entity.MovieList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieServices {
    @GET("discover/movie")
    fun getListMovie(@Query("api_key") api_key: String): Call<MovieList>
}