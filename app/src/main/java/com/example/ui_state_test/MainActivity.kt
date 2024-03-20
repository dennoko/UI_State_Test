package com.example.ui_state_test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_state_test.ui.theme.UI_State_TestTheme
import com.example.ui_state_test.view.AppScreen
import com.example.ui_state_test.viewmodel.AppViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val vm: AppViewModel by viewModels()

        setContent {
            val uiState by vm.appUiState.collectAsState()

            UI_State_TestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppScreen(
                        uiState,
                        { vm.countUp() },
                        { vm.addTxt() },
                        { vm.addNumList() },
                        { vm.changeNumList() },
                        { vm.reset() }
                    )
                }
            }
        }
    }
}

