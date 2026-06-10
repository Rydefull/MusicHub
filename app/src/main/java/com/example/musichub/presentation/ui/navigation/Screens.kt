package com.example.musichub.presentation.ui.navigation

import kotlinx.serialization.Serializable

sealed class Screen {

    @Serializable
    object SearchedSongsScreen: Screen()

    @Serializable
    object FavouritesScreen: Screen()

    @Serializable
    object SongScreen: Screen()

    @Serializable
    object SearchScreen: Screen()
}