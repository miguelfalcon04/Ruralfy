package com.example.ruralfy.di

import android.content.Context
import androidx.room.Room
import com.example.ruralfy.data.local.participant.ParticipantDao
import com.example.ruralfy.data.local.RuralfyDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule {

    @Provides
    @Singleton
    fun provideDataBase(@ApplicationContext context: Context):RuralfyDataBase {
        val dataBase = Room.databaseBuilder(context,
                                            RuralfyDataBase::class.java,
                                            "ruralfy-db"

        ).build()
        return dataBase
    }

    @Provides
    fun provideParticipantDao(dataBase: RuralfyDataBase): ParticipantDao {
        return dataBase.participantDao()
    }
}