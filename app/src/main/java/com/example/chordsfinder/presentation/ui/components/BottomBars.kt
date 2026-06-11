package com.example.chordsfinder.presentation.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.chordsfinder.presentation.ui.theme.NotSoBlack
import com.example.chordsfinder.presentation.ui.icons.favorite
import com.example.chordsfinder.presentation.ui.icons.more_horiz
import com.example.chordsfinder.presentation.ui.icons.music_note
import com.example.chordsfinder.presentation.ui.navigation.Screen

@Composable
fun DefaultNavBar(navController: NavController) {
    var selectedItemIndex by rememberSaveable { mutableIntStateOf(0) }
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
            selected = selectedItemIndex == 0,
            onClick = {
                selectedItemIndex = 0
                navController.navigate(Screen.SearchedSongsScreen)
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
            selected = selectedItemIndex == 1,
            onClick = {
                selectedItemIndex = 1
                navController.navigate(Screen.FavouritesScreen)
            },
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
            onClick = { },
        )
    }
}


