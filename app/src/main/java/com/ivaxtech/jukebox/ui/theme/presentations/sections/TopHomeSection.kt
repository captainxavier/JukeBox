package com.ivaxtech.jukebox.ui.theme.presentations.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ivaxtech.jukebox.ui.theme.DarkBlack
import com.ivaxtech.jukebox.ui.theme.LightGrey
import com.ivaxtech.jukebox.ui.theme.White

@Composable
fun TopHomeSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(DarkBlack)
            .padding(horizontal = 16.dp, vertical = 5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(verticalArrangement = Arrangement.Bottom) {
            Text(
                text = "Good Morning",
                style = MaterialTheme.typography.subtitle1,
                color = LightGrey
            )
            Text(
                text = "Francis",
                style = MaterialTheme.typography.h5,
                color = White
            )

        }

        Card(
            modifier = Modifier
                .size(65.dp)
                .clickable {  },
            shape = CircleShape,
            elevation = 12.dp
        ) {
            Image(
                painter = painterResource(id = com.ivaxtech.jukebox.R.drawable.user),
                contentDescription = "User Image",
                contentScale = ContentScale.Crop
            )
        }
    }

}