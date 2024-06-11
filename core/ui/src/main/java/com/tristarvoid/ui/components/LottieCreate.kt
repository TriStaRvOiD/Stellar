package com.tristarvoid.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.*

@Composable
fun LottieCreate(
    jsonResource: Int,
    size: Int = 300,
    repeat: Boolean = true,
    alignment: Alignment = Alignment.Center
) {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(jsonResource))
    val progress by animateLottieCompositionAsState(
        composition,
        isPlaying = true,
        iterations = LottieConstants.IterateForever
    )
    if (repeat)
        LottieAnimation(
            modifier = Modifier.size(size.dp),
            composition = composition,
            progress = { progress },
            alignment = alignment
        )
    else
        LottieAnimation(
            modifier = Modifier.size(size.dp),
            composition = composition,
            alignment = alignment
        )
}