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
import androidx.lifecycle.ViewModelProvider
import com.maitreyasave.chattask2.di.MyApplication
import com.maitreyasave.chattask2.ui.PlayerViewModel
import com.maitreyasave.chattask2.ui.PlayerViewModelFactory
import com.maitreyasave.chattask2.ui.theme.ChatTask2Theme
import javax.inject.Inject


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

    @Inject
    lateinit var playerViewModelFactory: PlayerViewModelFactory
    private lateinit var playerViewModel: PlayerViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //
        ( application as MyApplication).appComponent.inject(this)
        playerViewModel = ViewModelProvider(this, playerViewModelFactory)[PlayerViewModel::class.java]

        val size = playerViewModel.getPlayers().size

        enableEdgeToEdge()
        setContent {
            ChatTask2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "size: $size",
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
