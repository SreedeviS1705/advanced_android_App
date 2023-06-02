package com.example.advancedapplication.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.advancedapplication.R
import com.example.advancedapplication.data.BottomMenuContent
import com.example.advancedapplication.data.Course
import com.example.advancedapplication.ui.theme.Beige1
import com.example.advancedapplication.ui.theme.Beige2
import com.example.advancedapplication.ui.theme.Beige3
import com.example.advancedapplication.ui.theme.BlueViolet1
import com.example.advancedapplication.ui.theme.BlueViolet2
import com.example.advancedapplication.ui.theme.BlueViolet3
import com.example.advancedapplication.ui.theme.DeepBlue
import com.example.advancedapplication.ui.theme.LightGreen1
import com.example.advancedapplication.ui.theme.LightGreen2
import com.example.advancedapplication.ui.theme.LightGreen3
import com.example.advancedapplication.ui.theme.OrangeYellow1
import com.example.advancedapplication.ui.theme.OrangeYellow2
import com.example.advancedapplication.ui.theme.OrangeYellow3
import com.example.advancedapplication.ui.theme.skyblue1
import com.example.advancedapplication.ui.theme.skyblue2
import com.example.advancedapplication.ui.theme.skyblue3

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {
        Column {
            GreetingSection()
            ChipSection(
                chips = listOf(
                    "Data structures",
                    "Algorithms",
                    "Competitive Programming",
                    "Python"
                )
            )
            SuggestionSection()
            CourseSection(
                course = listOf(
                    Course(
                        title = "Introduction", R.drawable.ic_headphone, BlueViolet1, BlueViolet2,
                        BlueViolet3
                    ),
                    Course(
                        title = "How does AI Works",
                        R.drawable.ic_videocam,
                        LightGreen1,
                        LightGreen2,
                        LightGreen3
                    ),
                    Course(
                        title = "Advance python Course",
                        R.drawable.ic_play,
                        skyblue1,
                        skyblue2,
                        skyblue3
                    ),
                    Course(
                        title = "Advance Java Course",
                        R.drawable.ic_headphone,
                        Beige1,
                        Beige2,
                        Beige3
                    ),
                    Course(
                        title = "prepare for aptitude test",
                        R.drawable.ic_play,
                        OrangeYellow1,
                        OrangeYellow2,
                        OrangeYellow3
                    ),
                    Course(
                        title = "How does AI Works",
                        R.drawable.ic_videocam,
                        LightGreen1,
                        LightGreen2,
                        LightGreen3
                    ),
                )
            )
        }
        // this is the final one that is bottomMenu
        BottomMenu(items = listOf(
            // having 5 instances
            BottomMenuContent("Home", R.drawable.ic_home),
            BottomMenuContent("explore", R.drawable.ic_baseline_explore_24),
            BottomMenuContent("dark mode", R.drawable.ic_moon),
            BottomMenuContent("videos", R.drawable.ic_videocam),
            BottomMenuContent("Profile", R.drawable.ic_profile),
        ), modifier = Modifier.align(Alignment.BottomCenter))
    }
}

@Composable
fun GreetingSection(name: String = "App") {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Column(verticalArrangement = Arrangement.Center) {
            Text(text = "Good morning , $name", style = MaterialTheme.typography.headlineMedium)
            Text(text = "We wish you have a good day!", style = MaterialTheme.typography.bodyMedium)
        }
        Icon(
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = "Search",
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
    }
}
