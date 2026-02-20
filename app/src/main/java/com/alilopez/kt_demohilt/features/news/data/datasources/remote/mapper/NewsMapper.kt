package com.alilopez.kt_demohilt.features.news.data.datasources.remote.mapper

import com.alilopez.kt_demohilt.features.news.data.datasources.remote.models.NewsDTO
import com.alilopez.kt_demohilt.features.news.domain.entities.News

fun NewsDTO.toDomain(): News {
    return News(
        author = author ?: "Unknown",
        title = title ?: "",
        description = description ?: "",
        ref = url ?: "",
        source = source ?: "",
        image_url = image ?: "",
        category = category ?: "",
        language = language ?: "",
        country = country ?: "",
        date = published_at ?: "",
    )
}
