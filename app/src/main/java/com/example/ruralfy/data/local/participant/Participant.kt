package com.example.ruralfy.data.local.participant

import java.util.UUID

data class Participant (
    val id: UUID,
    val name: String,
    val surname1: String,
    val surname2: String?,
)