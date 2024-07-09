package ui.screens.home

import androidx.lifecycle.ViewModel
import data.ActivityRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel(
    private val activityRepository: ActivityRepository,
) : ViewModel() {

    private val _uiState = MutableStateFlow(
        HomeState(
            items = activityRepository.getActivities()
        )
    )
    val uiState: StateFlow<HomeState>
        get() = _uiState
}
