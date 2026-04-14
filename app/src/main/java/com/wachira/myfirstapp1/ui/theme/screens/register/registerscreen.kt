package com.wachira.myfirstapp1.ui.theme.screens.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wachira.myfirstapp1.navigation.ROUTE_LOGIN
import com.wachira.myfirstapp1.ui.theme.newred

@Composable
fun RegisterScreen(navController: NavHostController) {
    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)) {
        Card(elevation = CardDefaults.cardElevation(8.dp),
            modifier = Modifier
            .padding(8.dp)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(300.dp)
                    ) {
                Text(
                    "Register Here",
                    textAlign = TextAlign.Center,
                    fontSize = 35.sp,
                    fontFamily = FontFamily.Cursive
                )
                Spacer(modifier = Modifier.height(30.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Person Icon",
                            tint = Color.Black
                        )
                    },
                    label = {
                        Text(
                            "Enter First Name",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif,
                            color = newred,
                            modifier = Modifier
                                .width(300.dp)
                                .padding(4.dp)
                        )
                    })
                Spacer(modifier = Modifier.height(30.dp))

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Person Icon",
                            tint = Color.Black
                        )
                    },
                    label = {
                        Text(
                            "Enter Second Name",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif,
                            color = Color.Black,
                            modifier = Modifier
                                .width(300.dp)
                                .padding(4.dp)
                        )
                    })
                Spacer(modifier = Modifier.height(30.dp))

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "Email Icon",
                            tint = Color.Black
                        )
                    },
                    label = {
                        Text(
                            "Enter Email Address",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif,
                            color = Color.Black,
                            modifier = Modifier
                                .width(300.dp)
                                .padding(4.dp)
                        )
                    })
                Spacer(modifier = Modifier.height(30.dp))

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "Password Icon",
                            tint = Color.Black
                        )
                    },
                    label = {
                        Text(
                            "Enter Password",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif,
                            color = Color.Black,
                            modifier = Modifier
                                .width(300.dp)
                                .padding(4.dp)
                        )
                    })
                Spacer(modifier = Modifier.height(30.dp))

                Button(
                    onClick = {},
                    modifier = Modifier.width(300.dp)
                ) {
                    Text(
                        "Register here",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                }
                TextButton(
                    onClick = { navController.navigate(ROUTE_LOGIN) },
                    modifier = Modifier.width(300.dp)
                ) {
                    Text(
                        "Already have an account? Login here",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif
                    )
                }


            }
        }
    }

}




@Preview(showSystemUi = true)
@Composable
private fun RegisterPrev() {
    RegisterScreen(rememberNavController())
}
