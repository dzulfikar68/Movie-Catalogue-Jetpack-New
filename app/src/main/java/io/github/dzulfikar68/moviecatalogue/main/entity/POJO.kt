package io.github.dzulfikar68.moviecatalogue.main.entity

data class MovieList(val results: List<MovieResult>)
data class MovieResult(
    val id: Int?,
    val original_title: String?,
    val overview: String?,
    val poster_path: String?,
    val release_date: String?,
    val vote_average: String?
)