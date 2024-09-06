package com.example.artservice.Navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.artservice.ui.theme.screens.About.About
import com.example.artservice.ui.theme.screens.Affordability.Affordability
import com.example.artservice.ui.theme.screens.Awards.Awards
import com.example.artservice.ui.theme.screens.Book.Book
import com.example.artservice.ui.theme.screens.Buy.Buy
import com.example.artservice.ui.theme.screens.Creativity.Creativity
import com.example.artservice.ui.theme.screens.Interactions.Interactions
import com.example.artservice.ui.theme.screens.Login.Login
import com.example.artservice.ui.theme.screens.Networking.Networking
import com.example.artservice.ui.theme.screens.Register.Register
import com.example.artservice.ui.theme.screens.Services.Services
import com.example.artservice.ui.theme.screens.Splash.Splash


@Composable
fun AppNavHost(navController:NavHostController= rememberNavController(),
               startDestination:String = ROUTE_SPLASH){

    NavHost(navController=navController,
        startDestination=startDestination){
        composable(ROUTE_REGISTER){ Register(navController) }
        composable(ROUTE_SPLASH){ Splash(navController) }
        composable(ROUTE_BOOK){ Book(navController) }
        composable(ROUTE_ABOUT){ About(navController)}
        composable(ROUTE_AFFORDABILITY){ Affordability(navController)}
        composable(ROUTE_AWARDS){ Awards(navController)}
        composable(ROUTE_CREATIVITY){ Creativity(navController)}
        composable(ROUTE_INTERACTIONS){ Interactions(navController)}
        composable(ROUTE_SERVICES){  Services(navController)}
        composable(ROUTE_NETWORKING){ Networking(navController)}
        composable(ROUTE_LOGIN){ Login(navController)}
        composable(ROUTE_BUY){ Buy(navController)}
    }
}