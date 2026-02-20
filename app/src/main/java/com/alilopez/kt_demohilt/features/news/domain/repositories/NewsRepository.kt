package com.alilopez.kt_demohilt.features.news.domain.repositories

import com.alilopez.kt_demohilt.features.news.domain.entities.News

interface NewsRepository {
    suspend fun getHappyNews(): List<News>
}