package com.wachira.myfirstapp1.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.wachira.myfirstapp1.R
import com.wachira.myfirstapp1.navigation.ROUTE_CALCULATOR
import com.wachira.myfirstapp1.navigation.ROUTE_INTENT
import com.wachira.myfirstapp1.navigation.ROUTE_LOGIN
import com.wachira.myfirstapp1.navigation.ROUTE_REGISTER

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Column(verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(3.dp)
    ) {
//        start of topappbar
        TopAppBar(title = {Text("Home Page",
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
        Text("Ajira",
            color = Color.Black,
            fontSize = 35.sp,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text("Welcome to Ajira App",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black
        )
        Image(painter = painterResource(id = R.drawable.wachira),
            contentDescription = "Ajira",
            modifier = Modifier.width(300.dp)
        )
        Button(onClick = { navController.navigate(ROUTE_REGISTER) },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp)
        ) {
            Text("Register Here")
        }

        Button(onClick = { navController.navigate(ROUTE_LOGIN) },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp)
        ) {
            Text("Log In")
        }
        Button(onClick = {navController.navigate(ROUTE_INTENT)},
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp)
        ) {
            Text("Intent")
        }
        Button(onClick = {navController.navigate(ROUTE_CALCULATOR)},
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp)
        ) {
            Text("Calculator")
        }

    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomePrev() {
    HomeScreen(rememberNavController())
}
