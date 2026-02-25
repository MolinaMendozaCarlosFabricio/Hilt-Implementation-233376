package com.alilopez.kt_demohilt.features.news.presentation.di

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.alilopez.kt_demohilt.core.navigation.FeatureNavGraph
import com.alilopez.kt_demohilt.core.navigation.News
import com.alilopez.kt_demohilt.features.news.presentation.screens.NewsScreen

class NewsNavGraph: FeatureNavGraph {
    override fun registerGraph(navGraphBuilder: NavGraphBuilder, navController: NavHostController) {
        navGraphBuilder.composable<News> {
            NewsScreen()
        }
    }
}