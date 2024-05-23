package com.dnzk.leap.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dnzk.leap.ui.components.meetings.MeetingHeader
import com.dnzk.leap.ui.components.meetings.MeetingParticipant
import com.dnzk.leap.ui.components.meetings.MeetingSummary
import com.dnzk.leap.ui.components.meetings.MeetingTasks
import com.dnzk.leap.ui.components.meetings.Task

@Composable
fun MeetingsScreen() {
    Surface(
        modifier = Modifier
            .padding(10.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(15.dp)) {
            MeetingHeader(
                title = "Quarterly review meeting - Chaves",
                subtitle = "February 28, 2024 1:00pm",
                participants = listOf(
                    MeetingParticipant(name = "Tim Chaves"),
                    MeetingParticipant(name = "Olivia Palmer")
                )
            )
            MeetingTasks(
                tasks = listOf(
                    Task(
                        name = "Send wire for loan payoff by Thursday",
                        participant = MeetingParticipant(name = "Sylvia Montgomery"),
                        date = "Mar 2"
                    )
                )
            )
            MeetingSummary("Started with a general discussion about the Chaves family and how they're doing")
        }

    }
}