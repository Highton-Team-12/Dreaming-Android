package com.example.highton.data.api

import com.example.highton.model.request.LoginRequest
import com.example.highton.model.request.RegisterRequest
import com.example.highton.model.response.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST("/user/login")
    suspend fun login(
        @Body loginRequest: LoginRequest
    ): Response<LoginResponse>

    @POST("/user/signup")
    suspend fun register(
        @Body registerRequest: RegisterRequest
    ): Response<Unit>
}