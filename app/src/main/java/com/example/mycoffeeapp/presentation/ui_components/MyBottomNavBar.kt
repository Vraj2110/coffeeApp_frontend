package com.example.mycoffeeapp.presentation.ui_components

import android.net.http.SslCertificate.saveState
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mycoffeeapp.R
import com.example.mycoffeeapp.presentation.navigation.Routes
import com.example.mycoffeeapp.presentation.theme.LightBrown


@Composable
fun MyBotoomNavBar(navController: NavController, routes: Routes) {

    //Bottomnav items
    val navItems = listOf(
        NavItem("Home", R.drawable.regular_outline_home, Routes.HomeScreen),
        NavItem("Cart", R.drawable.regular_outline_bag, Routes.Cartscreen),
        NavItem("Favourites", R.drawable.regular_outline_heart, Routes.Favoritescreen),
        NavItem("Profile", R.drawable.outline_account_circle_24, Routes.Profilescreen)
    )


    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(100.dp)
    ) {

        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = item.title
                    )
                },
                label = { Text(item.title) },
                modifier = Modifier.size(30.dp),
                //handling bottom navbar
                onClick = {
                    navController.navigate(item.routes) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                          },
                selected = item.routes == routes,
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = LightBrown,
                    selectedTextColor = LightBrown,
                    unselectedIconColor = Color.DarkGray,
                    unselectedTextColor = Color.DarkGray,
                    indicatorColor = LightBrown.copy(alpha = 0.03f)
                )
            )
        }
    }
}

data class NavItem(
    val title: String,
    val icon: Int,
    val routes: Routes
)