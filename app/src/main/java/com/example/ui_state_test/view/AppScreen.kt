package com.example.ui_state_test.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ui_state_test.model.ui_state.AppUiState

@Composable
fun AppScreen(
    uiState: AppUiState,
    countUp: () -> Unit,
    addHoge: () -> Unit,
    addListItem: () -> Unit,
    changeListItem: () -> Unit,
    reset: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        ActionButton(txt = "Count Up") {
            countUp()
        }
        Spacer(modifier = Modifier.height(16.dp))

        ActionButton(txt = "Add hoge") {
            addHoge()
        }
        Spacer(modifier = Modifier.height(16.dp))

        ActionButton(txt = "Add List Item") {
            addListItem()
        }
        Spacer(modifier = Modifier.height(16.dp))

        ActionButton(txt = "Change List Item") {
            changeListItem()
        }
        Spacer(modifier = Modifier.height(16.dp))

        ShowStateCard(
            count = uiState.count,
            txt = uiState.txt,
            list = uiState.numList,
            modifier = Modifier.weight(1f)
        )

        Spacer(modifier = Modifier.height(16.dp))

        ActionButton(txt = "Reset") {
            reset()
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}