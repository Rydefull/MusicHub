package com.example.musichub.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.musichub.domain.dao.SongDao
import com.example.musichub.domain.entity.Song

@Database(entities = [Song::class], version = 1)
abstract class SongDatabase: RoomDatabase() {
    abstract fun getSongDao(): SongDao
}