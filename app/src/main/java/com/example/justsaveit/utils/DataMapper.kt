package com.example.justsaveit.utils

import com.example.justsaveit.data.source.local.entity.LinkEntity
import com.example.justsaveit.data.source.local.entity.NoteEntity
import com.example.justsaveit.domain.model.Link
import com.example.justsaveit.domain.model.Note

object DataMapper {
    fun mapListNoteEntitiesToNoteDomain(noteEntity: List<NoteEntity>): List<Note> =
      noteEntity.map { noteEntity ->
         Note(
                 id = noteEntity.id,
                 title = noteEntity.title,
                 description = noteEntity.description,
                 date = noteEntity.date
         )
      }

    fun mapListLinkEntitiesToLinkDomain(linkEntity: List<LinkEntity>): List<Link> =
            linkEntity.map { linkEntity ->
                Link(
                        id = linkEntity.id,
                        title = linkEntity.title,
                        link = linkEntity.link,
                        description = linkEntity.description
                )
            }

    fun mapNoteDomainToNoteEntity(note: Note) = NoteEntity(
            id = note.id,
            title = note.title,
            description = note.description,
            date = note.date
    )

    fun mapLinkDomainToLinkEntity(link: Link) = LinkEntity(
            id = link.id,
            title = link.title,
            link = link.link,
            description = link.description
    )

}