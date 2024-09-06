package com.example.artservice.ui.theme.screens.Register


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.artservice.Navigation.ROUTE_ABOUT
import com.example.artservice.Navigation.ROUTE_LOGIN
import com.example.artservice.R
import com.example.artservice.ui.theme.ArtServiceTheme
import com.example.artservice.ui.theme.data.AuthViewModel


@Composable
fun Register(navController: NavController) {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)) {
        var email by remember {
            mutableStateOf(value = "")
        }
        var password by remember {
            mutableStateOf(value = "")
        }


        Spacer(modifier = Modifier.height(160.dp))

        Card (modifier = Modifier
            .wrapContentWidth()
            .align(Alignment.CenterHorizontally)){
            Image(painter = painterResource(id = R.drawable.brain), contentDescription = "", modifier = Modifier.wrapContentWidth().size(130.dp))
        }
   Text(text = "Register Here", modifier = Modifier
       .wrapContentWidth()
       .align(Alignment.CenterHorizontally),
       fontSize = 30.sp,
       color = Color.Magenta)

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(modifier = Modifier
            .wrapContentWidth()
            .align(Alignment.CenterHorizontally),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")},
            label = { Text(text = "Enter Email") },
            placeholder = { Text(text = "Please Enter Email") },
            value = email,
            onValueChange = { newName -> email = newName })
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(modifier = Modifier
            .wrapContentWidth()
            .align(Alignment.CenterHorizontally),
            leadingIcon = { Icon(imageVector = Icons.Default.Create, contentDescription = "")},
            label = { Text(text = "Enter Password")},
            placeholder = { Text(text = "Please Enter Password")},
            value = password,
            onValueChange ={ newName -> password = newName }
        )
        Spacer(modifier = Modifier.height(10.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)
        Button(onClick = {
            authViewModel.signup(email, password)

        },
            modifier = Modifier
                .wrapContentWidth()
                .align(Alignment.CenterHorizontally)) {
            Text(text = "SIGN UP")
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterPreview() {
    ArtServiceTheme {
        Register(rememberNavController())
    }
}