package com.example.ruralfy.data.local.participant

import com.example.ruralfy.data.Participant
import com.example.ruralfy.data.toExternal
import com.example.ruralfy.data.toLocalEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ParticipantLocalDataSourceDataBase
    @Inject constructor(
        private val dao: ParticipantDao
    ):ParticipantLocalDataSource {

    override suspend fun create(participant: Participant) {
        withContext(Dispatchers.IO){
            dao.create(participant.toLocalEntity())
        }
    }

    override suspend fun readAll() = withContext(Dispatchers.IO) {dao.readAll().toExternal()}
}