package com.example.artservice.ui.theme.screens.Buy


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
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
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.artservice.Navigation.ROUTE_ABOUT
import com.example.artservice.Navigation.ROUTE_BUY
import com.example.artservice.Navigation.ROUTE_REGISTER
import com.example.artservice.R
import com.example.artservice.ui.theme.ArtServiceTheme



@Composable
fun Buy(navController: NavController) {


    Scaffold(
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
                .padding(5.dp)
                .verticalScroll(rememberScrollState())
        ) {

            Image(
                painter = painterResource(id = R.drawable.painting1),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "~Specifications~")
            Text(text = "Size : 0.5 by 0.5 metres")
            Text(text = "Price : 18,000Kshs")

            Image(
                painter = painterResource(id = R.drawable.painting2),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "~Specifications~")
            Text(text = "Size : 1.5 by 1.5 metres")
            Text(text = "Price : 25,000Kshs")

            Image(
                painter = painterResource(id = R.drawable.painting3),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "~Specifications~")
            Text(text = "Size : 0.8 by 0.8 metres")
            Text(text = "Price : 15,000Kshs")

            Image(
                painter = painterResource(id = R.drawable.painting4),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "~Specifications~")
            Text(text = "Size : 1 by 1 metres")
            Text(text = "Price : 24,500Kshs")


            Image(
                painter = painterResource(id = R.drawable.painting5),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "~Specifications~")
            Text(text = "Size : 0.5 by 0.5 metres")
            Text(text = "Price : 22,000Kshs")


            Image(
                painter = painterResource(id = R.drawable.painting6),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "~Specifications~")
            Text(text = "Size : 1.2 by 1.2 metres")
            Text(text = "Price : 18,700Kshs")

            Image(
                painter = painterResource(id = R.drawable.painting7),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "~Specifications~")
            Text(text = "Size :  1.8 by 1.8 metres")
            Text(text = "Price : 35,000Kshs")

            Image(
                painter = painterResource(id = R.drawable.painting8),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "~Specifications~")
            Text(text = "Size : 0.5 by 0.5 metres")
            Text(text = "Price : 28,500Kshs")

            Spacer(modifier = Modifier.height(5.dp))

            Text(text = "Contact : 0769867880")

                val mContext = LocalContext.current
                OutlinedButton(onClick ={
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }, modifier = Modifier
                    .wrapContentWidth()
                    .align(Alignment.CenterHorizontally)
                ) {
                    Text(text = "PAY VIA MPESA")
                }

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BuyPreview() {
    ArtServiceTheme {
        Buy(rememberNavController())
    }
}