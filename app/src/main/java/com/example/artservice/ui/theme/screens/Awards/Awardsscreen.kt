package com.example.artservice.ui.theme.screens.Awards


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
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
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.ImageLoader
import com.example.artservice.Navigation.ROUTE_ABOUT
import com.example.artservice.Navigation.ROUTE_BUY
import com.example.artservice.Navigation.ROUTE_REGISTER
import com.example.artservice.R
import com.example.artservice.ui.theme.ArtServiceTheme


@Composable
fun Awards(navController: NavController) {
    Scaffold (
        bottomBar = {
            BottomAppBar (
                actions = {
                    IconButton(onClick = { navController.navigate(ROUTE_ABOUT) }) {
                        Icon(Icons.Filled.Home, contentDescription = "Home")

                    }
                    Spacer(modifier = Modifier.width(105.dp))
                    IconButton(onClick = { navController.navigate(ROUTE_REGISTER)}) {
                        Icon(Icons.Filled.Info, contentDescription = "settings")
                    }
                    Spacer(modifier = Modifier.width(110.dp))
                    IconButton(onClick = {navController.navigate(ROUTE_BUY)}) {
                        Icon(Icons.Filled.ShoppingCart, contentDescription = "Email")
                    }
                }

            )
        }


    ) { innerpadding ->

        Column(
            modifier = Modifier
                .wrapContentSize()
                .padding(innerpadding)
                .padding(5.dp)
                .verticalScroll(rememberScrollState())
        ) {

            Spacer(modifier = Modifier.height(30.dp))

            Image(painter = painterResource(id = R.drawable.awards), contentDescription = "")
            Text(text = "This institution has been recognised by several organisations that promote young talent all over the world that is not appreciated most especially in Third World countries.These organisations are such as, NATIONAL ART FIGURES GROUP(N.A.F.G) which awarded this institution as the best for nurturing young talent in art not only in Kenya but also in East Africa.Other awards were from the YOUNG CREATIVES ASSOCIATION(Y.C.A),CREATIVE ARTISTIC MINDS GROUP(C.A.M.G) etc...")


            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "BELOW ARE IMAGES OF AWARDING CEREMONIES",
                modifier = Modifier.wrapContentSize(),
                color = Color.Black
            )


            Spacer(modifier = Modifier.height(10.dp))

            Row() {
                Image(painter = painterResource(id = R.drawable.awards2), contentDescription = "")
                Spacer(modifier = Modifier.width(3.dp))
                Image(painter = painterResource(id = R.drawable.awards3), contentDescription = "")
                Spacer(modifier = Modifier.width(3.dp))
                Image(painter = painterResource(id = R.drawable.awards4), contentDescription = "")


            }
            Row() {
                Image(painter = painterResource(id = R.drawable.awards5), contentDescription = "")
                Spacer(modifier = Modifier.width(3.dp))
                Image(painter = painterResource(id = R.drawable.awards6), contentDescription = "")
                Spacer(modifier = Modifier.width(3.dp))
                Image(painter = painterResource(id = R.drawable.awards7), contentDescription = "")


            }


        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AwardsPreview() {
    ArtServiceTheme {
        Awards(rememberNavController())
    }
}