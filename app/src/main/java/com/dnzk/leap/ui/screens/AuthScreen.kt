package com.dnzk.leap.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dnzk.leap.ui.components.AppLogo

@Composable
fun AuthScreen(modifier: Modifier = Modifier) {
    var email by rememberSaveable {
        mutableStateOf("")
    }
    var password by rememberSaveable {
        mutableStateOf("")
    }
    var surfaceSize by remember {
        mutableStateOf(IntSize.Zero)
    }
    Scaffold() { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
            .padding(top = 40.dp)) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                AppLogo()
                Text(
                    "Cut meeting admin work by 90%",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Column(
                modifier = Modifier
                    .padding(horizontal = 30.dp, vertical = 40.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                TextField(
                    value = email,
                    onValueChange = {
                        email = it
                    },
                    label = {
                        TextFieldLabel("Email")
                    },
                    modifier = Modifier.fillMaxWidth(),
                )
                TextField(
                    value = password,
                    onValueChange = {
                        password = it
                    },
                    label = {
                        TextFieldLabel("Password")
                    },
                    modifier = Modifier.fillMaxWidth()
                )
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                ) {
                    Text("Log In")
                }
            }
        }
    }
}

@Composable
fun TextFieldLabel(label: String) {
    Text(label, style = TextStyle(fontSize = 10.sp))
}

@Preview
@Composable
fun PreviewAuthScreen() {
    AuthScreen()
}