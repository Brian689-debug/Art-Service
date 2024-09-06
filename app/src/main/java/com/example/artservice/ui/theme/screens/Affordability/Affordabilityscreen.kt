package com.example.artservice.ui.theme.screens.Affordability


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun Affordability(navController: NavController) {
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


        Column(
            modifier = Modifier
                .wrapContentWidth()
                .fillMaxSize()
                .padding(innerpadding)
                .padding(5.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Image(painter = painterResource(id = R.drawable.affordability), contentDescription = "")
            Text(
                text = "1. Art Classes Designed for Every Budget\n" +
                        "\n" +
                        "We believe that learning art should be an enriching experience, not a financial strain. Our art classes are structured to cater to a wide range of budgets, ensuring that everyone has the opportunity to explore their creative potential. Here’s how we achieve affordability:\n" +
                        "\n" +
                        " - Sliding Scale Fees: To accommodate different financial situations, we offer sliding scale fees for our classes. This means that you pay based on what you can afford, making high-quality art education available to more people.\n" +
                        " - Community Discounts: We provide special discounts for community groups, students, and seniors. These discounts ensure that our classes are affordable for various demographics, promoting inclusivity and diversity in our art community.\n" +
                        " - Flexible Scheduling: Our classes are offered at various times, including evenings and weekends, to fit into busy schedules without additional costs. This flexibility allows you to learn at your own pace and convenience.\n" +
                        " - Online Learning Options: For those who prefer the comfort of home, we offer online art classes. These virtual sessions are not only cost-effective but also eliminate the need for transportation expenses, making learning even more affordable.\n" +
                        "\n" +
                        "2. Affordable Artworks for Every Taste and Budget\n" +
                        "\n" +
                        "We believe that beautiful art should be accessible to everyone, regardless of budget. Our approach to selling artworks is designed to provide you with a wide range of options:\n" +
                        "\n" +
                        " - Diverse Price Points: We offer artworks at various price points, from affordable prints and posters to more exclusive pieces. This ensures that you can find something that suits both your taste and your budget.\n" +
                        " - Emerging Artists: We collaborate with emerging artists to provide unique and affordable art pieces. Supporting new talent not only helps keep costs down but also gives you the chance to own original works by up-and-coming artists.\n" +
                        " - Limited Edition Prints: For those who want a touch of exclusivity without the high price tag of originals, we offer limited edition prints. These high-quality reproductions provide a cost-effective way to own beautiful and collectible art.\n" +
                        " - Payment Plans: To make purchasing art even more accessible, we offer flexible payment plans. This allows you to spread the cost of your artwork over time, making it easier to invest in pieces you love.\n" +
                        "\n" +
                        "3. The Value of Affordable Art Services\n" +
                        "\n" +
                        "Choosing us means benefiting from our commitment to affordability without sacrificing quality. By making art classes and artworks accessible, we support a vibrant and inclusive art community. Here’s what sets us apart:\n" +
                        "\n" +
                        " - Quality and Accessibility: We ensure that our art education and artworks maintain high standards while remaining affordable. This balance allows you to enjoy both the learning process and the final product without compromise.\n" +
                        " - Community Engagement: Our affordable services foster a sense of community and cultural enrichment. By making art accessible, we encourage more people to engage with and appreciate art in their daily lives.\n" +
                        " - Support for Artists: Our model supports emerging artists by providing them with a platform to showcase their work. This not only helps new talents grow but also enriches our collection with diverse and exciting pieces.\n" +
                        "\n" +
                        "4. Conclusion: Embrace Affordable Art with us\n" +
                        "\n" +
                        "We’re dedicated to making art education and artwork accessible to everyone. Whether you’re looking to learn a new skill or find the perfect piece for your home, our affordable options ensure that art is within reach for all. Experience the joy of creativity and the beauty of art without financial strain, and join us in celebrating the transformative power of art."
            )


        }
    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AffordabilityPreview() {
    ArtServiceTheme {
        Affordability(rememberNavController())
    }
}