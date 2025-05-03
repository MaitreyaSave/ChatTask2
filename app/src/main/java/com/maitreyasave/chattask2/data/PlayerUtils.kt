package com.maitreyasave.chattask2.data

import com.maitreyasave.chattask2.ui.player.PlayerItemCard

class PlayerUtils {

    fun generateDummyPlayers(): List<Player> {

        val result = mutableListOf<Player>()
        for(i in 1..PLAYER_COUNT) {
            val p = Player(
                id = i,
                name = "player $i",
                score = 10*i,
                sport = SPORTS[i % SPORT_COUNT]
            )
            result.add(p)
        }
        return result
    }

    fun toPlayerItemCard(player: Player): PlayerItemCard {
        return PlayerItemCard(
            player.name,
            player.score
        )
    }


    companion object {
        private const val PLAYER_COUNT = 10
        private const val SPORT_COUNT = 3
        private val SPORTS = listOf("Football", "Cricket", "Baseball")
    }

}