package com.example.musichub.ui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musichub.R
import com.example.musichub.ui.components.CustomTopBar
import com.example.musichub.ui.components.DefaultNavBar
import com.example.musichub.ui.components.SongPreview
import com.example.musichub.ui.theme.NotSoBlack

@Preview(
    showBackground = true, // Включает белый/черный фон позади экрана, чтобы он не был прозрачным
    showSystemUi = true,   // Показывает верхний статус-бар телефона и нижнюю навигацию
    name = "Explore Screen Preview" // Название вкладки в панели дизайна
)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val scrollState = rememberLazyListState()
    //val isScrolled = true
    val isScrolled by remember {
        derivedStateOf {
            scrollState.firstVisibleItemIndex > 0 || scrollState.firstVisibleItemScrollOffset > 0
        }
    }
    Scaffold(
        modifier = Modifier,
        containerColor = NotSoBlack,
        topBar = { CustomTopBar(isScrolled) },
        bottomBar = { DefaultNavBar() },
    ) { innerPadding ->
        LazyColumn(
            state = scrollState,
            contentPadding = innerPadding,
            modifier = Modifier.fillMaxWidth(),
        ) {
            items(50) { index ->
                SongPreview(R.drawable.fromzero,"Unshatter","Linkin Park")
            }
        }
    }
}

@Composable
fun SongsList() {

    LazyColumn() { }
}