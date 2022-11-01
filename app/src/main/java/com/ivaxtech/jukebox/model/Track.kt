package com.ivaxtech.jukebox.model

import com.google.firebase.firestore.QueryDocumentSnapshot
import com.ivaxtech.jukebox.utils.Constants

data class Track(
    val index:Int,
    val albumArt: String,
    val artist: String,
    val songTitle: String,
    val trackUrl:String,
    val isPlaying:Boolean,
    val fileUrl:String
)

fun QueryDocumentSnapshot.toTrack(index: Int,imgUrl:String,trackUrl: String):Track{
    return Track(
        index = index,
        albumArt = imgUrl,
        artist = this.getString(Constants.ARTIST)?:"",
        songTitle = this.getString(Constants.NAME)?:"",
        trackUrl = trackUrl,
        isPlaying = false,
        fileUrl = this.getString(Constants.FILE_NAME)?:"")
}