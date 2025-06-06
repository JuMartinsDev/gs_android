package com.julia.gs_android.ui.theme

import android.graphics.Typeface

object Type {

        data class TextStyle(
                val fontFamily: Typeface = Typeface.DEFAULT,
                val fontWeight: Int = Typeface.NORMAL,
                val fontSizeSp: Float = 16f,
                val lineHeightSp: Float = 24f,
                val letterSpacing: Float = 0.5f
        )

        val bodyLarge = TextStyle()
}
