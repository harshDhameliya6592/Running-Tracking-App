package com.runningapp.app.runningapp

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class BaseApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

        Timber.tag("TAG Data").e("onCreate: ")

        Log.e("TAG", "onCreate: ")

    }

}