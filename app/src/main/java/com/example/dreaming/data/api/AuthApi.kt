package com.example.dreaming.data.api

import com.example.dreaming.model.request.LoginRequest
import com.example.dreaming.model.request.RegisterRequest
import com.example.dreaming.model.response.LoginResponse
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