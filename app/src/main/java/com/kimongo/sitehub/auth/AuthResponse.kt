package com.kimongo.sitehub.auth

sealed interface AuthResponse {
    data object Success : AuthResponse
    data class Error(val message: String?) : AuthResponse
}
