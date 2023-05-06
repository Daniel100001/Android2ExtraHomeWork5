package com.example.android2homework2.ui.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.android2homework2.models.NoteModel
import com.example.android2homework2.ui.data.db.daos.NoteDao

@Database(entities = [NoteModel::class], version = 3)
abstract class AppDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao

}