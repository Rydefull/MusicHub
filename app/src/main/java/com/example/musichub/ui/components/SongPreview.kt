package com.example.musichub.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musichub.ui.icons.account_circle
import com.example.musichub.ui.icons.favorite
import com.example.musichub.ui.theme.NotSoBlack

@Composable
fun SongPreview(@DrawableRes id: Int, name: String, band: String){
    ListItem(
        modifier = Modifier
            .clickable {  }
            .padding(horizontal = 8.dp),
        colors = ListItemDefaults.colors(
            containerColor = NotSoBlack,
            headlineColor = Color.White,
            supportingColor = Color.Gray
        ),
        leadingContent = { Image(
            painter = painterResource(id=id),
            contentDescription = "Cover",
            modifier = Modifier
                .size(56.dp)
                .clip(RoundedCornerShape(8.dp))
        ) },
        headlineContent = { Text(text = name) },
        supportingContent = {Text(text = band)},
        trailingContent = { IconButton(
            onClick = {},
        ) {
            Icon(
                contentDescription = "Favorite",
                imageVector = favorite
            )
        } }
    )
}