package com.example.android2homework2.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity(tableName = "noteModel")
data class NoteModel(
    val title: String,
    val description: String,
    val time: String,
    val data: String
) : Serializable {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}