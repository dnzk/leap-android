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
import com.dnzk.leap.ui.components.AppLogo
import com.dnzk.leap.ui.components.MeetingCard
import com.dnzk.leap.ui.components.meetings.MeetingParticipant

@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier
            .padding(10.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(15.dp)) {
            AppLogo()
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                MeetingCard(
                    title = "Quarterly review - Tim Chaves", date = "Mar 2", participants = listOf(
                        MeetingParticipant(name = "Tim Chaves"),
                        MeetingParticipant(name = "Olivia Palmer"),
                    )
                )
                MeetingCard(
                    title = "Meeting number 2", date = "Mar 3", participants = listOf(
                        MeetingParticipant(name = "Olivia Palmer")
                    )
                )
            }
        }
    }
}
