package com.yasinmaden.odev3.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.yasinmaden.odev3.ui.screens.HomeScreen
import com.yasinmaden.odev3.ui.screens.LoginScreen


@Composable
fun NavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = Destinations.Login.route){
        composable(Destinations.Home.route){
            HomeScreen()
        }
        composable(Destinations.Login.route){
            LoginScreen()
        }
    }
}