package di

import data.ActivityRepository
import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import ui.screens.home.HomeViewModel

val commonModule = module {
    viewModelOf(::HomeViewModel)

    singleOf(::ActivityRepository)
}
