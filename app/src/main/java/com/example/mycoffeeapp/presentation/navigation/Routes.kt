package com.example.mycoffeeapp.presentation.navigation

import kotlinx.serialization.Serializable

sealed class Routes {

     @Serializable
     object Welcome: Routes()

    @Serializable
    object HomeScreen: Routes()

    @Serializable
    data class Detailed(val productId: Int): Routes()

    @Serializable
    object  Cartscreen: Routes()
    @Serializable
    object  Favoritescreen: Routes()
    @Serializable
    object  Profilescreen: Routes()


}