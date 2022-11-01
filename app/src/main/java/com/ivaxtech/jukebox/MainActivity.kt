package com.ivaxtech.jukebox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ivaxtech.jukebox.ui.theme.DarkBlack
import com.ivaxtech.jukebox.ui.theme.JukeBoxTheme
import com.ivaxtech.jukebox.ui.theme.presentations.screens.LoadingScreen
import com.ivaxtech.jukebox.ui.theme.presentations.screens.home.HomeScreen
import com.ivaxtech.jukebox.ui.theme.presentations.sections.TopHomeSection
import com.ivaxtech.jukebox.view_model.TrackViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

//    val viewModel : TrackViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JukeBoxTheme {

                HomeScreen()

//                observeViewModel()

//                LoadingScreen()

            }
        }
    }

//    private fun observeViewModel() {
//
//        viewModel.trackList.observe(this,{ trackList ->
//
//
//
//
//
//        })
//
//    }
}
