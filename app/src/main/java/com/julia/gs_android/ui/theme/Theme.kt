package com.julia.gs_android.ui.theme

import android.app.Activity
import androidx.core.view.WindowCompat

object AppColors {
    const val Purple80: Int = 0xFFD0BCFF.toInt()
    const val Purple40: Int = 0xFF6650A4.toInt()
}

object ThemeUtils {

    fun applyStatusBarColor(activity: Activity, isDarkTheme: Boolean) {
        val window = activity.window
        val color = if (isDarkTheme) AppColors.Purple80 else AppColors.Purple40
        window.statusBarColor = color

        val decorView = window.decorView
        WindowCompat.getInsetsController(window, decorView).isAppearanceLightStatusBars = !isDarkTheme
    }
}
