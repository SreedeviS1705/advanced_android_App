package com.example.advancedapplication.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.advancedapplication.data.Course


@ExperimentalFoundationApi
@Composable
fun CourseSection(course: List<Course>) {
    Text(
        text = "Courses",
        style = MaterialTheme.typography.headlineMedium,
        modifier = Modifier.padding(15.dp)
    )
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(start = 7.5.dp, end = 7.5.dp, bottom = 100.dp),
        modifier = Modifier.fillMaxHeight(),
        content = {
            items(course.size) {
                // here we have to define how one of these item is look like
                // we will tell after defining item design
                // let me comment it for now and after
                // creating you just have to remove

                 CourseItem(course = course[it])
            }
        })
}