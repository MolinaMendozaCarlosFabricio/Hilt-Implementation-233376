package com.alilopez.kt_demohilt.features.news.data.repositories

import com.alilopez.kt_demohilt.features.news.data.datasources.remote.api.MediataskApi
import com.alilopez.kt_demohilt.features.news.data.datasources.remote.mapper.toDomain
import com.alilopez.kt_demohilt.features.news.domain.entities.News
import com.alilopez.kt_demohilt.features.news.domain.repositories.NewsRepository
import com.alilopez.kt_demohilt.BuildConfig
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor (
    private val api: MediataskApi
): NewsRepository {
    override suspend fun getHappyNews(): List<News> {
        val response = api.getHappyNews(
            query = "good",
            lang = "en",
            max = 10,
            apiKey = BuildConfig.MEDIATASK_API_KEY
        )
        return response.data.map { it.toDomain() }
    }
}