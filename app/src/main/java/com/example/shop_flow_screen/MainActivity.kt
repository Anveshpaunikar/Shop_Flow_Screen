package com.example.shop_flow_screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.shop_flow_screen.Screen.ShopScreen
import com.example.shop_flow_screen.ui.theme.Shop_Flow_ScreenTheme

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Shop_Flow_ScreenTheme {
                    ShopScreen()
            }
        }
    }
}


