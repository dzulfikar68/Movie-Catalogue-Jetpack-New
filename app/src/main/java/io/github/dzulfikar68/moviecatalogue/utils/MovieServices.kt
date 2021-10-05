package io.github.dzulfikar68.moviecatalogue.utils

import io.github.dzulfikar68.moviecatalogue.data.source.remote.response.ListMovieResponse
import io.github.dzulfikar68.moviecatalogue.data.source.remote.response.ListTvResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieServices {
    @GET("discover/movie")
    fun getListMovie(@Query("api_key") api_key: String): Call<ListMovieResponse>

    @GET("discover/tv")
    fun getListTv(@Query("api_key") api_key: String): Call<ListTvResponse>
}