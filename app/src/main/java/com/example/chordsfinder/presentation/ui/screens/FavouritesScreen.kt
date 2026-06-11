package com.example.chordsfinder.presentation.ui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.chordsfinder.R
import com.example.chordsfinder.presentation.ui.components.SongPreview
import com.example.chordsfinder.presentation.ui.components.SortBtn

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavouritesScreen(scrollState: LazyListState) {
    var currentSort by remember { mutableStateOf("Title") }

        LazyColumn(
            state = scrollState,
            modifier = Modifier.fillMaxWidth(),
        ) {
            item {
                SortBtn (
                    selectedSort = currentSort,
                    onSortSelected = { newSort ->
                        currentSort = newSort
                    }
                )
            }
            items(50) { index ->
                /*Test*/
                SongPreview(R.drawable.fromzero,"Unshatter","Linkin Park")
            }
        }
}