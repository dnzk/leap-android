package com.dnzk.leap.ui.components.meetings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.AssistChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dnzk.leap.ui.theme.Gray50

data class MeetingParticipant(val name: String)

@Composable
private fun Title(title: String) {
    Text(title, style = MaterialTheme.typography.headlineMedium)
}

@Composable
private fun SubTitle(subtitle: String) {
    Text(
        subtitle,
        style = MaterialTheme.typography.labelLarge,
        color = Gray50
    )
}

@Composable
private fun Participants(participants: List<MeetingParticipant>) {
    Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
        participants.forEach { participant ->
            AssistChip(
                onClick = { /*TODO*/ },
                label = {
                    Text(participant.name)
                })
        }
    }
}

@Composable
fun MeetingHeader(title: String, subtitle: String, participants: List<MeetingParticipant>) {
    Column {
        Title(title)
        SubTitle(subtitle)
        Participants(participants)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMeetingHeader() {
    MeetingHeader(
        title = "Meeting title", subtitle = "February 10, 2024 10:00pm", participants = listOf(
            MeetingParticipant(name = "Tim Chaves"),
            MeetingParticipant(name = "Olivia Palmer")
        )
    )
}