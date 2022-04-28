package com.example.models

@kotlinx.serialization.Serializable
data class Wishlist (
    val id:Int,
    val title: String,
    val description: String,
    val price: Int,
    val imageUrl: String
)