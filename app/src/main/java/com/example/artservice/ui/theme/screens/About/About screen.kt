package com.example.artservice.ui.theme.screens.About


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.artservice.R
import com.example.artservice.ui.theme.ArtServiceTheme



@Composable
fun About(navController: NavController) {
Column (modifier = Modifier
    .wrapContentWidth()
    .fillMaxSize()
    .background(Color.LightGray)
    .verticalScroll(rememberScrollState())) {
    Spacer(modifier = Modifier.height(60.dp))

//First cards row

    Row(
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.width(32.dp))
        Card (modifier = Modifier
            .wrapContentWidth()
            .height(120.dp)
            .width(120.dp)){
            Image(
                painter = painterResource(id = R.drawable.affordability),
                contentDescription = "Affordability"
            )
        }
        Spacer(modifier = Modifier.width(65.dp))
Card (modifier = Modifier
    .width(120.dp)
    .height(120.dp)
    .wrapContentWidth()){
    Image(painter = painterResource(id = R.drawable.location), contentDescription = "Location")
}

    }
    Spacer(modifier = Modifier.height(5.dp))

//    First texts row

Row (modifier = Modifier
    .wrapContentWidth()
    .wrapContentHeight(),
    horizontalArrangement = Arrangement.SpaceBetween){
    Spacer(modifier = Modifier.width(55.dp))
    Text(text = "Affordability")
Spacer(modifier = Modifier.width(145.dp))
    Text(text = "Location")
}
Spacer(modifier = Modifier.height(30.dp))

//Second cards row

    Row(
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.width(32.dp))
        Card (modifier = Modifier
            .wrapContentWidth()
            .height(120.dp)
            .width(120.dp)){
            Image(
                painter = painterResource(id = R.drawable.support),
                contentDescription = "Affordability"
            )
        }
        Spacer(modifier = Modifier.width(65.dp))
        Card (modifier = Modifier
            .width(120.dp)
            .height(120.dp)
            .wrapContentWidth()){
            Image(painter = painterResource(id = R.drawable.interactions), contentDescription = "Location")
        }

    }
    Spacer(modifier = Modifier.height(5.dp))

//Second texts row

    Row (modifier = Modifier
        .wrapContentWidth()
        .wrapContentHeight(),
        horizontalArrangement = Arrangement.SpaceBetween){
        Spacer(modifier = Modifier.width(65.dp))
    Text(text = "Support")
        Spacer(modifier = Modifier.width(155.dp))
        Text(text = "Interactions")
    }
    Spacer(modifier = Modifier.height(30.dp))

//Third cards row

    Row(
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.width(32.dp))
        Card (modifier = Modifier
            .wrapContentWidth()
            .height(120.dp)
            .width(120.dp)){
            Image(
                painter = painterResource(id = R.drawable.creativity),
                contentDescription = "Affordability"
            )
        }
        Spacer(modifier = Modifier.width(65.dp))
        Card (modifier = Modifier
            .width(120.dp)
            .height(120.dp)
            .wrapContentWidth()){
            Image(painter = painterResource(id = R.drawable.networking), contentDescription = "Location")
        }

    }
    Spacer(modifier = Modifier.height(5.dp))

//Third texts row

    Row (modifier = Modifier
        .wrapContentWidth()
        .wrapContentHeight(),
        horizontalArrangement = Arrangement.SpaceBetween){
        Spacer(modifier = Modifier.width(50.dp))
        Text(text = "Creativity")
        Spacer(modifier = Modifier.width(155.dp))
        Text(text = "Networking")
    }
    Spacer(modifier = Modifier.height(30.dp))

//Middle card

Row (modifier = Modifier
    .wrapContentWidth()
    .wrapContentHeight()){
    Spacer(modifier = Modifier.width(128.dp))
    Card (modifier = Modifier
        .wrapContentWidth()
        .width(120.dp)
        .height(120.dp)){
        Image(painter = painterResource(id = R.drawable.awards), contentDescription = "Awards")
    }
}
Spacer(modifier = Modifier.height(5.dp))

//    Mid text row

Row (modifier = Modifier.wrapContentWidth()){
    Spacer(modifier = Modifier.width(165.dp))
    Text(text = "Awards")
}



























































}
}
    @Preview(showBackground = true, showSystemUi = true)
@Composable
fun AboutPreview() {
        ArtServiceTheme {
            About(rememberNavController())
        }
    }














