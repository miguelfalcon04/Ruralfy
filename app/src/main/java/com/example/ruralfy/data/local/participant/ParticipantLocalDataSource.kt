package com.example.ruralfy.data.local.participant

import kotlinx.coroutines.flow.Flow

interface ParticipantLocalDataSource {

    suspend fun create(participant: Participant)
    suspend fun readAll():List<Participant>
    suspend fun oberseAll(): Flow<List<Participant>>
}