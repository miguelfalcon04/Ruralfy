package com.example.ruralfy.data.local.participant

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.ruralfy.data.toExternal
import com.example.ruralfy.data.toLocalEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
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

    @RequiresApi(Build.VERSION_CODES.Q)
    override suspend fun readAll(): List<Participant> {
        return withContext(Dispatchers.IO){
            dao.readParticpantWithExpenses().toExternal
        }
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override suspend fun oberseAll(): Flow<List<Participant>> {
        TODO("Not yet implemented")
    }

    //override suspend fun readAll() = withContext(Dispatchers.IO) {dao.readAll().toExternal()}
}