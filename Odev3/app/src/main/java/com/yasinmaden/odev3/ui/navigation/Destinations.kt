package com.yasinmaden.odev3.ui.navigation

sealed class Destinations(val route: String) {
    data object Home : Destinations("home")
    data object Login : Destinations("login")
}