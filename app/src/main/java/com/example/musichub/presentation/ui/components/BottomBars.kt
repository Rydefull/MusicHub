package com.example.musichub.presentation.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.musichub.presentation.ui.theme.NotSoBlack
import com.example.musichub.presentation.ui.icons.favorite
import com.example.musichub.presentation.ui.icons.more_horiz
import com.example.musichub.presentation.ui.icons.music_note
import com.example.musichub.presentation.ui.navigation.Screen

@Composable
fun DefaultNavBar(onNavigateTo: (Screen) -> Unit){
    NavigationBar(
        containerColor = NotSoBlack,
        contentColor = Color.White
    ) {
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = music_note,
                    contentDescription = "item",
                )
            },
            label = { Text(text = "Songs") },
            selected = false,
            onClick = {
                onNavigateTo(Screen.MainScreen)
            },
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = favorite,
                    contentDescription = "item",
                )
            },
            label = { Text(text = "Favourites") },
            selected = false,
            onClick = { onNavigateTo(Screen.FavouritesScreen) },
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = more_horiz,
                    contentDescription = "item",
                )
            },
            label = { Text(text = "More") },
            selected = false,
            onClick = {  },
        )
    }
}


