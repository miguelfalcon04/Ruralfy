package com.example.ruralfy.data.local.participant

import com.example.ruralfy.data.Participant
import javax.inject.Inject

class ParticipantDefaultRepository
    @Inject constructor(
        private val localDataSource: ParticipantLocalDataSource
    ): ParticipantRepository{

    override suspend fun readAll(): List<Participant> {
        return localDataSource.readAll()
    }

    override suspend fun create(): Participant {
        TODO("Not yet implemented")
    }
}