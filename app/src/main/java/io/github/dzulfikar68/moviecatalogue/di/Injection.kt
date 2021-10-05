package io.github.dzulfikar68.moviecatalogue.di

import android.content.Context
import io.github.dzulfikar68.moviecatalogue.data.MovieRepository
import io.github.dzulfikar68.moviecatalogue.data.source.remote.RemoteDataSource
import io.github.dzulfikar68.moviecatalogue.utils.RetrofitClient

object Injection {
    fun provideRepository(context: Context): MovieRepository {
        val remoteDataSource = RemoteDataSource.getInstance(RetrofitClient.movieServices())
        return MovieRepository.getInstance(remoteDataSource)
    }
}