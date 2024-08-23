package com.example.artservice.ui.theme.screens.Splash

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.artservice.ui.theme.ArtServiceTheme


@Composable
fun Splash(navController: NavController) {




}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SplashPreview() {
    ArtServiceTheme {
        Splash(rememberNavController())
    }
}