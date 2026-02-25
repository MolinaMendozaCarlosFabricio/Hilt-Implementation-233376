package com.alilopez.kt_demohilt.features.feature01.presentation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.alilopez.kt_demohilt.core.navigation.FeatureNavGraph
import com.alilopez.kt_demohilt.core.navigation.Home
import com.alilopez.kt_demohilt.core.navigation.JsonPlaceHolder
import com.alilopez.kt_demohilt.core.navigation.News

class HomeNavGraph: FeatureNavGraph {
    override fun registerGraph(navGraphBuilder: NavGraphBuilder, navController: NavHostController) {
        navGraphBuilder.composable<Home>{
            HomeScreen(
                onClickJson = { navController.navigate(JsonPlaceHolder) },
                onClickMediatastk = { navController.navigate(News) }
            )
        }
    }
}