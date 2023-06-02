package com.example.advancedapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.advancedapplication.ui.theme.ButtonGreen
import com.example.advancedapplication.ui.theme.DarkerButtonGreen
import com.example.advancedapplication.ui.theme.TextWhite

@Composable
fun ChipSection(chips: List<String>) {
    var selectedChipIndex by remember {
        mutableStateOf(0)
    }

    LazyRow {
        items(chips.size) { index ->
            Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable { selectedChipIndex = index }
                    .clip(
                        RoundedCornerShape(10.dp)
                    )
                    .background(
                        if (selectedChipIndex == index) ButtonGreen
                        else DarkerButtonGreen
                    )
                    .padding(15.dp)) {
                Text(text = chips[index], color = TextWhite)
            }
        }
    }
}