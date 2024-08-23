package com.example.artservice.Navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.artservice.ui.theme.screens.About.About
import com.example.artservice.ui.theme.screens.Book.Book
import com.example.artservice.ui.theme.screens.Register.Register
import com.example.artservice.ui.theme.screens.Splash.Splash


@Composable
fun AppNavHost(navController:NavHostController= rememberNavController(),
               startDestination:String = ROUTE_REGISTER){

    NavHost(navController=navController,
        startDestination=startDestination){
        composable(ROUTE_REGISTER){ Register(navController) }
        composable(ROUTE_SPLASH){ Splash(navController) }
        composable(ROUTE_BOOK){ Book(navController) }
        composable(ROUTE_ABOUT){ About(navController)}

    }
}