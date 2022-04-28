package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Wishlist

class WishlishRepositoryImpl : WishlishRepository {

    override val wishlist = listOf(
        Wishlist(
            id = 1,
            title = "Buku",
            description =" Buku ini merupkan buku murah",
            price = 10000,
            imageUrl ="https://firebasestorage.googleapis.com/v0/b/android-990c6.appspot.com/o/Product_Image1645175649005.jpg?alt=media&token=0239f462-5fad-4dd6-a6f3-6aa190a637f4"
        ),
        Wishlist(
            id = 2,
            title = "Pulpen",
            description =" Buku ini merupkan pulpen murah",
            price = 50000,
            imageUrl ="https://firebasestorage.googleapis.com/v0/b/android-990c6.appspot.com/o/Product_Image1645177421690.jpg?alt=media&token=fd0387f6-55da-4b51-945d-525b0ee0ee32"
        ),

        Wishlist(
            id = 3,
            title = "Pensil",
            description =" Buku ini merupkan pulpen murah",
            price = 50000,
            imageUrl ="https://firebasestorage.googleapis.com/v0/b/android-990c6.appspot.com/o/Product_Image1645177421690.jpg?alt=media&token=fd0387f6-55da-4b51-945d-525b0ee0ee32"
        ),
        Wishlist(
            id = 4,
            title = "Penghapus",
            description =" Buku ini merupkan pulpen murah",
            price = 50000,
            imageUrl ="https://firebasestorage.googleapis.com/v0/b/android-990c6.appspot.com/o/Product_Image1645177421690.jpg?alt=media&token=fd0387f6-55da-4b51-945d-525b0ee0ee32"
        ),

    )


    override suspend fun getAllWishlist(): List<Wishlist> {
        return wishlist

    }

}