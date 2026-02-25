package com.alilopez.kt_demohilt.features.jsonplaceholder.presentation.di

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.alilopez.demo.features.jsonplaceholder.presentation.screens.PostsScreen
import com.alilopez.kt_demohilt.core.navigation.FeatureNavGraph
import com.alilopez.kt_demohilt.core.navigation.JsonPlaceHolder

class JsonPlaceHolderNavGraph: FeatureNavGraph {
    override fun registerGraph(navGraphBuilder: NavGraphBuilder, navController: NavHostController) {
        navGraphBuilder.composable<JsonPlaceHolder>{
            PostsScreen()
        }
    }
}