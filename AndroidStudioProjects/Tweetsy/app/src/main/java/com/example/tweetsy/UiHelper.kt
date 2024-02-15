package com.example.tweetsy

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration


@Composable

fun isSmallScreenSize(): Boolean {
    val conf = LocalConfiguration.current
    return conf.screenHeightDp <= 786
}