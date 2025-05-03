package com.maitreyasave.chattask2.di

import android.app.Application

class MyApplication: Application() {

    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().build()

    }

}