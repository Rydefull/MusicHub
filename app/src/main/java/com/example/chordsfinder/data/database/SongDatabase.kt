package com.example.chordsfinder.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.chordsfinder.data.dao.SongDao
import com.example.chordsfinder.data.entity.Song

@Database(entities = [Song::class], version = 1)
abstract class SongDatabase: RoomDatabase() {
    abstract fun getSongDao(): SongDao
}