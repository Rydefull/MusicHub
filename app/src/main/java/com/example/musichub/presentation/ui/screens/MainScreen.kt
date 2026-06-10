package com.example.musichub.presentation.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.musichub.presentation.ui.components.CustomTopBar
import com.example.musichub.presentation.ui.components.DefaultNavBar
import com.example.musichub.presentation.ui.navigation.Screen
import com.example.musichub.presentation.ui.theme.NotSoBlack

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    var titleName by rememberSaveable { mutableStateOf("Songs") }

    val scrollState = rememberLazyListState()
    val isScrolled by remember {
        derivedStateOf {
            scrollState.firstVisibleItemIndex > 0 || scrollState.firstVisibleItemScrollOffset > 0
        }
    }
    Scaffold(
        modifier = Modifier,
        containerColor = NotSoBlack,
        topBar = { CustomTopBar(isScrolled, titleName) },
        bottomBar = { DefaultNavBar(navController) },
    ) { innerPadding ->
        NavHost(
            modifier = Modifier.fillMaxSize().padding(innerPadding),
            navController = navController, startDestination = Screen.SearchedSongsScreen) {
            composable<Screen.SearchedSongsScreen> {
                titleName = "Songs"
                SearchedSongsScreen(scrollState)
            }
            composable<Screen.FavouritesScreen> {
                titleName = "Favourites"
                FavouritesScreen(scrollState)
            }
        }
    }
}