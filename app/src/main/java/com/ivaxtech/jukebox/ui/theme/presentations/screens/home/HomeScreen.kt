package com.ivaxtech.jukebox.ui.theme.presentations.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ivaxtech.jukebox.model.Track
import com.ivaxtech.jukebox.ui.theme.DarkBlack
import com.ivaxtech.jukebox.ui.theme.LightBlack
import com.ivaxtech.jukebox.ui.theme.presentations.components.GenreHomeItem
import com.ivaxtech.jukebox.ui.theme.presentations.sections.PopularGenreTitleSection
import com.ivaxtech.jukebox.ui.theme.presentations.sections.SearchSection
import com.ivaxtech.jukebox.ui.theme.presentations.sections.TopHomeSection
import com.ivaxtech.jukebox.ui.theme.presentations.sections.TopPickSection

@Composable
fun HomeScreen() {
    val horizontalSpace = 20.dp
    val state = rememberLazyListState()

    val tracks = listOf(
        Track(
            index = 1,
            albumArt = "",
            artist = "",
            songTitle = "",
            trackUrl = "",
            isPlaying = true,
            fileUrl = ""
        ),
        Track(
            index = 1,
            albumArt = "",
            artist = "",
            songTitle = "",
            trackUrl = "",
            isPlaying = true,
            fileUrl = ""
        ),
        Track(
            index = 1,
            albumArt = "",
            artist = "",
            songTitle = "",
            trackUrl = "",
            isPlaying = true,
            fileUrl = ""
        ),
        Track(
            index = 1,
            albumArt = "",
            artist = "",
            songTitle = "",
            trackUrl = "",
            isPlaying = true,
            fileUrl = ""
        ),
        Track(
            index = 1,
            albumArt = "",
            artist = "",
            songTitle = "",
            trackUrl = "",
            isPlaying = true,
            fileUrl = ""
        ),
        Track(
            index = 1,
            albumArt = "",
            artist = "",
            songTitle = "",
            trackUrl = "",
            isPlaying = true,
            fileUrl = ""
        ),
        Track(
            index = 1,
            albumArt = "",
            artist = "",
            songTitle = "",
            trackUrl = "",
            isPlaying = true,
            fileUrl = ""
        )
    )

    Scaffold(
        topBar = {
            TopHomeSection()
        },

        ) { contentPadding ->

        Box(
            modifier = Modifier
                .padding(contentPadding)
                .background(DarkBlack)
        ) {

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = horizontalSpace),
                state = state
            ) {
                item {
                    SearchSection()
                }

                item {


                    TopPickSection(tracks = tracks)
                }

                item {
                    PopularGenreTitleSection()
                }

                items(tracks.size){
                    GenreHomeItem(track = tracks[it])
                }

            }

        }
    }

}