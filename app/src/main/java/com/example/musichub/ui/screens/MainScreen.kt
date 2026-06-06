package com.example.musichub.ui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.musichub.R
import com.example.musichub.ui.components.CustomTopBar
import com.example.musichub.ui.components.DefaultNavBar
import com.example.musichub.ui.components.SongPreview
import com.example.musichub.ui.navigation.Screen
import com.example.musichub.ui.theme.NotSoBlack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(onNavigateTo: (Screen) -> Unit) {
    val scrollState = rememberLazyListState()
    val isScrolled by remember {
        derivedStateOf {
            scrollState.firstVisibleItemIndex > 0 || scrollState.firstVisibleItemScrollOffset > 0
        }
    }
    Scaffold(
        modifier = Modifier,
        containerColor = NotSoBlack,
        topBar = { CustomTopBar(isScrolled, "Songs") },
        bottomBar = { DefaultNavBar(onNavigateTo) },
    ) { innerPadding ->
        LazyColumn(
            state = scrollState,
            contentPadding = innerPadding,
            modifier = Modifier.fillMaxWidth(),
        ) {
            items(50) { index ->
                /*Test*/
                SongPreview(R.drawable.fromzero,"Unshatter","Linkin Park")
            }
        }
    }
}