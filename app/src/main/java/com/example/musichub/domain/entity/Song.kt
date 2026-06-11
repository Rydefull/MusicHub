package com.example.musichub.domain.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "songs")
data class Song(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val url: String,

    val title: String?,

    val artist: String?,

    @ColumnInfo(name = "chords_text")
    val chordsText: String?,

    @ColumnInfo(name = "source_site")
    val sourceSite: String?,

    @ColumnInfo(name = "saved_at")
    val savedAt: Long,

    @ColumnInfo(name = "is_favourite")
    val isFavourite: Boolean = false
)
