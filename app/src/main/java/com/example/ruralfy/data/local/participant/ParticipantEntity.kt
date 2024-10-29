package com.example.ruralfy.data.local.participant

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "com/example/ruralfy/data/local/participant")
data class ParticipantEntity (
    @PrimaryKey val id: String,
    val name: String,
    val surname1: String,
    val surname2: String?,
)