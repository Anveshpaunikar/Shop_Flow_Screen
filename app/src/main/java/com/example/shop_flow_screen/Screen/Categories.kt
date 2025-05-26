package com.example.shop_flow_screen.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shop_flow_screen.Data.Category
import com.example.shop_flow_screen.R


@Composable
fun CategoriesSection() {
    val categories = listOf(
        Category("Cleaners", R.drawable.categorysample),
        Category("Toner", R.drawable.categorysample),
        Category("Serums", R.drawable.categorysample),
        Category("Moisturisers", R.drawable.categorysample),
        Category("Cleaners", R.drawable.categorysample),
        Category("Toner", R.drawable.categorysample),
        Category("Serums", R.drawable.categorysample),
        Category("Moisturisers", R.drawable.categorysample)
    )
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Categories", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Text("See all", color = Color.White, fontSize = 14.sp, textDecoration = TextDecoration.Underline)
        }
        Spacer(Modifier.height(15.dp))
        LazyRow {
            items(categories) { category ->
                Column(
                    modifier = Modifier.padding(horizontal = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = category.iconRes),
                        contentDescription = category.name,
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape)
                            .background(Color.Black)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = category.name)
                }
            }
        }
    }
}

