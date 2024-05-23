package com.dnzk.leap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.dnzk.leap.ui.screens.AuthScreen
import com.dnzk.leap.ui.theme.LeapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LeapTheme {
                AuthScreen()
            }
        }
    }
}
