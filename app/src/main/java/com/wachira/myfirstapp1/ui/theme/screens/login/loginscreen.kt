package com.wachira.myfirstapp1.ui.theme.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wachira.myfirstapp1.navigation.ROUTE_REGISTER

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Loginscreen(navController: NavHostController) {
    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)) {

        TopAppBar(title = {Text("Home Section ",
            fontFamily = FontFamily.Cursive,
            fontSize = 35.sp)},
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription = "menu")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(Icons.Default.Search,
                        contentDescription = "Search")
                }
                IconButton(onClick = {}) {
                    Icon(Icons.Default.Settings,
                        contentDescription = "Setting")
                }

            },

            )

        Text("Log In",
            fontSize = 35.sp,
            fontFamily = FontFamily.Cursive)
        OutlinedTextField(value = "",
            onValueChange = {},
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email,
                    contentDescription = "Email Icon")
            },
            label = {Text("Enter Email Address",
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black,
                modifier = Modifier
                    .width(300.dp)
                    .padding(4.dp))})
        OutlinedTextField(value = "",
            onValueChange = {},
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock,
                    contentDescription = "Password Icon")
            },
            label = {Text("Enter Password",
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black,
                modifier = Modifier
                    .width(300.dp)
                    .padding(4.dp))})

        Button(onClick = {},
            modifier = Modifier.width(300.dp)) {
            Text("Log In here",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif)
        }
        TextButton(onClick = {navController.navigate(ROUTE_REGISTER)},
            modifier = Modifier.width(300.dp)) {
            Text("Don't have an account? Register here",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif)
        }

    }


}

@Preview(showSystemUi = true)
@Composable
private fun LoginPrev() {
    Loginscreen(rememberNavController())
    
}