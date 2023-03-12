package com.example.session2_navigations.navigations

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.session2_navigations.screens.DetailScreen
import com.example.session2_navigations.screens.HomeScreen
import com.example.session2_navigations.screens.RateScreen


@Composable
fun NavigationGraph(navController: NavHostController) {

    NavHost(
        navController=navController,
        startDestination = Screen.HomeScreen.route

    )
    {
       composable(route = Screen.HomeScreen.route){
           HomeScreen(navController = navController)
       }
        composable(
            route=Screen.DetailScreen.route
//            arguments= listOf(
//                navArgument(name=Id){
//                    type= NavType.IntType
//                    defaultValue=-1
//                }
//            )
        ){
            DetailScreen(
                navController = navController
//                id= it.arguments?.getInt(Id) ?:-1
            )
        }
        composable(
            route=Screen.RatingScreen.route,
            arguments = listOf(
                navArgument(name=Id){
                    type= NavType.FloatType
                    defaultValue=-1f
                }
            )
        ){
            RateScreen(
                navController =navController,
                id =it.arguments?.getFloat(Id) ?:-1f,
                 )
        }
    }
}