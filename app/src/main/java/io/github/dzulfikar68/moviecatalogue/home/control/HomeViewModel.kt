package io.github.dzulfikar68.moviecatalogue.home.control

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.dzulfikar68.moviecatalogue.main.control.RetrofitClient
import io.github.dzulfikar68.moviecatalogue.main.entity.API_KEY
import io.github.dzulfikar68.moviecatalogue.main.entity.Data
import io.github.dzulfikar68.moviecatalogue.main.entity.MovieList
import io.github.dzulfikar68.moviecatalogue.main.entity.MovieResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel : ViewModel() {

//    val moviesLiveData = MutableLiveData<List<MovieResult>>()
    private var moviesLiveData: List<MovieResult> = listOf()
    private var tvsLiveData: List<MovieResult> = listOf()

    fun run() {
//        requestMovies({}, {})
        moviesLiveData = Data.getMovies()
        tvsLiveData = Data.getTvs()
    }

    fun getMovies(): List<MovieResult>{
        return moviesLiveData
    }

    fun getMoviesById(id: Int): MovieResult?{
        return moviesLiveData.find { it.id == id }
    }

    fun getTvs(): List<MovieResult>{
        return tvsLiveData
    }

    fun getTvsById(id: Int): MovieResult?{
        return tvsLiveData.find { it.id == id }
    }

    fun getById(id: Int): MovieResult?{
        val movie = moviesLiveData.find { it.id == id }
        if (movie != null) return movie
        val tv = tvsLiveData.find { it.id == id }
        if (tv != null) return tv
        return null
    }

//    fun requestMovies(error: (String?) -> Unit, success: (List<MovieResult>) -> Unit) {
//        RetrofitClient.movieServices().getListMovie(API_KEY).enqueue(object: Callback<MovieList> {
//            override fun onFailure(call: Call<MovieList>, t: Throwable) {
//                println("&&" + t.message)
//                error(t.message)
//            }
//
//            override fun onResponse(call: Call<MovieList>, response: Response<MovieList>) {
//                moviesLiveData.value = response.body()?.results
//                success(moviesLiveData.value ?: listOf())
//            }
//        })
//    }
}