package com.alilopez.kt_demohilt.features.news.presentation.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class NewsCardViewModel @Inject constructor (): ViewModel() {
    private val _expanded = MutableStateFlow(false)
    val expanded = _expanded.asStateFlow()

    fun changeExpantion(){
        _expanded.value = !_expanded.value
    }
}