package com.alilopez.kt_demohilt.features.news.domain.usecases

import com.alilopez.kt_demohilt.features.news.domain.entities.News
import com.alilopez.kt_demohilt.features.news.domain.repositories.NewsRepository
import javax.inject.Inject

class GetHappyNewsUseCase @Inject constructor (
    private val repo: NewsRepository
) {
    suspend operator fun invoke(): Result<List<News>> {
        return try {
            val news = repo.getHappyNews()

            if (news.isEmpty())
                Result.failure(Exception("No se encontraron noticias"))
            else
                Result.success(news)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}