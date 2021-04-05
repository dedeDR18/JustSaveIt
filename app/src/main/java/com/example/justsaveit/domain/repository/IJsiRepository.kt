package com.example.justsaveit.domain.repository

import androidx.lifecycle.LiveData
import com.example.justsaveit.domain.model.Link
import com.example.justsaveit.domain.model.Note

interface IJsiRepository {
    fun getAllNotes() : LiveData<List<Note>>

    fun getAllLinks() : LiveData<List<Link>>

    fun insertNote(note: Note)

    fun insertLink(link: Link)

    fun deleteNote(note: Note)

    fun deleteLink(link: Link)

    fun updateNote(note: Note)

    fun updateLink(link: Link)
}