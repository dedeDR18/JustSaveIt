package com.example.justsaveit.data.source.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "linkentities")
data class LinkEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Long = 0,

    @ColumnInfo(name = "title") val title: String,

    @ColumnInfo(name = "link") val link: String,

    @ColumnInfo(name = "description") val description: String

)