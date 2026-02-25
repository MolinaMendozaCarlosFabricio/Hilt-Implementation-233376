package com.alilopez.kt_demohilt.features.news.presentation.di

import com.alilopez.kt_demohilt.core.navigation.FeatureNavGraph
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
object NewsModule {
    @Provides
    @IntoSet
    fun provideNewsNavGraph(): FeatureNavGraph = NewsNavGraph()
}