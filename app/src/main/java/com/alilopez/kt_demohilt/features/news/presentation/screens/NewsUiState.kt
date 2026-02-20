package com.alilopez.kt_demohilt.features.news.presentation.screens

import com.alilopez.kt_demohilt.features.news.domain.entities.News

data class NewsUiState(
    val isLoading: Boolean = false,
    val news: List<News> = emptyList(),
    val error: String? = null,
    val isRefreshing: Boolean = false
)
