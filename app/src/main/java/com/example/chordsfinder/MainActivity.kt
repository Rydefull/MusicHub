package com.example.chordsfinder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.chordsfinder.presentation.ui.screens.MainScreen
import com.example.chordsfinder.presentation.ui.theme.ChordsFinderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChordsFinderTheme {
                MainScreen()
            }
        }
    }
}