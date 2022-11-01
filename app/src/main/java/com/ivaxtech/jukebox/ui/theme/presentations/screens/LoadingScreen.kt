package com.ivaxtech.jukebox.ui.theme.presentations.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.*
import com.ivaxtech.jukebox.R
import com.ivaxtech.jukebox.ui.theme.DarkBlack
import com.ivaxtech.jukebox.ui.theme.LightGrey

@Composable
fun LoadingScreen() {

    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.loading))
    val progress by animateLottieCompositionAsState(
        composition,
        iterations = LottieConstants.IterateForever,
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkBlack)
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LottieAnimation(
                composition = composition,
                progress = { progress },
            )

            Text(
                stringResource(id = R.string.loading_text),
                style = MaterialTheme.typography.h6,
                color = LightGrey
            )
        }
    }

}

@Preview
@Composable
fun LoadingPreview() {
    LoadingScreen()
}