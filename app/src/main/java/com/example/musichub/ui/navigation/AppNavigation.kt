package com.example.musichub.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.musichub.ui.screens.FavouritesScreen
import com.example.musichub.ui.screens.MainScreen

@Composable
fun AppNavigation() {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Screen.MainScreen) {
        composable<Screen.MainScreen>{
            MainScreen{navigateTo -> navHostController.navigate(navigateTo)}
        }
        composable<Screen.FavouritesScreen> {
            FavouritesScreen{navigateTo -> navHostController.navigate(navigateTo)}
        }
        composable<Screen.SearchScreen> {
            //SearchScreen()
        }
    }
}