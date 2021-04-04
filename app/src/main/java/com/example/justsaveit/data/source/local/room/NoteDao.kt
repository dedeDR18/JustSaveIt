package com.example.justsaveit.data.source.local.room

import androidx.room.*
import com.example.justsaveit.data.source.local.entity.NoteEntity

@Dao
interface NoteDao{

    @Query("SELECT * FROM noteentities")
    fun getAllNotes(): List<NoteEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note: List<NoteEntity>)

    @Update
    fun updateNote(note: NoteEntity)

    @Delete
    fun deleteNote(note: NoteEntity)
}