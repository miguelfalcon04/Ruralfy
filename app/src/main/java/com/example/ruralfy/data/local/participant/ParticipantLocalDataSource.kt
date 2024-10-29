package com.example.ruralfy.data.local.participant

interface ParticipantLocalDataSource {

    suspend fun create(participant: Participant)
    suspend fun readAll():List<Participant>
}