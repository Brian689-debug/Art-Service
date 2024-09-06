package com.example.artservice.ui.theme.screens.Networking


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.artservice.Navigation.ROUTE_ABOUT
import com.example.artservice.Navigation.ROUTE_BUY
import com.example.artservice.Navigation.ROUTE_REGISTER
import com.example.artservice.R
import com.example.artservice.ui.theme.ArtServiceTheme


@Composable
fun Networking(navController: NavController) {

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

        Spacer(modifier = Modifier.height(30.dp))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerpadding)
                .padding(5.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Image(painter = painterResource(id = R.drawable.networking), contentDescription = "")
            Text(
                text = "1: Building Strong Artistic Networks\n" +
                        "\n" +
                        "This Art Service Application is designed to revolutionize networking within the art community. Our platform features advanced networking tools that connect artists, educators, and art enthusiasts through curated networks, interest-based groups, and collaborative projects. Users can easily find and connect with like-minded individuals, join specialized communities, and share their work with a broader audience. Experience how our application facilitates meaningful connections and fosters a vibrant network of creative professionals and art lovers.\n" +
                        "2: Connecting Creativity with Opportunity\n" +
                        "\n" +
                        "Our art service application enhances networking by providing users with a suite of tools to expand their professional connections and showcase their talent. With features like interactive portfolios, user profiles, and collaborative project spaces, artists can connect with peers, potential clients, and industry experts. The application’s networking algorithms match users with relevant contacts and opportunities, making it easier to build relationships and explore new ventures in the art world. Discover how our app opens doors to new opportunities and strengthens artistic networks.\n" +
                        "3: Facilitating Artistic Collaboration\n" +
                        "\n" +
                        "We excel in fostering collaboration through its innovative networking features. The platform offers tools for creating and joining collaborative art projects, participating in group critiques, and engaging in community discussions. Users can connect with other artists and educators to share ideas, exchange feedback, and work together on creative endeavors. By facilitating these connections, our application helps users build a robust network of collaborators and supporters, enhancing their artistic journey and career growth.\n" +
                        "4: Expanding Your Art Network\n" +
                        "\n" +
                        "Our art service application is designed to maximize networking potential for its users. With features such as event invitations, networking forums, and integrated social media sharing, artists and art professionals can expand their reach and engage with a wider audience. The application’s networking tools also allow users to connect with mentors, industry leaders, and peers, providing valuable opportunities for professional development and collaboration. Experience how our app makes it easier to build and grow a network that supports and amplifies your artistic pursuits.\n" +
                        "5: Elevating Professional Connections\n" +
                        "\n" +
                        "This Application transforms how artists and art professionals network by offering a range of strategic tools and features. Our platform includes user-friendly networking dashboards, personalized connection recommendations, and industry-specific discussion groups. These tools help users identify and connect with relevant contacts, from fellow artists to gallery owners and art critics. By facilitating targeted and effective networking, our application empowers users to build valuable relationships and advance their careers in the art world.\n"
            )
        }

    }
}
data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon : ImageVector,
    val hasNews :Boolean,
    val badges :Int)


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NetworkingPreview() {
    ArtServiceTheme {
        Networking(rememberNavController())
    }
}