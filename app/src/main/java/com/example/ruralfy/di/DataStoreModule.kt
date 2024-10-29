package com.example.ruralfy.di

import com.example.ruralfy.data.local.participant.ParticipantLocalDataSourceDataBase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule{

    @Binds
    @Singleton
    abstract fun bindParticipantLocalDataSource(source: ParticipantLocalDataSourceDataBase)
}