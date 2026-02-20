package com.alilopez.kt_demohilt.features.news.data.datasources.remote.models

data class GetResponse(
    val pagination: PaginationDTO,
    val data: List<NewsDTO>,
)
