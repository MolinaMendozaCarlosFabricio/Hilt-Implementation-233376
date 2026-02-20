package com.alilopez.kt_demohilt.features.news.data.datasources.remote.models

data class NewsDTO(
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val source: String?,
    val image: String?,
    val category: String?,
    val language: String?,
    val country: String?,
    val published_at: String?,
)
