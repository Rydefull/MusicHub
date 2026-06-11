package com.example.chordsfinder.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.chordsfinder.R
import com.example.chordsfinder.presentation.ui.icons.search

@Composable
fun SearchBar() {
    var searchText by remember { mutableStateOf("") }
    OutlinedTextField(
        value = searchText,
        onValueChange = { newText -> searchText = newText },
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(70.dp))
            .background(
                Color.White
            ),
        singleLine = true,
        placeholder = {Text(text = stringResource(R.string.search_song))},
        leadingIcon = {
            Icon(
                contentDescription = "Search",
                imageVector = search,
                tint = Color.Black
            )
        },
        colors = OutlinedTextFieldDefaults.colors(
            focusedTextColor = Color.Black,
            unfocusedTextColor = Color.Black,
            focusedPlaceholderColor = Color.DarkGray,

            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
            disabledBorderColor = Color.Transparent,
        )
    )
}