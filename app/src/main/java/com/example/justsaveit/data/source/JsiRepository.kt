package com.example.justsaveit.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.example.justsaveit.data.source.local.LocalDataSource
import com.example.justsaveit.domain.model.Link
import com.example.justsaveit.domain.model.Note
import com.example.justsaveit.domain.repository.IJsiRepository
import com.example.justsaveit.utils.DataMapper

class JsiRepository (private val localDataSource: LocalDataSource): IJsiRepository {

    override fun getAllNotes(): LiveData<List<Note>> {
        return localDataSource.getAllMovies().map { listNoteEntity ->
            DataMapper.mapListNoteEntitiesToNoteDomain(listNoteEntity)
        }
    }

    override fun getAllLinks(): LiveData<List<Link>> {
        return localDataSource.getAllLinks().map { listLinkEntity ->
            DataMapper.mapListLinkEntitiesToLinkDomain(listLinkEntity)
        }
    }

    override fun insertNote(note: Note) {
        localDataSource.insertNote(DataMapper.mapNoteDomainToNoteEntity(note))
    }

    override fun insertLink(link: Link) {
        localDataSource.insertLink(DataMapper.mapLinkDomainToLinkEntity(link))
    }

    override fun deleteNote(note: Note) {
        localDataSource.deleteNote(DataMapper.mapNoteDomainToNoteEntity(note))
    }

    override fun deleteLink(link: Link) {
        localDataSource.deleteLink(DataMapper.mapLinkDomainToLinkEntity(link))
    }

    override fun updateNote(note: Note) {
        localDataSource.updateNote(DataMapper.mapNoteDomainToNoteEntity(note))
    }

    override fun updateLink(link: Link) {
        localDataSource.updateLink(DataMapper.mapLinkDomainToLinkEntity(link))
    }

}