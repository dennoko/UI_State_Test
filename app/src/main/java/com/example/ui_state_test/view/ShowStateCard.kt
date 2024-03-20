package com.example.ui_state_test.view

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ShowStateCard(
    count: Int,
    txt: String,
    list: List<Int>,
    modifier: Modifier = Modifier
) {
    OutlinedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .then(modifier)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            ShowStateCardItem(contentName = "Count", content = count.toString())
            Spacer(modifier = Modifier.height(8.dp))
            ShowStateCardItem(contentName = "Text", content = txt)
            Spacer(modifier = Modifier.height(8.dp))
            ShowStateCardItem(contentName = "List", content = list.toString())
        }
    }
}