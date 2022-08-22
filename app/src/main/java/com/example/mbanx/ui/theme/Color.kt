package com.example.mbanx.ui.theme

import androidx.compose.material.darkColors
import androidx.compose.ui.graphics.Color

val Blue500 = Color(0xFF03A9F4)
val DarkGreen900 = Color(0xFF263A27)

// Rally is always dark themed.
val ColorPalette = darkColors(
    primary = Blue500,
    surface = DarkGreen900,
    onSurface = Color.White,
    background = DarkGreen900,
    onBackground = Color.White
)