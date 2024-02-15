package com.example.tweetsy


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color


val blue1 = Color(0xfff3d25c)
val Tail6000 = Color(0xff574206)

@Composable
fun GrandientBox2(
    modifier: Modifier = Modifier,
    content:@Composable BoxScope.() -> Unit
){
    Box (
        modifier = modifier.background(brush = Brush.linearGradient(listOf(blue1, Tail6000)
        ))
    ){
        content()
    }
}

