package com.alilopez.kt_demohilt.features.news.data.datasources.remote.api

import com.alilopez.kt_demohilt.features.news.data.datasources.remote.models.GetResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MediataskApi {
    @GET("news")
    suspend fun getHappyNews(
        @Query("keywords") query: String,
        @Query("languages") lang: String,
        @Query("limit") max: Int,
        @Query("access_key") apiKey: String
    ): GetResponse
}