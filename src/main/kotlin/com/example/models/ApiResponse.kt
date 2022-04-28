package com.example.models

@kotlinx.serialization.Serializable
data class ApiResponse(
    val heroes: List<Wishlist> = emptyList()
)