package ui.navigation

import kotlinx.serialization.Serializable

sealed interface NavDestinations {

    @Serializable
    data object Home : NavDestinations

    @Serializable
    data class Details(val id: Int) : NavDestinations
}