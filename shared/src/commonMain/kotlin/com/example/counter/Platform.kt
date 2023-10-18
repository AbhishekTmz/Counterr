package com.example.counter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform