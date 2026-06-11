package com.example.chordsfinder.di
//
//import android.content.Context
//import androidx.room.Room
//import com.example.chordsfinder.data.database.SongDatabase
//import com.example.chordsfinder.domain.dao.SongDao
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.android.qualifiers.ApplicationContext
//import javax.inject.Singleton
//
//@Module
//object DatabaseModule {
//    @Provides
//    @Singleton
//    fun provideSongDatabase(@ApplicationContext context: Context): SongDatabase {
//        return Room.databaseBuilder(
//            context,
//            SongDatabase::class.java,
//            "songDatabase.db"
//        ).build()
//    }
//
//    @Provides
//    fun provideSongDao(songDatabase: SongDatabase): SongDao {
//        return songDatabase.getSongDao()
//    }
//}