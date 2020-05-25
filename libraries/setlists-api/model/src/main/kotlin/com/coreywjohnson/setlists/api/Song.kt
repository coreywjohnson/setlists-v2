package com.coreywjohnson.setlists.api

data class Song(
    val cover: Artist,
    val info: String,
    val name: String,
    val tape: Boolean,
    val with: Artist
)