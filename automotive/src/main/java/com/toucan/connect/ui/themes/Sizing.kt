package com.toucan.connect.ui.themes

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Sizing(
    val default: Dp = 0.dp,
    val extraSmall: Dp = 20.dp,
    val small: Dp = 24.dp,
    val medium: Dp = 40.dp,
    val large: Dp = 48.dp
)

val LocalSizing = staticCompositionLocalOf { Sizing() }

val MaterialTheme.sizing: Sizing
    @Composable
    @ReadOnlyComposable
    get() = LocalSizing.current