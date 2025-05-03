package com.maitreyasave.chattask2.ui

import androidx.lifecycle.ViewModel
import com.maitreyasave.chattask2.data.Player
import com.maitreyasave.chattask2.data.PlayerUtils
import javax.inject.Inject

class PlayerViewModel @Inject constructor(
    val utils: PlayerUtils
): ViewModel() {

    private var players: List<Player> = utils.generateDummyPlayers()

    fun getPlayers() = players

    fun getPlayerItemCards() = players.map {
        utils.toPlayerItemCard(it)
    }

}