package com.dnzk.leap.ui.components.meetings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dnzk.leap.ui.theme.Gray40
import com.dnzk.leap.ui.theme.Gray50

data class Task(
    val name: String,
    val participant: MeetingParticipant,
    val date: String,
)

@Composable
private fun Header() {
    Text(
        "Tasks from this meeting",
        style = TextStyle(fontWeight = FontWeight.Bold)
    )
}

@Composable
private fun TaskCard(task: Task) {
    Surface(
        onClick = { /*TODO*/ },
        color = Gray40,
        shape = RoundedCornerShape(8.dp),
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Text(task.name)
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                AssistChip(onClick = { /*TODO*/ }, label = {
                    Text(task.participant.name)
                })
                Text(task.date, color = Gray50)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MeetingTasks(tasks: List<Task>) {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        Header()
        for (task in tasks) {
            TaskCard(task)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMeetingTasks() {
    MeetingTasks(
        tasks = listOf(
            Task(
                name = "Send wire for loan payoff",
                participant = MeetingParticipant(name = "Sylvia Montgomery"),
                date = "Mar 2"
            )
        )
    )
}