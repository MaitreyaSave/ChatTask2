package com.maitreyasave.chattask2.ui.player

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun PlayerDetailScreen(navController: NavController, id: String?){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
            .padding(24.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text("Detail Screen for: $id")

        Button(onClick = {
            navController.popBackStack() // ⬅️ Go back
        }) {
            Text("Go Back")
        }
    }
}