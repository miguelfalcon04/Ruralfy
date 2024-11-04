package com.example.ruralfy.data

import android.icu.util.CurrencyAmount
import com.example.ruralfy.data.local.expense.ExpenseEntity
import com.example.ruralfy.data.local.participant.Participant
import com.example.ruralfy.data.local.participant.ParticipantEntity
import java.util.Currency
import java.util.UUID

fun ExpenseEntity.toExternal():Expense{
    return Expense(
        id = UUID.fromString(this.id),
        descripcion = this.description,
        amount = CurrencyAmount(
            this.amount,
            Currency.getInstance(this.currency)
        )
    )
}
fun Map<ParticipantEntity,List<ExpenseEntity>>.toExternal():List<Participant>{
    return this.map{
        (participantEntity,expenseEntities) ->
        val expenses = expenseEntities.map(ExpenseEntity::toExternal)
        Participant(
            id = UUID.fromString(participantEntity.id),
            name = participantEntity.name,
            surname1 = participantEntity.surname1,
            surname2 = participantEntity.surname2,
            expenses = expenses
        )
    }
}

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