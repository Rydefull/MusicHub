package com.example.musichub.presentation.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.musichub.presentation.ui.icons.account_circle
import com.example.musichub.presentation.ui.icons.favorite

@Composable
fun FavBtn(isActive: Boolean) {
    IconButton(
        onClick = {/* Add/delete to fav */},
    ) {
        Icon(
            contentDescription = "Favorite",
            imageVector = favorite
        )
    }
}

@Composable
fun AccountBtn() {
    IconButton(
        onClick = { /*Account screen*/ },
    ) {
        Icon(
            imageVector = account_circle,
            contentDescription = "Profile",
            modifier = Modifier,
            tint = Color.White
        )
    }
}