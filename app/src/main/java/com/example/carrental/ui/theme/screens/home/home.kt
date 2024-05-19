package com.example.carrental.ui.theme.screens.home


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.carrental.R
import com.example.carrental.navigation.ROUTE_CONTACTS
import com.example.carrental.navigation.ROUTE_HOME
import com.example.carrental.navigation.ROUTE_LOGIN
import com.example.carrental.navigation.ROUTE_REGISTER

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(navController: NavController) {

    Box(modifier = Modifier.fillMaxSize())
    Image(painter = painterResource(id = R.drawable.backgrounds), contentDescription =null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )


    LazyColumn {
        item(

        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(10.dp)
                    .padding(top = 10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally


            ){
                Spacer(modifier = Modifier.height(25.dp))
                Text(text = "CHOOSE YOUR PREFERRED CAR", fontSize = 20.sp, color = Color.White, fontFamily = FontFamily.Cursive)


                Spacer(modifier = Modifier.height(10.dp))


                Card(
                    colors = CardDefaults.cardColors(Color(0xff9da29b)),
                    elevation = CardDefaults.cardElevation(5.dp)

                ) {



                }
                Spacer(modifier = Modifier.height(10.dp))




                Text(
                    text = "Cars For Hire In Mombasa",
                    fontFamily = FontFamily.Default,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(5.dp),
                    textDecoration = TextDecoration.Underline
                )




                LazyRow{
                    item {
                        Card(onClick = { navController.navigate("https://backup.myhire.co.ke/car-hire/toyota-land-cruiser-prado-car-hire-in-mombasa/") }) {

                            Image(painter = painterResource(id = R.drawable.prado), contentDescription ="")
                            Text(text = "Toyota Land Cruiser", fontFamily = FontFamily.Default)


                        }


                        Spacer(modifier = Modifier.width(10.dp))
                        Card(onClick = { "https://backup.myhire.co.ke/car-hire/toyota-alphard-car-hire-mombasa/" }) {

                            Image(painter = painterResource(id = R.drawable.alphard), contentDescription ="")
                            Text(text = "Toyota Alphard", fontFamily = FontFamily.Default)

                        }


                        Spacer(modifier = Modifier.width(10.dp))
                        Card(onClick = { "https://backup.myhire.co.ke/car-hire/lexus-lx570-car-hire-mombasa/" }) {

                            Image(painter = painterResource(id = R.drawable.lexus), contentDescription ="")
                            Text(text = "Lexus LX570", fontFamily = FontFamily.Default)

                        }



                        Spacer(modifier = Modifier.width(10.dp))
                        Card(onClick = { "https://backup.myhire.co.ke/car-hire/2014-toyota-mark-x/" }) {

                            Image(painter = painterResource(id = R.drawable.markx), contentDescription ="")
                            Text(text = "Toyota Mark X", fontFamily = FontFamily.Default)

                        }


                        Spacer(modifier = Modifier.width(10.dp))
                        Card(onClick = { "https://backup.myhire.co.ke/car-hire/2014-nissan-tiida-latio/" }) {

                            Image(painter = painterResource(id = R.drawable.tiida), contentDescription ="")
                            Text(text = "Nissan Tiida Latio", fontFamily = FontFamily.Default)

                        }



                    }


                }

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Cars For Hire In Nairobi",
                    fontFamily = FontFamily.Default,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(5.dp),
                    textDecoration = TextDecoration.Underline
                )

                LazyRow(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    item {



                        Spacer(modifier = Modifier.width(10.dp))
                        Card(onClick = { "https://backup.myhire.co.ke/car-hire/2014-bmw-x6/" }) {

                            Image(painter = painterResource(id = R.drawable.bmw), contentDescription ="")
                            Text(text = "BMW X6", fontFamily = FontFamily.Default)

                        }


                        Spacer(modifier = Modifier.width(10.dp))
                        Card(onClick = { "https://backup.myhire.co.ke/car-hire/car-hire-toyota-harrier-8/" }) {

                            Image(painter = painterResource(id = R.drawable.harrier), contentDescription ="")
                            Text(text = "Toyota Harrier", fontFamily = FontFamily.Default)

                        }

                        Spacer(modifier = Modifier.width(10.dp))
                        Card(onClick = { "https://backup.myhire.co.ke/car-hire/car-hire-toyota-hilux-d-cab/" }) {

                            Image(painter = painterResource(id = R.drawable.hilux), contentDescription ="")
                            Text(text = "Toyota Hilux D-Cab", fontFamily = FontFamily.Default)

                        }


                        Spacer(modifier = Modifier.width(10.dp))
                        Card(onClick = { "https://backup.myhire.co.ke/car-hire/car-hire-toyota-landcruiser-prado-3/" }) {

                            Image(painter = painterResource(id = R.drawable.landcruiser), contentDescription ="")
                            Text(text = "Toyota Landcruiser Prado", fontFamily = FontFamily.Default)

                        }


                        Spacer(modifier = Modifier.width(10.dp))
                        Card(onClick = { "https://backup.myhire.co.ke/car-hire/car-hire-range-rover-sport/" }) {

                            Image(painter = painterResource(id = R.drawable.rangerover), contentDescription ="")
                            Text(text = "Range Rover Sport", fontFamily = FontFamily.Default)

                        }


                    }


                }

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Cars For Hire In Kisumu",
                    fontFamily = FontFamily.Default,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(5.dp),
                    textDecoration = TextDecoration.Underline
                )

                LazyRow {
                    item {
                        Card(onClick = { navController.navigate("https://backup.myhire.co.ke/car-hire/car-hire-toyota-fielder/") }) {

                            Image(painter = painterResource(id = R.drawable.fielder), contentDescription ="")
                            Text(text = "Toyota Corolla Fielder", fontFamily = FontFamily.Default)


                        }


                        Spacer(modifier = Modifier.width(5.dp))
                        Card(onClick = { "https://backup.myhire.co.ke/car-hire/car-hire-toyota-corolla-axio-4/" }) {

                            Image(painter = painterResource(id = R.drawable.axio), contentDescription ="")
                            Text(text = "Toyota Corolla Axio", fontFamily = FontFamily.Default)

                        }


                        Spacer(modifier = Modifier.width(10.dp))
                        Card(onClick = { "https://backup.myhire.co.ke/car-hire/car-hire-toyota-rav4-old-shape/" }) {

                            Image(painter = painterResource(id = R.drawable.rav), contentDescription ="")
                            Text(text = "Toyota Rav4", fontFamily = FontFamily.Default)

                        }


                        Spacer(modifier = Modifier.width(10.dp))
                        Card(onClick = { "https://backup.myhire.co.ke/car-hire/car-hire-toyota-landcruiser-prado-3/" }) {

                            Image(painter = painterResource(id = R.drawable.landcruise), contentDescription ="")
                            Text(text = "Toyota Landcruiser Prado", fontFamily = FontFamily.Default)

                        }

                        Spacer(modifier = Modifier.width(10.dp))
                        Card(onClick = { "https://backup.myhire.co.ke/car-hire/car-hire-mercedes-benz-c-200/" }) {

                            Image(painter = painterResource(id = R.drawable.benz), contentDescription ="")
                            Text(text = "Mercedes Benz C-200", fontFamily = FontFamily.Default)

                        }



                    }


                }





            }









            Spacer(modifier = Modifier.height(30.dp))








            Row(

                modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(
                    modifier = Modifier
                        .clickable {
                            navController.navigate(ROUTE_CONTACTS) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                    text = "Contact", color = Color.White, fontFamily = FontFamily.Cursive, fontSize = (30.sp)
                )

                Text(
                    modifier = Modifier

                        .clickable {
                            navController.navigate(ROUTE_REGISTER) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                    text = "Registration screen", color = Color.White, fontFamily = FontFamily.Cursive, fontSize = (30.sp)

                )





            }






        }
    }
}






















@Preview(showBackground = true, showSystemUi = true)
@Composable
        fun HomeScreenPreview() {
            HomeScreen(rememberNavController())
        }