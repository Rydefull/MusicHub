package com.example.musichub.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.musichub.ui.screens.FavouritesScreen
import com.example.musichub.ui.screens.MainScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MainScreen) {
        composable<MainScreen>{
            MainScreen()
        }
        composable<FavouritesScreen> {
            FavouritesScreen()
        }
        composable<SearchScreen> {
            //SearchScreen()
        }
    }
}