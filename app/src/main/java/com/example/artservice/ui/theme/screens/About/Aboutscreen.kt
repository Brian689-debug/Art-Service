package com.example.artservice.ui.theme.screens.About


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.artservice.Navigation.ROUTE_ABOUT
import com.example.artservice.Navigation.ROUTE_AFFORDABILITY
import com.example.artservice.Navigation.ROUTE_AWARDS
import com.example.artservice.Navigation.ROUTE_BUY
import com.example.artservice.Navigation.ROUTE_CREATIVITY
import com.example.artservice.Navigation.ROUTE_INTERACTIONS
import com.example.artservice.Navigation.ROUTE_NETWORKING
import com.example.artservice.Navigation.ROUTE_REGISTER
import com.example.artservice.Navigation.ROUTE_SERVICES
import com.example.artservice.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun About(navController: NavController) {
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
                    .padding(innerpadding),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(40.dp))
                Image(
                    painter = painterResource(id = R.drawable.iconart2),
                    contentDescription = "",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Perfect your artistic mind with us",
                    fontSize = 18.sp,
                )

                Spacer(modifier = Modifier.height(15.dp))

                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                ) {

                    //Main Card
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(700.dp),
                        shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                        colors = CardDefaults.cardColors(Color.Yellow)
                    ) {
                        //Row 1
                        Row(modifier = Modifier.padding(20.dp)) {
                            //card 1
                            Card(modifier = Modifier
                                .clickable { navController.navigate(ROUTE_AFFORDABILITY) }
                                .width(160.dp)
                                .height(180.dp),
                                elevation = CardDefaults.cardElevation(10.dp)) {

                                Column {
                                    Spacer(modifier = Modifier.height(15.dp))

                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.affordability),
                                            contentDescription = "",
                                            modifier = Modifier.size(70.dp)
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(15.dp))

                                    Text(
                                        text = "Affordability",
                                        fontSize = 18.sp,
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )
                                }

                            }
                            //End of card1
                            Spacer(modifier = Modifier.width(20.dp))

                            //card 2
                            Card(modifier = Modifier
                                .clickable { navController.navigate(ROUTE_CREATIVITY) }
                                .width(160.dp)
                                .height(180.dp)) {

                                Column {
                                    Spacer(modifier = Modifier.height(15.dp))

                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.creativity),
                                            contentDescription = "",
                                            modifier = Modifier.size(70.dp)
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(15.dp))

                                    Text(
                                        text = "Creativity",
                                        fontSize = 18.sp,
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )
                                }

                            }
                            //End of card2

                        }
                        //end of row1

                        //Row 2
                        Row(modifier = Modifier.padding(20.dp)) {
                            //card 3
                            Card(modifier = Modifier
                                .clickable { navController.navigate(ROUTE_INTERACTIONS) }
                                .width(160.dp)
                                .height(180.dp),
                                elevation = CardDefaults.cardElevation(10.dp)) {

                                Column {
                                    Spacer(modifier = Modifier.height(15.dp))

                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.interactions),
                                            contentDescription = "",
                                            modifier = Modifier.size(70.dp)
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(15.dp))

                                    Text(
                                        text = "Interactions",
                                        fontSize = 18.sp,
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )
                                }

                            }

                            Spacer(modifier = Modifier.width(20.dp))
                            Card(modifier = Modifier
                                .clickable { navController.navigate(ROUTE_AWARDS) }
                                .width(160.dp)
                                .height(180.dp),
                                elevation = CardDefaults.cardElevation(10.dp)) {

                                Column {
                                    Spacer(modifier = Modifier.height(15.dp))

                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.awards),
                                            contentDescription = "",
                                            modifier = Modifier.size(70.dp)
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(15.dp))

                                    Text(
                                        text = "Awards",
                                        fontSize = 18.sp,
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )
                                }

                            }

                            //End of card 3
                            Spacer(modifier = Modifier.width(20.dp))

                        }
                        //end of row 2

                        //Row 3
                        Row(modifier = Modifier.padding(20.dp)) {
                            //card 1
                            Card(modifier = Modifier
                                .clickable { navController.navigate(ROUTE_NETWORKING) }
                                .width(160.dp)
                                .height(180.dp)) {

                                Column {
                                    Spacer(modifier = Modifier.height(15.dp))

                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.networking),
                                            contentDescription = "",
                                            modifier = Modifier.size(70.dp)
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(15.dp))

                                    Text(
                                        text = "Networking",
                                        fontSize = 18.sp,
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )
                                }

                            }
                            //End of card1
                            Spacer(modifier = Modifier.width(20.dp))

                            //card 6
                            Card(modifier = Modifier
                                .clickable { navController.navigate(ROUTE_SERVICES) }
                                .width(160.dp)
                                .height(180.dp)) {

                                Column {
                                    Spacer(modifier = Modifier.height(15.dp))

                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.services),
                                            contentDescription = "",
                                            modifier = Modifier.size(70.dp)
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(15.dp))

                                    Text(
                                        text = "Services Available",
                                        fontSize = 18.sp,
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )
                                }

                            }
                            //End of card 6

                        }
                        //end of row3


                    }
                    //End of main card

                }


            }
        }
    }
@Composable
@Preview(showBackground = true)
fun AboutPreview(){
    About(rememberNavController())
}