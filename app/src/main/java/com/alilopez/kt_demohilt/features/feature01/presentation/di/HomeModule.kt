package com.alilopez.kt_demohilt.features.feature01.presentation.di

import com.alilopez.kt_demohilt.core.navigation.FeatureNavGraph
import com.alilopez.kt_demohilt.features.feature01.presentation.HomeNavGraph
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
object HomeModule {
    @Provides
    @IntoSet
    fun provideHomeNavGraph(): FeatureNavGraph = HomeNavGraph()
}