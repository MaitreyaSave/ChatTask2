package com.maitreyasave.chattask2.di

import com.maitreyasave.chattask2.MainActivity
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}