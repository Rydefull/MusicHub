package com.example.musichub.domain.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.musichub.domain.entity.Song
import kotlinx.coroutines.flow.Flow

@Dao
interface SongDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addSong(song: Song)

    @Update
    suspend fun updateSong(song: Song)

    @Delete
    suspend fun deleteSong(song: Song)

    @Query("SELECT * FROM songs WHERE title LIKE :searchQuery OR artist LIKE :searchQuery ORDER BY saved_at DESC")
    fun searchSongs(searchQuery: String): Flow<List<Song>>

    @Query("SELECT * FROM songs ORDER BY saved_at DESC")
    fun getAllSongsHistory(): Flow<List<Song>>

    @Query("SELECT * FROM songs WHERE is_favourite = 1 ORDER BY saved_at DESC")
    fun getFavouriteSongs(): Flow<List<Song>>

    @Query("SELECT * FROM songs WHERE url = :songUrl LIMIT 1")
    suspend fun getSongByUrl(songUrl: String): Song?

    @Query("SELECT * FROM songs ORDER BY artist ASC")
    fun getSongsSortedByArtist(): Flow<List<Song>>

    @Query("SELECT * FROM songs ORDER BY title ASC")
    fun getSongsSortedByTitle(): Flow<List<Song>>
}