package com.coreywjohnson.setlists.api

data class Error(
    val code: Int,
    val message: String,
    val status: String,
    val timestamp: String
)