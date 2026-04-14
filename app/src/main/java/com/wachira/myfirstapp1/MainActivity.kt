package com.wachira.myfirstapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.wachira.myfirstapp1.navigation.AppNavHost
import com.wachira.myfirstapp1.ui.theme.Myfirstapp1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Myfirstapp1Theme {
                AppNavHost()
            }
        }
    }
}
