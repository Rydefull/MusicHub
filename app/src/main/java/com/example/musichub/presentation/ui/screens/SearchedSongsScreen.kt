package com.example.musichub.presentation.ui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.musichub.R
import com.example.musichub.presentation.ui.components.SongPreview

@Composable
fun SearchedSongsScreen(scrollState: LazyListState) {

        LazyColumn(
            state = scrollState,
            modifier = Modifier.fillMaxWidth(),
        ) {
            items(50) { index ->
                /*Test*/
                SongPreview(R.drawable.fromzero, "Unshatter", "Linkin Park")
            }
        }

}