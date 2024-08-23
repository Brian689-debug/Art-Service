package com.example.artservice.ui.theme.screens.Book


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.artservice.ui.theme.ArtServiceTheme



@Composable
fun Book(navController: NavController) {




}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BookPreview() {
    ArtServiceTheme {
        Book(rememberNavController())
    }
}