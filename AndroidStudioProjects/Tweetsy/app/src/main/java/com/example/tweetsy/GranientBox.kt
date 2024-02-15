package com.example.tweetsy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color


val blue = Color(0xff4a2e5b)
val Tail600 = Color(0xff312538)

@Composable
fun GrandientBox(
    modifier: Modifier = Modifier,
    content:@Composable BoxScope.() -> Unit
){
    Box (
        modifier = modifier.background(brush = Brush.linearGradient(listOf(blue, Tail600)
        ))
    ){
       content()
    }
}

