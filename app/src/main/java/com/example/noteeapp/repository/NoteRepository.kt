package com.example.noteeapp.repository

import com.example.noteeapp.database.NoteDataBase
import com.example.noteeapp.model.Note

class NoteRepository(private val db: NoteDataBase) {

    suspend fun addNote(note: Note) = db.getNoteDao().addNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)
    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNote(query: String) = db.getNoteDao().searchNote(query)

}