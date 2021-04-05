package com.example.justsaveit.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.justsaveit.data.source.local.entity.LinkEntity
import com.example.justsaveit.data.source.local.entity.NoteEntity

@Dao
interface JustSaveItDao{

    @Query("SELECT * FROM noteentities")
    fun getAllNotes(): LiveData<List<NoteEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note: NoteEntity)

    @Update
    fun updateNote(note: NoteEntity)

    @Delete
    fun deleteNote(note: NoteEntity)

    @Query("SELECT * FROM linkentities")
    fun getAllLinks(): LiveData<List<LinkEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLink(link: LinkEntity)

    @Update
    fun updateLink(link: LinkEntity)

    @Delete
    fun deleteLink(link: LinkEntity)
}