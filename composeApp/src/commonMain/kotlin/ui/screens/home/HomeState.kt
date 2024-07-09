package ui.screens.home

import data.model.BenchActivity

data class HomeState(
    val toolbarTitle: String = "",
    val items: List<BenchActivity> = emptyList(),
)
