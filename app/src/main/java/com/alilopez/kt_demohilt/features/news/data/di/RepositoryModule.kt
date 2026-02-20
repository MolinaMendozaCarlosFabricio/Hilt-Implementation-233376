package com.alilopez.kt_demohilt.features.news.data.di

import com.alilopez.kt_demohilt.features.news.data.repositories.NewsRepositoryImpl
import com.alilopez.kt_demohilt.features.news.domain.repositories.NewsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindNewsRepository(newsRepositoryImpl: NewsRepositoryImpl): NewsRepository
}