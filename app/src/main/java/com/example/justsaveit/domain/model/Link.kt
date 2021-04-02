package com.example.justsaveit.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Link(
    val id: Long,
    val title: String,
    val link: String,
    val description: String
) : Parcelable