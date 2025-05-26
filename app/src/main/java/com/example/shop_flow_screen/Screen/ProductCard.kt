package com.example.shop_flow_screen.Screen

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.ImageLoader
import coil.compose.AsyncImage
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import com.example.shop_flow_screen.Data.Product
import com.example.shop_flow_screen.R

@Composable
fun ProductCard(context: Context = LocalContext.current) {
    val imageLoader = ImageLoader.Builder(context)
        .components {
            add(SvgDecoder.Factory())
        }
        .build()

    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .fillMaxSize()

    ) {

        Box(modifier = Modifier.fillMaxSize()) {
            IconButton(
                onClick = { /* Toggle favorite */ },
                modifier = Modifier
                    .padding(5.dp)
                    .background(Color.Black, shape = CircleShape)
                    .size(40.dp),

                ) {
                Icon(
                    painter = painterResource(id = R.drawable.heart),
                    contentDescription = "Like",
                    tint = Color.Green
                )
            }
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(R.raw.product_bg_card)
                    .build(),
                imageLoader = imageLoader,
                contentDescription = null,
                modifier = Modifier.matchParentSize(),
                contentScale = ContentScale.Crop
            )

            Column(modifier = Modifier.fillMaxSize()) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp, end = 6.dp),
                    horizontalArrangement = Arrangement.End

                ) {

                    Text(
                        text = "Best seller",
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .background(Color(0xFF00C853), RoundedCornerShape(8.dp))
                            .padding(5.dp)
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))


                Image(
                    painter = painterResource(id = R.drawable.product_image),
                    contentDescription = "Product Image",
                    modifier = Modifier
                        .height(160.dp)
                        .align(Alignment.CenterHorizontally)
                        .clip(RoundedCornerShape(12.dp)),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.height(12.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(220.dp)
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(context)
                            .data(R.raw.product_title_card)
                            .build(),
                        contentDescription = null,
                        imageLoader = imageLoader,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .matchParentSize()
                            .clip(RoundedCornerShape(12.dp))
                    )

                    Box(
                        modifier = Modifier
                            .matchParentSize()
                            .background(Color.Black.copy(alpha = 0.4f))
                            .clip(RoundedCornerShape(12.dp))
                            .padding(16.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Text(
                                text = "clencera",
                                color = Color(0xFFB2FF59),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Spacer(modifier = Modifier.height(4.dp))

                            Text(
                                text = "French clay and algae-powered cleanser",
                                fontSize = 14.sp,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(4.dp))

                            Text(
                                text = "Skin Tightness • Dry & Dehydrated Skin",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(8.dp))


                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "Rs. 355.20",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFFB388FF)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = "Rs. 444.00",
                                    fontSize = 14.sp,
                                    color = Color.LightGray,
                                    textDecoration = TextDecoration.LineThrough
                                )
                            }

                            Spacer(modifier = Modifier.height(8.dp))



                            Row(verticalAlignment = Alignment.CenterVertically) {
                                repeat(4) {
                                    Icon(
                                        Icons.Filled.Star,
                                        contentDescription = "Star",
                                        tint = Color(0xFFFFC107)
                                    )
                                }
                                Icon(
                                    Icons.Filled.Star,
                                    contentDescription = "Half Star",
                                    tint = Color(0xFFFFC107)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "249 reviews",
                                    fontSize = 12.sp,
                                    color = Color.White
                                )
                            }

                            Spacer(modifier = Modifier.weight(1f))


                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.BottomEnd
                            ) {
                                IconButton(
                                    onClick = { /* Add to cart logic */ },
                                    modifier = Modifier
                                        .background(Color(0xFF00C853), CircleShape)
                                        .size(40.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.ShoppingCart,
                                        contentDescription = "Add to Cart",
                                        tint = Color.White
                                    )
                                }
                            }
                        }
                    }

                }
            }
        }
    }
    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .fillMaxSize()

    ) {

        Box(modifier = Modifier.fillMaxSize()) {
            IconButton(
                onClick = { /* Toggle favorite */ },
                modifier = Modifier
                    .padding(5.dp)
                    .background(Color.Black, shape = CircleShape)
                    .size(40.dp),

                ) {
                Icon(
                    painter = painterResource(id = R.drawable.heart),
                    contentDescription = "Like",
                    tint = Color.Green
                )
            }
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(R.raw.product_bg_card)
                    .build(),
                imageLoader = imageLoader,
                contentDescription = null,
                modifier = Modifier.matchParentSize(),
                contentScale = ContentScale.Crop
            )

            Column(modifier = Modifier.fillMaxSize()) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp, end = 6.dp),
                    horizontalArrangement = Arrangement.End

                ) {

                    Text(
                        text = "Best seller",
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .background(Color(0xFF00C853), RoundedCornerShape(8.dp))
                            .padding(5.dp)
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))


                Image(
                    painter = painterResource(id = R.drawable.product_image),
                    contentDescription = "Product Image",
                    modifier = Modifier
                        .height(160.dp)
                        .align(Alignment.CenterHorizontally)
                        .clip(RoundedCornerShape(12.dp)),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.height(12.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(220.dp)
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(context)
                            .data(R.raw.product_title_card)
                            .build(),
                        contentDescription = null,
                        imageLoader = imageLoader,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .matchParentSize()
                            .clip(RoundedCornerShape(12.dp))
                    )

                    Box(
                        modifier = Modifier
                            .matchParentSize()
                            .background(Color.Black.copy(alpha = 0.4f))
                            .clip(RoundedCornerShape(12.dp))
                            .padding(16.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Text(
                                text = "clencera",
                                color = Color(0xFFB2FF59),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Spacer(modifier = Modifier.height(4.dp))

                            Text(
                                text = "French clay and algae-powered cleanser",
                                fontSize = 14.sp,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(4.dp))

                            Text(
                                text = "Skin Tightness • Dry & Dehydrated Skin",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "Rs. 355.20",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFFB388FF)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = "Rs. 444.00",
                                    fontSize = 14.sp,
                                    color = Color.LightGray,
                                    textDecoration = TextDecoration.LineThrough
                                )
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                repeat(4) {
                                    Icon(
                                        Icons.Filled.Star,
                                        contentDescription = "Star",
                                        tint = Color(0xFFFFC107)
                                    )
                                }
                                Icon(
                                    Icons.Filled.Star,
                                    contentDescription = "Half Star",
                                    tint = Color(0xFFFFC107)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "249 reviews",
                                    fontSize = 12.sp,
                                    color = Color.White
                                )
                            }

                            Spacer(modifier = Modifier.weight(1f))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.BottomEnd
                            ) {
                                IconButton(
                                    onClick = { /* Add to cart logic */ },
                                    modifier = Modifier
                                        .background(Color(0xFF00C853), CircleShape)
                                        .size(40.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.ShoppingCart,
                                        contentDescription = "Add to Cart",
                                        tint = Color.White
                                    )
                                }
                            }
                        }
                    }

                }
            }
        }
    }
    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .fillMaxSize()

    ) {

        Box(modifier = Modifier.fillMaxSize()) {
            IconButton(
                onClick = {  },
                modifier = Modifier
                    .padding(5.dp)
                    .background(Color.Black, shape = CircleShape)
                    .size(40.dp),

                ) {
                Icon(
                    painter = painterResource(id = R.drawable.heart),
                    contentDescription = "Like",
                    tint = Color.Green
                )
            }
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(R.raw.product_bg_card)
                    .build(),
                imageLoader = imageLoader,
                contentDescription = null,
                modifier = Modifier.matchParentSize(),
                contentScale = ContentScale.Crop
            )

            Column(modifier = Modifier.fillMaxSize()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp, end = 6.dp),
                    horizontalArrangement = Arrangement.End

                ) {

                    Text(
                        text = "Best seller",
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .background(Color(0xFF00C853), RoundedCornerShape(8.dp))
                            .padding(5.dp)
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Image(
                    painter = painterResource(id = R.drawable.product_image),
                    contentDescription = "Product Image",
                    modifier = Modifier
                        .height(160.dp)
                        .align(Alignment.CenterHorizontally)
                        .clip(RoundedCornerShape(12.dp)),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.height(12.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(220.dp)
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(context)
                            .data(R.raw.product_title_card)
                            .build(),
                        contentDescription = null,
                        imageLoader = imageLoader,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .matchParentSize()
                            .clip(RoundedCornerShape(12.dp))
                    )

                    Box(
                        modifier = Modifier
                            .matchParentSize()
                            .background(Color.Black.copy(alpha = 0.4f))
                            .clip(RoundedCornerShape(12.dp))
                            .padding(16.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Text(
                                text = "clencera",
                                color = Color(0xFFB2FF59),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Spacer(modifier = Modifier.height(4.dp))

                            Text(
                                text = "French clay and algae-powered cleanser",
                                fontSize = 14.sp,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(4.dp))

                            Text(
                                text = "Skin Tightness • Dry & Dehydrated Skin",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "Rs. 355.20",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFFB388FF)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = "Rs. 444.00",
                                    fontSize = 14.sp,
                                    color = Color.LightGray,
                                    textDecoration = TextDecoration.LineThrough
                                )
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                repeat(4) {
                                    Icon(
                                        Icons.Filled.Star,
                                        contentDescription = "Star",
                                        tint = Color(0xFFFFC107)
                                    )
                                }
                                Icon(
                                    Icons.Filled.Star,
                                    contentDescription = "Half Star",
                                    tint = Color(0xFFFFC107)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "249 reviews",
                                    fontSize = 12.sp,
                                    color = Color.White
                                )
                            }

                            Spacer(modifier = Modifier.weight(1f))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.BottomEnd
                            ) {
                                IconButton(
                                    onClick = { /* Add to cart logic */ },
                                    modifier = Modifier
                                        .background(Color(0xFF00C853), CircleShape)
                                        .size(40.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.ShoppingCart,
                                        contentDescription = "Add to Cart",
                                        tint = Color.White
                                    )
                                }
                            }
                        }
                    }

                }
            }
        }
    }
    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .fillMaxSize()

    ) {

        Box(modifier = Modifier.fillMaxSize()) {
            IconButton(
                onClick = { /* Toggle favorite */ },
                modifier = Modifier
                    .padding(5.dp)
                    .background(Color.Black, shape = CircleShape)
                    .size(40.dp),

                ) {
                Icon(
                    painter = painterResource(id = R.drawable.heart),
                    contentDescription = "Like",
                    tint = Color.Green
                )
            }
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(R.raw.product_bg_card)
                    .build(),
                imageLoader = imageLoader,
                contentDescription = null,
                modifier = Modifier.matchParentSize(),
                contentScale = ContentScale.Crop
            )

            Column(modifier = Modifier.fillMaxSize()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp, end = 6.dp),
                    horizontalArrangement = Arrangement.End

                ) {

                    Text(
                        text = "Best seller",
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .background(Color(0xFF00C853), RoundedCornerShape(8.dp))
                            .padding(5.dp)
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Image(
                    painter = painterResource(id = R.drawable.product_image),
                    contentDescription = "Product Image",
                    modifier = Modifier
                        .height(160.dp)
                        .align(Alignment.CenterHorizontally)
                        .clip(RoundedCornerShape(12.dp)),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.height(12.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(220.dp)
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(context)
                            .data(R.raw.product_title_card)
                            .build(),
                        contentDescription = null,
                        imageLoader = imageLoader,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .matchParentSize()
                            .clip(RoundedCornerShape(12.dp))
                    )

                    Box(
                        modifier = Modifier
                            .matchParentSize()
                            .background(Color.Black.copy(alpha = 0.4f))
                            .clip(RoundedCornerShape(12.dp))
                            .padding(16.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Text(
                                text = "clencera",
                                color = Color(0xFFB2FF59),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Spacer(modifier = Modifier.height(4.dp))

                            Text(
                                text = "French clay and algae-powered cleanser",
                                fontSize = 14.sp,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(4.dp))

                            Text(
                                text = "Skin Tightness • Dry & Dehydrated Skin",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "Rs. 355.20",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFFB388FF)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = "Rs. 444.00",
                                    fontSize = 14.sp,
                                    color = Color.LightGray,
                                    textDecoration = TextDecoration.LineThrough
                                )
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                repeat(4) {
                                    Icon(
                                        Icons.Filled.Star,
                                        contentDescription = "Star",
                                        tint = Color(0xFFFFC107)
                                    )
                                }
                                Icon(
                                    Icons.Filled.Star,
                                    contentDescription = "Half Star",
                                    tint = Color(0xFFFFC107)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "249 reviews",
                                    fontSize = 12.sp,
                                    color = Color.White
                                )
                            }

                            Spacer(modifier = Modifier.weight(1f))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.BottomEnd
                            ) {
                                IconButton(
                                    onClick = { /* Add to cart logic */ },
                                    modifier = Modifier
                                        .background(Color(0xFF00C853), CircleShape)
                                        .size(40.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.ShoppingCart,
                                        contentDescription = "Add to Cart",
                                        tint = Color.White
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}