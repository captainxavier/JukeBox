package com.ivaxtech.jukebox.repository

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import com.ivaxtech.jukebox.model.Track
import com.ivaxtech.jukebox.model.toTrack
import com.ivaxtech.jukebox.utils.Constants
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class TrackRepository {
    private val storage = Firebase.storage
    private val albumArt = storage.reference.child(Constants.ALL_ALBUM_ART)
    private val trackRef = storage.reference.child(Constants.ALL_TRACKS)


    suspend fun getTracks() = suspendCoroutine<List<Track>> { result ->
        val trackList = mutableListOf<Track>()

        try {
            Firebase.firestore.collection(Constants.TRACKS).get().addOnCompleteListener { task ->
                var  index = 0

                task.result.forEach{ document ->

                    val imageUrl = albumArt.child(document.getString(Constants.ALBUM_ART)?:"")
                    val trackUrl = trackRef.child(document.getString(Constants.FILE_NAME)?:"")


                    imageUrl.downloadUrl.addOnSuccessListener { imageDownloadUrl ->

                        trackUrl.downloadUrl.addOnSuccessListener { trackDownloadUrl ->

                            trackList.add(
                                document.toTrack(
                                    index = index,
                                    imgUrl = imageDownloadUrl.toString(),
                                    trackUrl = trackDownloadUrl.toString()
                                )
                            )

                            if (index== task.result.size()-1){
                                result.resume(trackList)
                            }
                            index++

                        }

                    }

                }


            }

        }catch ( e:Exception){
            e.printStackTrace()
            Log.d(TAG, "getTracks: Error::"+e.localizedMessage)
        }
    }
}