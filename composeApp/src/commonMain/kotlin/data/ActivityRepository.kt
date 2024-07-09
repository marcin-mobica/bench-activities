package data

import data.model.BenchActivity
import kotlinx.datetime.Clock
import kotlinx.datetime.DateTimeUnit
import kotlinx.datetime.TimeZone
import kotlinx.datetime.minus

class ActivityRepository {

    fun getActivities() = mockActivities
}

private val systemTZ = TimeZone.currentSystemDefault()
private val mockActivities = listOf(
    BenchActivity(
        id = 1,
        title = "title 1",
        startDate = Clock.System.now().minus(2, DateTimeUnit.DAY, systemTZ),
    ),
    BenchActivity(
        id = 2,
        title = "title 2",
        startDate = Clock.System.now().minus(21, DateTimeUnit.DAY, systemTZ),
    ),
    BenchActivity(
        id = 3,
        title = "title 3",
        startDate = Clock.System.now().minus(102, DateTimeUnit.DAY, systemTZ),
    ),
)