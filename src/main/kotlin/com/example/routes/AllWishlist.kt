package com.example.routes

import com.example.repository.WishlishRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllWishlist(){
    val wishlishRepository : WishlishRepository by inject()

    get("/wishlist"){
        val apiResponse = wishlishRepository.getAllWishlist()
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}