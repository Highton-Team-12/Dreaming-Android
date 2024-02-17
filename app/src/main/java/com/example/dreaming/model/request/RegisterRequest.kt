package com.example.dreaming.model.request

data class RegisterRequest(
    val email: String,
    val nickname: String,
    val password: String,
)
