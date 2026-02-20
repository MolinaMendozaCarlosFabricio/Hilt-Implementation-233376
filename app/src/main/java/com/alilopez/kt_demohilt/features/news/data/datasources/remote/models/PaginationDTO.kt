package com.alilopez.kt_demohilt.features.news.data.datasources.remote.models

data class PaginationDTO(
    var limit: Int,
    var offset: Int,
    var count: Int,
    var total: Int,
)
