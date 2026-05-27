package com.example.musichub.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.musichub.ui.theme.NotSoBlack
import com.example.musichub.ui.icons.account_circle
import com.example.musichub.ui.icons.favorite
import com.example.musichub.ui.icons.more_horiz
import com.example.musichub.ui.icons.music_note

@Composable
fun DefaultNavBar(){
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
            selected = true,
            onClick = { },
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
            onClick = { },
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


