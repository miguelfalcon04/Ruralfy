package com.example.ruralfy.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ruralfy.data.local.participant.ParticipantDao
import com.example.ruralfy.data.local.participant.ParticipantEntity

@Database(
    entities = [ParticipantEntity::class],
    version = 1
)
abstract class RuralfyDataBase():RoomDatabase() {

    abstract fun  participantDao(): ParticipantDao
}