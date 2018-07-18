package com.example.daynighttheme

import android.app.Application
import android.support.v7.app.AppCompatDelegate


class MyApp: Application() {

    init {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO)
    }

}

