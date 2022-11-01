package com.ivaxtech.jukebox.ui.theme.presentations.sections

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ivaxtech.jukebox.R
import com.ivaxtech.jukebox.ui.theme.LuminousGreen

@Composable
fun PopularGenreTitleSection() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = stringResource(id = R.string.popular_genre),
            style = MaterialTheme.typography.subtitle1,
            color = LuminousGreen,
        )
        Spacer(modifier = Modifier.height(10.dp))
    }

}