package com.wachira.myfirstapp1.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.calcintent.Calc
import com.example.calcintent.Intent
import com.wachira.myfirstapp1.ui.theme.screens.cards_boxes.Caoxscreen
import com.wachira.myfirstapp1.ui.theme.screens.home.HomeScreen
import com.wachira.myfirstapp1.ui.theme.screens.login.Loginscreen
import com.wachira.myfirstapp1.ui.theme.screens.register.RegisterScreen
import com.wachira.myfirstapp1.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH
) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_LOGIN) {
            Loginscreen(navController)
        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }
        composable(ROUTE_INTENT) {
            Intent()
        }
        composable(ROUTE_CALCULATOR) {
            Calc()
        }
        composable(ROUTE_CAOX) {
            Caoxscreen()
        }
        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }


    }
}
