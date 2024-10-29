package com.example.ruralfy.data

import com.example.ruralfy.data.local.participant.Participant
import com.example.ruralfy.data.local.participant.ParticipantEntity
import java.util.UUID

fun Participant.toLocalEntity():ParticipantEntity{
    return ParticipantEntity(
        id = this.id.toString(),
        name = name,
        surname1 = surname1,
        surname2 = surname2
    )
}

fun ParticipantEntity.toExternal(): Participant {
    return Participant(
        id = UUID.fromString(this.id),
        name = name,
        surname1 = surname1,
        surname2 = surname2,
    )
}

fun List<ParticipantEntity>.toExternal():List<Participant> = this.map(ParticipantEntity::toExternal)