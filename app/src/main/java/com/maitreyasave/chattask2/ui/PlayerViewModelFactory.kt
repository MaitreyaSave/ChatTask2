package com.maitreyasave.chattask2.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.maitreyasave.chattask2.data.PlayerUtils
import javax.inject.Inject

class PlayerViewModelFactory @Inject constructor(
    private val playerUtils: PlayerUtils
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PlayerViewModel::class.java)) {
            return PlayerViewModel(playerUtils) as T
        }
        throw IllegalArgumentException("unknonw VM")
    }

}