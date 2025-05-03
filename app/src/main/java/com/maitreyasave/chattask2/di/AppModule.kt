package com.maitreyasave.chattask2.di

import com.maitreyasave.chattask2.data.PlayerUtils
import com.maitreyasave.chattask2.ui.PlayerViewModelFactory
import dagger.Module
import dagger.Provides


@Module
class AppModule {

    @Provides
    fun providesPlayerUtils(): PlayerUtils {
        return PlayerUtils()
    }

    @Provides
    fun providePlayerViewModelFactory(playerUtils: PlayerUtils): PlayerViewModelFactory {
        return PlayerViewModelFactory(playerUtils)
    }
}