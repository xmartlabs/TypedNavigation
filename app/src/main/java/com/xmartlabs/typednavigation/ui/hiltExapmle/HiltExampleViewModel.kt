package com.xmartlabs.typednavigation.ui.hiltExapmle

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.xmartlabs.typednavigation.Router
import com.xmartlabs.typednavigation.withAttributes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HiltExampleViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    data class ScreenState(val name: String? = null, val age: Int? = null, val knowsHilt: Boolean? = null)

    val stateFlow: MutableStateFlow<ScreenState> = MutableStateFlow(ScreenState())

    init {
        Router.hiltExample.withAttributes(savedStateHandle) { name, age, knowsHilt ->
            viewModelScope.launch {
                stateFlow.emit(ScreenState(name!!, age, knowsHilt))
            }
        }
    }
}

