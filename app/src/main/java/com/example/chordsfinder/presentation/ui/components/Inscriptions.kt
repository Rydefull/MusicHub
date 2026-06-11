package com.example.chordsfinder.presentation.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.chordsfinder.presentation.ui.theme.AntonioFontFamily

@Composable
fun SectionTitle(title: String) {
    Text(
        text = title,
        fontFamily = AntonioFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 44.sp,
        letterSpacing = (-1.5).sp,
        color = Color.White
    )
}