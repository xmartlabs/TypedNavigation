package com.xmartlabs.typednavigation.ui.hiltExapmle

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HiltExample(
    viewModel: HiltExampleViewModel
) {
    val state by viewModel.stateFlow.collectAsState()
    Text(text = "Hello ${state.name} your age is ${state.age} and you ${if (state.knowsHilt == true) "know" else "don't know"} hilt")
}