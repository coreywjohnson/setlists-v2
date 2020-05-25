package com.coreywjohnson.setlists.api

data class Artists(
    val artist: List<Artist>,
    val itemsPerPage: Int,
    val page: Int,
    val total: Int
)