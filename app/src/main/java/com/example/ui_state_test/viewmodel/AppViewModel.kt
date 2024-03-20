package com.example.ui_state_test.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class AppViewModel: ViewModel() {
    private val _appUiState = MutableStateFlow(
        AppUiState()
    )

    val appUiState = _appUiState.asStateFlow()

    // count up
    fun countUp() {
        _appUiState.update { it.copy(count = it.count + 1) }
    }

    // add txt
    fun addTxt() {
        _appUiState.update { it.copy(txt = it.txt + " hoge")}
    }

    // add numList
    fun addNumList() {
        _appUiState.update { it.copy(numList = it.numList + listOf(it.numList.size)) }
    }

    // change List item
    fun changeNumList() {
        if (_appUiState.value.numList.isNotEmpty()) {
            _appUiState.update {
                it.copy(
                    numList = it.numList.mapIndexed {index, i ->
                        i + index
                    }
                )
            }
        }
    }

    // reset
    fun reset() {
        _appUiState.value = AppUiState()
    }
}