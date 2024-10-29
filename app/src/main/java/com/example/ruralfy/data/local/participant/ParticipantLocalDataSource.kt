package com.example.ruralfy.data.local.participant

import com.example.ruralfy.data.Participant

interface ParticipantLocalDataSource {

    suspend fun create(participant: Participant)
    suspend fun readAll():List<Participant>
}