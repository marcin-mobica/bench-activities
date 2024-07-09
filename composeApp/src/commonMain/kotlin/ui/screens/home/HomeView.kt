package ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.model.BenchActivity
import kotlinx.datetime.Instant
import kotlinx.datetime.format
import kotlinx.datetime.format.DateTimeComponents
import kotlinx.datetime.format.DateTimeFormat
import kotlinx.datetime.format.byUnicodePattern
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun HomeView(
    state: HomeState,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
    ) {
        itemsIndexed(state.items) { index, activity ->
            ActivityItem(activity)
            if (index < state.items.lastIndex) {
                Divider(
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Composable
fun ActivityItem(
    benchActivity: BenchActivity,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp),
    ) {
        Text(
            text = benchActivity.title,
            fontSize = 20.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontFamily = FontFamily.Default
        )

        Text(
            text = benchActivity.startDate.toString().split("T").first(),
            fontSize = 12.sp,
            modifier = Modifier.alpha(0.5f),
            fontFamily = FontFamily.SansSerif
        )
    }
}

@Preview
@Composable
fun ActivityItemPreview(modifier: Modifier = Modifier) {
    MaterialTheme {
        ActivityItem(
            BenchActivity(
                id = 1,
                title = "ActivityTitle. A very very long activity Title",
                startDate = Instant.parse("2024-11-05")
            )
        )
    }
}