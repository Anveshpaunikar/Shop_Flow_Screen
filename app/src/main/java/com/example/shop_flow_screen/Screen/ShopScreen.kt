package com.example.shop_flow_screen.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.WatchEvent

@Composable
fun ShopScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF3F3E3E))
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
            .padding(top = 25.dp)
    ) {
        TopBar()
        Spacer(modifier = Modifier.height(20.dp))
        PromoBanner()
        Spacer(Modifier.height(16.dp))
        CategoriesSection()
        Spacer(Modifier.height(16.dp))
        Text("New products", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(8.dp))
        ProductCard()
        Spacer(Modifier.height(16.dp))
        }
    }


