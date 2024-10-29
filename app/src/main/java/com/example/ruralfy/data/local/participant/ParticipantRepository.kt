package com.example.ruralfy.data.local.participant

import com.example.ruralfy.data.Participant

interface ParticipantRepository {

    suspend fun readAll():List<Participant>
    suspend fun create():Participant

}