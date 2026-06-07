package com.example.musichub.presentation.ui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.musichub.R
import com.example.musichub.presentation.ui.components.CustomTopBar
import com.example.musichub.presentation.ui.components.DefaultNavBar
import com.example.musichub.presentation.ui.components.SongPreview
import com.example.musichub.presentation.ui.components.SortBtn
import com.example.musichub.presentation.ui.navigation.Screen
import com.example.musichub.presentation.ui.theme.NotSoBlack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavouritesScreen(onNavigateTo: (Screen) -> Unit) {
    var currentSort by remember { mutableStateOf("Title") }
    val scrollState = rememberLazyListState()
    val isScrolled by remember {
        derivedStateOf {
            scrollState.firstVisibleItemIndex > 0 || scrollState.firstVisibleItemScrollOffset > 0
        }
    }
    Scaffold(
        modifier = Modifier,
        containerColor = NotSoBlack,
        topBar = { CustomTopBar(isScrolled, "Favourites") },
        bottomBar = { DefaultNavBar(onNavigateTo) },
    ) { innerPadding ->
        LazyColumn(
            state = scrollState,
            contentPadding = innerPadding,
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
}