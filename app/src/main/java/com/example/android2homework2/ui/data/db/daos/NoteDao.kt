package com.example.android2homework2.ui.data.db.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.android2homework2.models.NoteModel

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(noteModel: NoteModel)

    @Query("SELECT * FROM noteModel")
    fun getAll(): LiveData<List<NoteModel>>
    @Query("SELECT * FROM noteModel WHERE description LIKE :description ORDER BY id DESC")
    fun searchNotesByDescription(description: String): List<NoteModel>
}