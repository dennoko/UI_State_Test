package com.example.ui_state_test.view

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun ShowStateCardItem(
    contentName: String,
    content: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = contentName,
            modifier = Modifier
                .weight(1f),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
        )

        Text(
            text = ":",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = content,
            modifier = Modifier
                .weight(3f),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}