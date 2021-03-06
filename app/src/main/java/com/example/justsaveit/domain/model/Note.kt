package com.example.justsaveit.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Note(
    val id: Long,
    val title: String,
    val description: String,
    val date: Long
) : Parcelable