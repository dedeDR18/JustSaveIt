package com.example.justsaveit.data.source.local.room

import androidx.room.*
import com.example.justsaveit.data.source.local.entity.LinkEntity

@Dao
interface LinkDao{
    @Query("SELECT * FROM linkentities")
    fun getAllLinks(): List<LinkEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLink(link: List<LinkEntity>)

    @Update
    fun updateLink(link: LinkEntity)

    @Delete
    fun deleteLink(link: LinkEntity)
}