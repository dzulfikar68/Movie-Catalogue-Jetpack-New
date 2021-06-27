package io.github.dzulfikar68.moviecatalogue.main.control

import io.github.dzulfikar68.moviecatalogue.main.entity.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    fun movieServices(): MovieServices {
        val retrofit =  Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(MovieServices::class.java)
    }
}