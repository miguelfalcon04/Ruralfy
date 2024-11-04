package com.example.ruralfy.data

import android.icu.util.CurrencyAmount
import java.util.UUID

data class Expense (
    val id: UUID = UUID.randomUUID(),
    val descripcion: String = "",
    val amount: CurrencyAmount
)