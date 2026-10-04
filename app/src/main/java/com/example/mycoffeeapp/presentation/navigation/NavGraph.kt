package com.example.mycoffeeapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.mycoffeeapp.presentation.screens.detailsscreen.DetailScreen
import com.example.mycoffeeapp.presentation.screens.homescreen.HomeScreen
import com.example.mycoffeeapp.presentation.screens.welcomescreen.WelcomeScreen
import kotlinx.serialization.Serializable

@Preview
@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Welcome) {

        composable<Routes.Welcome> { WelcomeScreen(navController) }

        composable<Routes.HomeScreen> { HomeScreen(navController) }

        composable<Routes.Detailed> {
            backStackEntry->

            val args = backStackEntry.toRoute<Routes.Detailed>()
            DetailScreen(productId = args.productId,navController)
        }

    }
}



