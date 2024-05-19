package com.example.carrental.ui.theme.screens.login

import android.view.Gravity
import androidx.annotation.GravityInt
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField

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
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.carrental.R
import com.example.carrental.data.AuthViewModel
import com.example.carrental.navigation.ROUTE_HOME
//import com.example.firebaseauth.data.AuthViewModel
//import com.example.firebaseauth.navigation.ROUTE_HOME
//import com.example.firebaseauth.navigation.ROUTE_REGISTER
import com.example.carrental.navigation.ROUTE_REGISTER

@Composable
fun LoginScreen(navController: NavController){
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    var context= LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(60.dp))
        Image(painter = painterResource(id = R.drawable.chola),
            contentDescription = "logo",
            modifier = Modifier
                .height(150.dp)
                .width(150.dp),)
//        Text(text = "HELLO THERE, WELCOME BACK",
//            color = Color.Black,
//            fontFamily = FontFamily.SansSerif,
//            fontSize = 30.sp,)
        Text(text = "Login",
            color = Color.Black,
            fontFamily = FontFamily.Default,
            fontSize = 20.sp,)
//        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(value =email , onValueChange = {email=it},
            label = { Text(text = "Enter Email", color = Color.Black) },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),

            )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value =pass , onValueChange = {pass=it},
            label = { Text(text = "Enter Password", color = Color.Black) },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

//        Button(onClick = {
//            val mylogin= AuthViewModel(navController, context )
//            mylogin.login(email.text.trim(),pass.text.trim())
//        }, modifier = Modifier.fillMaxWidth()) {
//            Text(text = "Log In")
//        }
        Button(onClick = {
            val mylogin= AuthViewModel(navController, context)
            mylogin.login(
                email.text.trim(),
                pass.text.trim()
            )
            navController.navigate(ROUTE_HOME)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Log In ")
        }
        Spacer(modifier = Modifier.height(5.dp))

       Button(onClick = {
            navController.navigate(ROUTE_REGISTER)
        }, colors = ButtonDefaults.buttonColors(Color.Transparent),
           modifier = Modifier.fillMaxWidth()) {
            Text(text = "Don't have account? Click to Register",color = Color.Black)

        }

    }

}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}