package com.coreywjohnson.setlists.api

data class Set(
    val encore: Int,
    val name: String,
    val song: List<Song>
)