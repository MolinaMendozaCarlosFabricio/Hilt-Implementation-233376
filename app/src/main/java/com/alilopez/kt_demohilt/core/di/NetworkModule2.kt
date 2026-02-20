package com.alilopez.kt_demohilt.core.di

import com.alilopez.kt_demohilt.core.qualifiers.MediataskNetworkModule
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule2 {
    @Provides
    @Singleton
    @MediataskNetworkModule
    fun provideRetrofit2(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.mediastack.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}