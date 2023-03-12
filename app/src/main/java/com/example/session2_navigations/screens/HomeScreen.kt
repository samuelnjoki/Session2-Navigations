package com.example.session2_navigations.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.session2_navigations.navigations.Screen


@Composable
fun HomeScreen(
    navController: NavController
) {
    Scaffold(

        topBar = {

            TopAppBar(
                title = {
                    Text(text = "Home Screen")
                }
            )

        }

    )
    {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Button(onClick = {

                navController.navigate(Screen.DetailScreen.route)

            }) {
                Text(
                    text = "Go To Detail Screen"
                )
            }
        }
    }

}



