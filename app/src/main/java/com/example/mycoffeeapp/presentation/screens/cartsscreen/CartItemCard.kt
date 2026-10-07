package com.example.mycoffeeapp.presentation.screens.cartsscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycoffeeapp.R

@Preview
@Composable
fun CartItemCard() {

    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)) {
            Image(
                painter = painterResource(R.drawable.coffee_3),
                contentDescription = "Coffee Image",
                modifier = Modifier
                    .size(70.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
            )

            Column() {
                Text("Coffe Name")
            }
        }
    }

}