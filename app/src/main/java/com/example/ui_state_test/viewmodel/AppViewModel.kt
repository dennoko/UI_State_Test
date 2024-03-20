package com.example.ui_state_test.viewmodel

import androidx.lifecycle.ViewModel
import com.example.ui_state_test.model.ui_state.AppUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class AppViewModel: ViewModel() {
    private val _appUiState = MutableStateFlow(
        AppUiState(
            count = 0,
            txt = "",
            numList = listOf()
        )
    )

    val appUiState = _appUiState.asStateFlow()

    // count up
    fun countUp() {
        _appUiState.value = _appUiState.value.copy(
            count = _appUiState.value.count + 1
        )
    }

    // add txt
    fun addTxt() {
        _appUiState.value = _appUiState.value.copy(
            txt = _appUiState.value.txt + " hoge"
        )
    }

    // add numList
    fun addNumList() {
        _appUiState.value = _appUiState.value.copy(
            numList = _appUiState.value.numList + listOf(_appUiState.value.numList.size)
        )
    }

    // change List item
    fun changeNumList() {
        if (_appUiState.value.numList.isNotEmpty()) {
            _appUiState.value = _appUiState.value.copy(
                numList = _appUiState.value.numList.mapIndexed { index, i ->
                    i + index
                }
            )
        }
    }
}