package com.example.ruralfy.data

import java.util.UUID

data class Participant (
    val id: UUID,
    val name: String,
    val surname1: String,
    val surname2: String?,
)