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
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import androidx.core.text.buildSpannedString
import coil.ImageLoader
import coil.compose.AsyncImage
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import com.example.shop_flow_screen.R

@Composable
fun ProductCard(context: Context = LocalContext.current) {
    val imageLoader = ImageLoader.Builder(context)
        .components {
            add(SvgDecoder.Factory())
        }
        .build()


Column {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("New products", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text("See all", color = Color.White, fontSize = 14.sp, textDecoration = TextDecoration.Underline)
    }
}

    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()

    ) {
        Box(
            modifier = Modifier.wrapContentSize()
                .background(Color(0xFF3F3E3E))
        ) {
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(R.raw.product_bg_card)
                    .build(),
                imageLoader = imageLoader,
                contentDescription = null,

            )
            IconButton(
                onClick = { },
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
            Box(modifier = Modifier.padding(top = 15.dp, end = 15.dp).align(Alignment.TopEnd)) {
                Text(
                    text = "Best seller",
                    color = Color.Green,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .wrapContentSize()
                        .background(Color(0xFF0D0E0E), RoundedCornerShape(10.dp))
                        .padding(10.dp)
                        .align(Alignment.TopEnd)
                )
                Column (modifier = Modifier.fillMaxSize()){
                    Box(modifier = Modifier.fillMaxSize().padding(top = 20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.product_image),
                            contentDescription = "Product Image",
                            modifier = Modifier
                                .wrapContentSize()
                                .height(200.dp)
                                .width(500.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .align(Alignment.TopCenter),

                            )
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Box(modifier = Modifier.padding(5.dp)
                    ) {
                        AsyncImage(
                            model = ImageRequest.Builder(context)
                                .data(R.raw.product_title_card)
                                .build(),
                            contentDescription = null,
                            imageLoader = imageLoader,
                            modifier = Modifier
                                .clipToBounds()
                                .clip(shape = RoundedCornerShape(20.dp))
                                .fillMaxWidth()
                                .padding(top = 12.dp)
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(10.dp)
                        ) {
                            Text(modifier = Modifier.padding(top = 10.dp),
                                text = "clencera",
                                color = Color(0xFFB2FF59),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                            )
                            Spacer(modifier = Modifier.height(2.dp))

                            Text(
                                text = "French clay and algae-powered cleanser",
                                fontSize = 12.sp,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(2.dp))

                            Text(
                                text = "Skin Tightness • Dry & Dehydrated Skin",
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = Color.White
                            )
                            Spacer(modifier = Modifier.height(2.dp))

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "Rs. 355.20",
                                    fontSize = 14.sp,
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

                            Spacer(modifier = Modifier.height(2.dp))

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
                        }
                                IconButton(
                                    onClick = { },
                                    modifier = Modifier
                                        .background(Color(0xFF00C853), CircleShape)
                                        .align(Alignment.BottomEnd)

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



    Card(
        modifier = Modifier
            .padding(5.dp)
            .wrapContentSize()
            .wrapContentHeight()


    ) {
        Box(
            modifier = Modifier.fillMaxSize()
                .background(Color(0xFF3F3E3E))
        ) {
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(R.raw.product_bg_card)
                    .build(),
                imageLoader = imageLoader,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
            )
            IconButton(
                onClick = { },
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
            Box(modifier = Modifier.padding(top = 15.dp, end = 15.dp).align(Alignment.TopEnd)) {
                Text(
                    text = "Best seller",
                    color = Color.Green,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .wrapContentSize()
                        .background(Color(0xFF0D0E0E), RoundedCornerShape(10.dp))
                        .padding(10.dp)
                        .align(Alignment.TopEnd)
                )
                Column (modifier = Modifier.fillMaxSize()){
                    Box(modifier = Modifier.fillMaxSize().padding(top = 20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.product_image),
                            contentDescription = "Product Image",
                            modifier = Modifier
                                .wrapContentSize()
                                .height(200.dp)
                                .width(500.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .align(Alignment.TopCenter),

                            )
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Box(modifier = Modifier.padding(5.dp)
                    ) {
                        AsyncImage(
                            model = ImageRequest.Builder(context)
                                .data(R.raw.product_title_card)
                                .build(),
                            contentDescription = null,
                            imageLoader = imageLoader,
                            modifier = Modifier
                                .clipToBounds()
                                .clip(shape = RoundedCornerShape(20.dp))
                                .fillMaxWidth()
                                .padding(top = 12.dp)
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(10.dp)
                        ) {
                            Text(modifier = Modifier.padding(top = 10.dp),
                                text = "clencera",
                                color = Color(0xFFB2FF59),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                            )
                            Spacer(modifier = Modifier.height(2.dp))

                            Text(
                                text = "French clay and algae-powered cleanser",
                                fontSize = 12.sp,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(2.dp))

                            Text(
                                text = "Skin Tightness • Dry & Dehydrated Skin",
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = Color.White
                            )
                            Spacer(modifier = Modifier.height(2.dp))

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "Rs. 355.20",
                                    fontSize = 14.sp,
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

                            Spacer(modifier = Modifier.height(2.dp))

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
                        }
                        IconButton(
                            onClick = { },
                            modifier = Modifier
                                .background(Color(0xFF00C853), CircleShape)
                                .align(Alignment.BottomEnd)

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
    Card(
        modifier = Modifier
            .padding(5.dp)
            .wrapContentSize()
            .wrapContentHeight()


    ) {
        Box(
            modifier = Modifier.fillMaxSize()
                .background(Color(0xFF3F3E3E))
        ) {
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(R.raw.product_bg_card)
                    .build(),
                imageLoader = imageLoader,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
            )
            IconButton(
                onClick = { },
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
            Box(modifier = Modifier.padding(top = 15.dp, end = 15.dp).align(Alignment.TopEnd)) {
                Text(
                    text = "Best seller",
                    color = Color.Green,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .wrapContentSize()
                        .background(Color(0xFF0D0E0E), RoundedCornerShape(10.dp))
                        .padding(10.dp)
                        .align(Alignment.TopEnd)
                )
                Column (modifier = Modifier.fillMaxSize()){
                    Box(modifier = Modifier.fillMaxSize().padding(top = 20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.product_image),
                            contentDescription = "Product Image",
                            modifier = Modifier
                                .wrapContentSize()
                                .height(200.dp)
                                .width(500.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .align(Alignment.TopCenter),

                            )
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Box(modifier = Modifier.padding(5.dp)
                    ) {
                        AsyncImage(
                            model = ImageRequest.Builder(context)
                                .data(R.raw.product_title_card)
                                .build(),
                            contentDescription = null,
                            imageLoader = imageLoader,
                            modifier = Modifier
                                .clipToBounds()
                                .clip(shape = RoundedCornerShape(20.dp))
                                .fillMaxWidth()
                                .padding(top = 12.dp)
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(10.dp)
                        ) {
                            Text(modifier = Modifier.padding(top = 10.dp),
                                text = "clencera",
                                color = Color(0xFFB2FF59),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                            )
                            Spacer(modifier = Modifier.height(2.dp))

                            Text(
                                text = "French clay and algae-powered cleanser",
                                fontSize = 12.sp,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(2.dp))

                            Text(
                                text = "Skin Tightness • Dry & Dehydrated Skin",
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = Color.White
                            )
                            Spacer(modifier = Modifier.height(2.dp))

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "Rs. 355.20",
                                    fontSize = 14.sp,
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

                            Spacer(modifier = Modifier.height(2.dp))

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
                        }
                        IconButton(
                            onClick = { },
                            modifier = Modifier
                                .background(Color(0xFF00C853), CircleShape)
                                .align(Alignment.BottomEnd)

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