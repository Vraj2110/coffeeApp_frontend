package com.example.mycoffeeapp.presentation.screens.detailsscreen

import android.graphics.drawable.Icon
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycoffeeapp.domain.model.Product
import com.example.mycoffeeapp.R
import androidx.compose.material3.Icon
import com.example.mycoffeeapp.presentation.theme.IvoryWhite


@Composable
fun ProductDetailsContent(product: Product, innerPadding: PaddingValues) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(paddingValues = innerPadding)
    ) { }

    Image(
        painter = painterResource(product.imageRes),
        contentDescription = "Product Image",
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .clip(RoundedCornerShape(16.dp)),
        contentScale = ContentScale.Crop
    )

    Spacer(modifier = Modifier.height(12.dp))

    Text(
        text = product.name,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
    Spacer(modifier = Modifier.height(12.dp))

    Row() {
        Text(
            text = "Ice/Hot"
        )
        Icon(
            painter = painterResource(R.drawable.default_bean),
            contentDescription = "Bean",
            modifier = Modifier
                .background(
                    color = IvoryWhite,
                    shape = RoundedCornerShape(10.dp)
                )
                .size(36.dp)
                .padding(6.dp)
        )
    }
}