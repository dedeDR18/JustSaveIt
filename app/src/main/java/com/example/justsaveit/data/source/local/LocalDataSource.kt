package com.example.justsaveit.data.source.local

import androidx.lifecycle.LiveData
import com.example.justsaveit.data.source.local.entity.LinkEntity
import com.example.justsaveit.data.source.local.entity.NoteEntity
import com.example.justsaveit.data.source.local.room.JustSaveItDao

class LocalDataSource private constructor(private val mDao: JustSaveItDao) {
    companion object{
        private var INSTANCE : LocalDataSource? = null

        fun getInstance(dao: JustSaveItDao): LocalDataSource = INSTANCE ?: LocalDataSource(dao)
    }

    fun getAllMovies(): LiveData<List<NoteEntity>> = mDao.getAllNotes()

    fun getAllLinks(): LiveData<List<LinkEntity>> = mDao.getAllLinks()

    fun insertNote(noteEntity: NoteEntity) = mDao.insertNote(noteEntity)

    fun insertLink(linkEntity: LinkEntity) = mDao.insertLink(linkEntity)

    fun deleteNote(noteEntity: NoteEntity) = mDao.deleteNote(noteEntity)

    fun deleteLink(linkEntity: LinkEntity) = mDao.deleteLink(linkEntity)

    fun updateNote(noteEntity: NoteEntity) = mDao.updateNote(noteEntity)

    fun updateLink(linkEntity: LinkEntity) = mDao.updateLink(linkEntity)
}