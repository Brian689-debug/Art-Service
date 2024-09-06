package com.example.artservice.ui.theme.screens.Creativity


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
fun Creativity(navController: NavController) {
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

    Spacer(modifier = Modifier.height(20.dp))
Column (modifier = Modifier
    .fillMaxSize()
    .padding(5.dp)
    .padding(innerpadding)
    .verticalScroll(rememberScrollState())) {
    Image(painter = painterResource(id = R.drawable.creativity), contentDescription = "")
    Text(
        text = "1: Unleashing Creative Potential\n" +
                "\n" +
                "We believe that creativity is not just an innate talent but a skill that can be nurtured and developed. Our unique approach is designed to enhance creativity through a blend of personalized guidance and innovative techniques. By offering tailored art workshops, interactive brainstorming sessions, and one-on-one mentoring, we create an environment where imagination thrives and artistic boundaries are pushed. Experience how our service transforms your creative process, helping you discover new perspectives and unlock hidden potential.\n" +
                "2: Fueling Artistic Innovation\n" +
                "\n" +
                "Creativity flourishes in environments that stimulate and challenge. This application provides just that by integrating cutting-edge tools and methodologies into our art programs. Our workshops emphasize experimental techniques and cross-disciplinary approaches, encouraging artists to explore beyond traditional norms. Whether through collaborative projects or individual explorations, our service is designed to break through creative blocks and inspire fresh, innovative ideas. Join us and witness how our services fuel your artistic journey with unprecedented vigor.\n" +
                "3: Transformative Creative Experience\n" +
                "\n" +
                "Imagine a space where your creative ideas are not only welcomed but actively nurtured. That’s what [Your Art Service Name] offers—a transformative experience tailored to enhance your creative abilities. Our art services are crafted to challenge conventional thinking, foster artistic exploration, and encourage experimentation. With a focus on hands-on learning and constructive feedback, we guide you in developing unique styles and approaches. Discover how our personalized support and dynamic environment can lead to breakthroughs in your artistic expression.\n" +
                "4: Personalized Creativity Enhancement\n" +
                "\n" +
                "We understand that each artist’s journey is unique. That’s why our art services are tailored to your individual needs and goals. By offering customized art programs, specialized workshops, and direct mentorship, we ensure that your creative growth is both supported and accelerated. Our service helps you set and achieve personal artistic goals, explore new techniques, and refine your skills. Embrace a creative partnership that is as unique as your artistic vision and see how our service enhances your creative potential.\n" +
                "5: Igniting Imagination Through Art\n" +
                "\n" +
                "Creativity thrives when it is given the freedom to explore and evolve. [Your Art Service Name] is dedicated to igniting your imagination and expanding your creative horizons. Through our interactive sessions, innovative projects, and collaborative environments, we provide the tools and inspiration needed to take your artistry to new heights. Our service is designed to challenge your thinking, encourage experimentation, and support your artistic endeavors, ensuring that your creative spark continues to burn brightly.\n"
    )


}
}
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CreativityPreview() {
    ArtServiceTheme {
        Creativity(rememberNavController())
    }
}