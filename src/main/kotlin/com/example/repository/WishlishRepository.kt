package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Wishlist

interface WishlishRepository {
    val wishlist: List<Wishlist>

    suspend fun getAllWishlist(): List<Wishlist>
}