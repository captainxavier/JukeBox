package com.ivaxtech.jukebox.ui.theme.presentations.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ivaxtech.jukebox.R
import com.ivaxtech.jukebox.model.Track
import com.ivaxtech.jukebox.ui.theme.*

@Composable
fun TopPickSection(tracks:List<Track>) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = stringResource(id = R.string.picked_for_you),
                style = MaterialTheme.typography.subtitle1,
                color = LightGrey
            )

            Text(
                text = stringResource(id = R.string.more),
                style = MaterialTheme.typography.subtitle1,
                color = LuminousGreen,
                modifier = Modifier.clickable {  }
            )

        }
        Spacer(modifier = Modifier.heightIn(5.dp))
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            items(tracks.size) {
//                val onNavigate = {
//                    navController.navigate(services[it].route)
//                }

                Card(
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .fillParentMaxWidth(0.75f)
                        .padding(end = 8.dp)
                        .clickable { },
                    backgroundColor = LightBlack,
                    elevation = 12.dp
                ) {
                    Column(modifier = Modifier
                        .fillMaxWidth()) {

                        Image(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(210.dp)
                                .clip(RoundedCornerShape(20.dp)),
                            painter = painterResource(id = R.drawable.one),
                            contentDescription = "User Image",
                            contentScale = ContentScale.Crop,
                        )

                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .padding(all = 8.dp)
                        ) {
                            Text(
                                text = "Music Name",
                                style = MaterialTheme.typography.subtitle1,
                                color = LightGrey
                            )
                            Spacer(modifier = Modifier.height(1.dp))
                            Text(
                                text = "by Artist",
                                style = MaterialTheme.typography.subtitle2,
                                color = Grey
                            )

                        }

                    }

                }
            }
        }

    }

}