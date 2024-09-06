package com.example.artservice.ui.theme.screens.Splash


import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.artservice.Navigation.ROUTE_REGISTER
import com.example.artservice.Navigation.ROUTE_SPLASH
import com.example.artservice.R
import kotlinx.coroutines.delay


@Composable
fun Splash(navController: NavController) {

val scale = remember {
    Animatable(0f)
}
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.6f,
            animationSpec = tween(durationMillis = 0,
                easing = {OvershootInterpolator(4f).getInterpolation(4f)
                })
        )
        delay(800)
        navController.navigate(ROUTE_REGISTER){
            popUpTo(ROUTE_SPLASH){
                inclusive=true
            }
        }
    }

Column (modifier = Modifier.background(color = Color.LightGray)){
    Card(
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight(), shape = CircleShape
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .wrapContentHeight(Alignment.CenterVertically)
                .wrapContentWidth(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconart2),
                contentDescription = "",
                modifier = Modifier
                    .scale(scale.value)
                    .size(150.dp)
            )
        }
    }
}


}
@Composable
@Preview(showBackground = true)
fun SplashPreview(){
    Splash(rememberNavController())
}