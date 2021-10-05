package io.github.dzulfikar68.moviecatalogue.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TvResponse(
    val id: Int?,
    val original_name: String?,
    val overview: String?,
    val poster_path: String?,
    val first_air_date: String?,
    val vote_average: String?
) : Parcelable