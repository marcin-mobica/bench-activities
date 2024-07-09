package data.model

import kotlinx.datetime.Instant

data class BenchActivity(
    val id: Int,
    val title: String,
    val startDate: Instant,
)
