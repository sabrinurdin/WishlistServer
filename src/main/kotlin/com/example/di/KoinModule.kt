package com.example.di

import com.example.repository.WishlishRepository
import com.example.repository.WishlishRepositoryImpl
import org.koin.dsl.module
import org.koin.dsl.single

val koinModule = module {
    single<WishlishRepository>{
        WishlishRepositoryImpl()
    }
}