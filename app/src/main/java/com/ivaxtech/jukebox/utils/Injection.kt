package com.ivaxtech.jukebox.utils

import com.ivaxtech.jukebox.repository.TrackRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Injection {
    @Provides
    fun provideRepository(): TrackRepository { return TrackRepository() }
}