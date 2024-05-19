package com.example.carrental.ui.theme.screens.contacts

import com.example.carrental.navigation.ROUTE_HOME
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.carrental.R
import com.example.carrental.navigation.ROUTE_CONTACTS


@Composable
fun ContactScreen(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize())

    Image(painter = painterResource(id = R.drawable.chola), contentDescription =null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Spacer(modifier = Modifier.height(35.dp))
        Text(text = "This is the contact screen", color = Color.Black, fontFamily = FontFamily.Cursive, fontWeight = FontWeight.Bold  , fontSize = (25.sp))
        Spacer(modifier = Modifier.height(7.dp))
        Text(text = "Contact us through our Email address (dknights254@gmail.com)",color = Color.Black)
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Or call our hotline number 071111111112",color = Color.Black)
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Address: 123 Main Street, Cityville, State, ZIP code",color = Color.Black)
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Store Hours: Monday-Friday: 9:00am-8:00pm,Saturday: 10:00 am-6:00pm",color = Color.Black)
        Spacer(modifier = Modifier.height(80.dp))
        Text(text = "Social Media Handles:",color = Color.Black)
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Twitter: @d_knights254",color = Color.Black)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Facebook: @d_knights254",color = Color.Black)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Instagram: @d_knights254",color = Color.Black)


        Text(
            modifier = Modifier
                .padding(70.dp)

                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_CONTACTS) { inclusive = true }
                    }
                },
            text = "Back to homepage", color = Color.Black, fontFamily = FontFamily.Cursive, fontSize = (30.sp)
        )







    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ContactScreen(rememberNavController())
}