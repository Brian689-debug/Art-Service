package com.example.artservice.ui.theme.screens.Interactions


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.artservice.Navigation.ROUTE_ABOUT
import com.example.artservice.Navigation.ROUTE_BUY
import com.example.artservice.Navigation.ROUTE_REGISTER
import com.example.artservice.R
import com.example.artservice.ui.theme.ArtServiceTheme


@Composable
fun Interactions(navController: NavController) {


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
            Spacer(modifier = Modifier.height(20.dp))

            Image(painter = painterResource(id = R.drawable.interactions), contentDescription = "")
            Text(
                text = "1: Fostering Dynamic Teacher-Student Interactions\n" +
                        "\n" +
                        "Our art service application revolutionizes the classroom experience by facilitating meaningful interactions between teachers and students. With intuitive tools for real-time feedback, collaborative projects, and personalized lesson planning, the app bridges the gap between instruction and engagement. Teachers can easily track progress, provide constructive critiques, and adjust assignments based on individual student needs. Students benefit from instant feedback, interactive learning modules, and opportunities for peer collaboration. Experience how our application enhances the educational process, making art education more interactive and impactful than ever before.\n" +
                        "2: Enhancing Classroom Communication\n" +
                        "\n" +
                        "This Art Service Application transforms the way teachers and students communicate and collaborate in the art classroom. Our platform offers seamless messaging systems, virtual critique sessions, and easy access to resources and assignments. Teachers can create interactive lessons and provide personalized guidance, while students can engage in discussions, share their work, and receive real-time feedback. This streamlined communication fosters a more engaging learning environment, allowing for more effective teaching and a deeper connection between educators and their students.\n" +
                        "3: Interactive Learning Made Easy\n" +
                        "\n" +
                        "Our art service application is designed to enhance interactions between teachers and students with its user-friendly interface and powerful features. Teachers can set up interactive assignments, facilitate group projects, and offer detailed feedback through a centralized platform. Students benefit from a rich array of tools to submit work, participate in discussions, and track their progress. The result is a vibrant learning ecosystem where both teachers and students stay connected, engaged, and motivated throughout the artistic process.\n" +
                        "4: Streamlined Educational Experience\n" +
                        "\n" +
                        "Our Art Service also creates a streamlined educational experience by optimizing interactions between teachers and students. Our application’s features include customizable lesson plans, digital portfolios, and real-time feedback mechanisms. Teachers can easily monitor student progress, offer tailored advice, and manage classroom activities efficiently. Students have direct access to resources, peer reviews, and instructor feedback, which fosters a collaborative and supportive learning environment. Discover how our app enhances the teaching and learning experience, making art education more effective and enjoyable.\n" +
                        "5: Empowering Teachers and Inspiring Students\n" +
                        "\n" +
                        "We are dedicated to empowering teachers and inspiring students through enhanced interaction capabilities. Our application provides tools for interactive critiques, personalized instruction, and collaborative projects, making it easier for teachers to engage with students and support their creative growth. Students, in turn, gain access to instant feedback, engaging assignments, and peer collaboration opportunities. This dynamic interaction fosters a more interactive and supportive learning environment, driving creativity and educational success."
            )

            Text(
                text = "Below are images showing student teacher interactions",
                modifier = Modifier.fillMaxSize(),
                fontSize = 15.sp
            )
            Image(painter = painterResource(id = R.drawable.interactions1), contentDescription = "")
            Spacer(modifier = Modifier.height(3.dp))
            Image(painter = painterResource(id = R.drawable.interactions2), contentDescription = "")
            Spacer(modifier = Modifier.height(3.dp))
            Image(painter = painterResource(id = R.drawable.interactions3), contentDescription = "")
            Spacer(modifier = Modifier.height(3.dp))
            Image(painter = painterResource(id = R.drawable.interactions4), contentDescription = "")
            Spacer(modifier = Modifier.height(3.dp))
            Image(painter = painterResource(id = R.drawable.interactions5), contentDescription = "")
            Spacer(modifier = Modifier.height(3.dp))
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InteractionsPreview() {
    ArtServiceTheme {
        Interactions(rememberNavController())
    }
}