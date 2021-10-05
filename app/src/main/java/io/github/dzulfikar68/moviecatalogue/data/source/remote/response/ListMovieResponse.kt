package io.github.dzulfikar68.moviecatalogue.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListMovieResponse(val results: List<MovieResponse>) : Parcelable