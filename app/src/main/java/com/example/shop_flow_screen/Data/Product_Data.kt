package com.example.shop_flow_screen.Data

data class Product(
    val name: String,
    val description: String,
    val price: String,
    val originalPrice: String,
    val rating: Float,
    val reviewCount: Int,
    val imageRes: Int,
    val isInStock: Boolean
)

data class Category(
    val name : String,
    val iconRes: Int
)