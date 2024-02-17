package com.example.dreaming.application


import android.app.Application
import android.content.Context

class DreamingApp : Application() {

    companion object {
        lateinit var prefs: PreferenceManager
        private lateinit var instance: DreamingApp

        fun getContext(): Context {
            return instance
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}