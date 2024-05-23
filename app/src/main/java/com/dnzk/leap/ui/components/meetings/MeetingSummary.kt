package com.dnzk.leap.ui.components.meetings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MeetingSummary(summary: String) {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        Text("Summary", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(summary)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMeetingSummary() {
    MeetingSummary("Started with a general discussion about")
}