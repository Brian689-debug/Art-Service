package com.example.artservice.ui.theme.screens.Book


import android.content.Context
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
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.example.artservice.ui.theme.data.AuthViewModel


@Composable
fun Book(navController: NavController) {


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


    ){innerpadding->

    Column (modifier = Modifier
    .fillMaxSize()
        .padding(innerpadding)
    .padding(20.dp)
    .verticalScroll(rememberScrollState())) {

        var fullname by remember {
            mutableStateOf(value = "")
        }
        var time by remember {
            mutableStateOf(value = "")
        }
        var email by remember {
            mutableStateOf(value = "")
        }

        Spacer(modifier = Modifier.height(50.dp))
        Card(
            modifier = Modifier
                .wrapContentWidth()
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconart2),
                contentDescription = "",
                modifier = Modifier.size(100.dp)
            )
        }
        OutlinedTextField(modifier = Modifier
            .wrapContentWidth()
            .align(Alignment.CenterHorizontally),
            placeholder = { Text(text = "Please enter your Full Name") },
            label = { Text(text = "Enter your Full Name") },
            value = fullname,
            onValueChange = { newName -> fullname = newName })

        OutlinedTextField(modifier = Modifier
            .wrapContentWidth()
            .align(Alignment.CenterHorizontally),
            placeholder = { Text(text = "Please enter your Email") },
            label = { Text(text = "Enter your Email") },
            value = email,
            onValueChange = { newName -> email = newName })

        OutlinedTextField(modifier = Modifier
            .wrapContentWidth()
            .align(Alignment.CenterHorizontally),
            placeholder = { Text(text = "Please enter your preferred lesson period") },
            label = { Text(text = "Enter your Preferred Class Time") },
            value = time,
            onValueChange = { newName -> time = newName })

        Spacer(modifier = Modifier.height(5.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)
        Button(
            onClick = { authViewModel.book( email, fullname, time) }, modifier = Modifier
                .wrapContentWidth()
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "SUBMIT")
        }


    }
}
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BookPreview() {
    ArtServiceTheme {
        Book(rememberNavController())
    }
}