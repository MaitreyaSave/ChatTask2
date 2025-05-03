package com.maitreyasave.chattask2.ui.player

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun PlayerListScreen(players: List<PlayerItemCard>) {

    LazyColumn(
        modifier = Modifier.fillMaxWidth()
            .padding(12.dp)
    ) {
        items(players) {
            PlayerCard(it)
        }
    }


}


@Composable
fun PlayerCard(playerItemCard: PlayerItemCard) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        onClick =  {
            // TODO
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