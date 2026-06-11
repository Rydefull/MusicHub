package com.example.chordsfinder.presentation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuAnchorType
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chordsfinder.presentation.ui.theme.NotSoBlack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SortBtn(
    selectedSort: String, //удалить аргументы
    onSortSelected: (String) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    val sortOptions = listOf("Title", "Artist", "Date Added")

    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = !expanded },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(44.dp)
                .menuAnchor(
                    ExposedDropdownMenuAnchorType.PrimaryNotEditable,
                    enabled = true
                ), // Привязка меню к этой плашке
            shape = RoundedCornerShape(12.dp),
            color = NotSoBlack,
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Sort by: $selectedSort",
                    color = Color.White,
                    fontSize = 14.sp
                )
                ExposedDropdownMenuDefaults.TrailingIcon(
                    expanded = expanded,
                    Modifier.graphicsLayer(colorFilter = ColorFilter.tint(Color.White))
                )
            }
        }

        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.exposedDropdownSize(),
            containerColor = NotSoBlack,
            shape = RoundedCornerShape(12.dp),
        ) {
            sortOptions.forEach { option ->
                DropdownMenuItem(
                    text = { Text(text = option, fontSize = 14.sp) },
                    onClick = {
                        onSortSelected(option)
                        expanded = false
                    },
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }
    }
}