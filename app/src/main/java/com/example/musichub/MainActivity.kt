package com.example.musichub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.musichub.presentation.ui.navigation.AppNavigation
import com.example.musichub.presentation.ui.theme.MusicHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MusicHubTheme {
                AppNavigation()
            }
        }
    }
}