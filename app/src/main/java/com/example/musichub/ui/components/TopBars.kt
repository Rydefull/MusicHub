package com.example.musichub.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musichub.ui.icons.account_circle
import com.example.musichub.ui.theme.AntonioFontFamily

/* Custom top bar (account + search) with animation */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar(isScrolled: Boolean) {
    Column(
        modifier = Modifier
            .padding(start=16.dp,end = 16.dp, top = 32.dp),
    ) {
        AnimatedVisibility(
            visible = !isScrolled,
            enter = fadeIn() + expandVertically(),
            exit = fadeOut() + shrinkVertically()
        ) {
            AccountLine()
        }
        SearchBar()
    }
}

@Composable
fun AccountLine() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Songs",
            fontFamily = AntonioFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 44.sp,
            letterSpacing = (-1.5).sp,
            color = Color.White
        )
        IconButton(
            onClick = { /*Account screen*/ },
        ) {
            Icon(
                imageVector = account_circle,
                contentDescription = "Profile",
                modifier = Modifier,
                tint = Color.White
            )
        }
    }
}

@Composable
fun SearchBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .clip(RoundedCornerShape(70.dp))
            .background(Color.White)
    ) {}
}


/*---------------------------------------------------*/