package com.example.ruralfy.data.local.participant

interface ParticipantRepository {

    suspend fun readAll():List<Participant>
    suspend fun create(): Participant

}