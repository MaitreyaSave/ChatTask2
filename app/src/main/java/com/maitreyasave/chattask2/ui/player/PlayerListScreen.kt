package com.maitreyasave.chattask2.ui.player

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun PlayerListScreen(
    navController: NavController,
    players: List<PlayerItemCard>
) {

    LazyColumn(
        modifier = Modifier.fillMaxWidth()
            .padding(12.dp)
    ) {
        items(players) {
            PlayerCard(navController, it)
        }
    }


}


@Composable
fun PlayerCard(
    navController: NavController,
    playerItemCard: PlayerItemCard
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        onClick =  {
            navController.navigate("detail/${playerItemCard.name}")
        }
    ) {

        Text(
            text = playerItemCard.name
        )
        Spacer(Modifier.height(12.dp))
        Text(
            text = playerItemCard.score.toString()
        )
    }


}