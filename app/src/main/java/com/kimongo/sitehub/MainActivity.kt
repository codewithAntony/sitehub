package com.kimongo.sitehub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.kimongo.sitehub.navigation.AppNavigation
import com.kimongo.sitehub.ui.theme.SitehubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SitehubTheme {
                AppNavigation()
            }
        }
    }
}



