package io.github.dzulfikar68.moviecatalogue.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListTvResponse(val results: List<TvResponse>) : Parcelable