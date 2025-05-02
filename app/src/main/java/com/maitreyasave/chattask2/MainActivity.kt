package com.maitreyasave.chattask2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.maitreyasave.chattask2.ui.theme.ChatTask2Theme


/*
Interview Question:

    You are building an Android app using Jetpack Compose and the Navigation component. The app has two screens:
    PlayerListScreen: Displays a list of players. Each player has a name and a score.
    PlayerDetailScreen: Shows details of the selected player and allows updating the score.

    Task:
    Set up navigation between these two screens using NavHost and NavController.
    Ensure that state (player list and player updates) is shared across both screens, so when a player's score is updated in PlayerDetailScreen, the updated score is reflected back in PlayerListScreen.

    Bonus:
    Show how you would manage this shared state using ViewModel scoped to the NavGraph (and not recomposing everything unnecessarily).

 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChatTask2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "O???",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
