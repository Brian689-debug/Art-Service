package com.example.artservice.ui.theme.screens.Services


import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.artservice.Navigation.ROUTE_ABOUT
import com.example.artservice.Navigation.ROUTE_BOOK
import com.example.artservice.Navigation.ROUTE_BUY
import com.example.artservice.Navigation.ROUTE_REGISTER
import com.example.artservice.ui.theme.ArtServiceTheme


@Composable
fun Services(navController: NavController) {
    Scaffold( modifier = Modifier.wrapContentWidth().background(Color.Cyan),
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = { navController.navigate(ROUTE_ABOUT) }) {
                        Icon(Icons.Filled.Home, contentDescription = "Home")

                    }
                    Spacer(modifier = Modifier.width(105.dp))
                    IconButton(onClick = { navController.navigate(ROUTE_REGISTER) }) {
                        Icon(Icons.Filled.Info, contentDescription = "settings")
                    }
                    Spacer(modifier = Modifier.width(110.dp))
                    IconButton(onClick = { navController.navigate(ROUTE_BUY) }) {
                        Icon(Icons.Filled.ShoppingCart, contentDescription = "Email")
                    }
                }

            )
        }


    ) { innerpadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerpadding)
                .verticalScroll(rememberScrollState())
                .padding(5.dp)
        ) {
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "1 :Art Classes", modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.CenterHorizontally), fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "There are physical art classes provided everyday from 8Am-4Pm in three time periods that is 8Am-10Am,11Am-1Pm,2Pm-4Pm and are always full of positive results at the end all at the price of 1000Kshs per lesson.To book classes with is click the button below.")
            Button(
                onClick = { navController.navigate(ROUTE_BOOK) },
                modifier = Modifier.wrapContentWidth()
            ) {
                Text(text = "BOOK CLASSES")
            }
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "2 : Art Products on sale",
                modifier = Modifier.fillMaxSize(),
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "There are several artistic products such as paintings and sculptures that we sell and believe can make any place bring out perfect appearances.To buy our products click the button below. ")
            Button(onClick = { navController.navigate(ROUTE_BUY) }) {
                Text(text = "BUY PRODUCTS")
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ServicesPreview() {
    ArtServiceTheme {
        Services(rememberNavController())
    }
}