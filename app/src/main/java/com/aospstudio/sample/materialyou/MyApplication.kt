package com.aospstudio.sample.materialyou

import android.app.Application
import android.os.Build
import com.google.android.material.color.DynamicColors

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            apply {
                DynamicColors.applyToActivitiesIfAvailable(this)
            }
        }
    }
}
