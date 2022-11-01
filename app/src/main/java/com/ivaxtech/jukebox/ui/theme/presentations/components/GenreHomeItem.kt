package com.ivaxtech.jukebox.ui.theme.presentations.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Speaker
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ivaxtech.jukebox.R
import com.ivaxtech.jukebox.model.Track
import com.ivaxtech.jukebox.ui.theme.Grey
import com.ivaxtech.jukebox.ui.theme.LightBlack
import com.ivaxtech.jukebox.ui.theme.LightGrey
import com.ivaxtech.jukebox.ui.theme.White

@Composable
fun GenreHomeItem(track: Track) {
    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .padding(bottom = 4.dp)
            .clickable { },
        backgroundColor = LightBlack,
        elevation = 12.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 5.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                imageVector = Icons.Default.Speaker,
                contentDescription = "User Image",
                contentScale = ContentScale.Crop,
                colorFilter = ColorFilter.tint(color = LightGrey),
                modifier = Modifier.size(50.dp)
            )


            Column(
                modifier = Modifier.padding(start = 6.dp)
            ) {
                Text(
                    text = "Hiphop",
                    style = MaterialTheme.typography.subtitle2,
                    color = White
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "26 Songs",
                    style = MaterialTheme.typography.subtitle2,
                    color = Grey
                )
            }


        }

    }

}