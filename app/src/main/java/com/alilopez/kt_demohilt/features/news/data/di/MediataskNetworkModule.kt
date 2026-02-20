package com.alilopez.kt_demohilt.features.news.data.di

import com.alilopez.kt_demohilt.core.qualifiers.MediataskNetworkModule
import com.alilopez.kt_demohilt.features.news.data.datasources.remote.api.MediataskApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MediataskNetworkModule {
    @Provides
    @Singleton
    fun provideMediataskApi(@MediataskNetworkModule retrofit: Retrofit): MediataskApi{
        return retrofit.create(MediataskApi::class.java)
    }
}