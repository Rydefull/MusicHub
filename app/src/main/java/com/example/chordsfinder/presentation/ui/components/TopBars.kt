package com.example.chordsfinder.presentation.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/* Custom top bar (account + search) with animation */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar(isScrolled: Boolean, title: String) {
    Column(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, top = 32.dp),
    ) {
        AnimatedVisibility(
            visible = !isScrolled,
            enter = fadeIn() + expandVertically(),
            exit = fadeOut() + shrinkVertically()
        ) {
            AccountLine(title)
        }
        SearchBar()
    }
}

@Composable
fun AccountLine(title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        SectionTitle(title)
        AccountBtn()
    }
}


/*---------------------------------------------------*/