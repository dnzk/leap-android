package com.dnzk.leap.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.unit.dp
import com.dnzk.leap.ui.components.meetings.MeetingParticipant
import com.dnzk.leap.ui.theme.Gray50


@Composable
fun MeetingCard(title: String, date: String, participants: List<MeetingParticipant>) {
    Surface(
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(
            1.dp,
            color = MaterialTheme.colorScheme.primary
        ),
        modifier = Modifier
            .fillMaxWidth()
            .shadow(5.dp, shape = RoundedCornerShape(8.dp), ambientColor = DefaultShadowColor),
        onClick = {
        }
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Text(
                title,
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.primary
            )
            Text(date, style = MaterialTheme.typography.labelMedium, color = Gray50)
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                participants.forEach { participant ->
                    AssistChip(onClick = { /*TODO*/ }, label = {
                        Text(participant.name)
                    })
                }
            }
        }
    }
}