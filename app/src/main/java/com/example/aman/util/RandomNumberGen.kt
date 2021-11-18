package com.example.aman.util

object RandomNumberGen {
    fun generateRandomCharacter(): String {
        return (65..90).random().toChar().toString() ?: "b"
    }
}