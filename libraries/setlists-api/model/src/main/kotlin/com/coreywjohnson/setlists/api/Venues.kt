package com.coreywjohnson.setlists.api

data class Venues(
    val itemsPerPage: Int,
    val page: Int,
    val total: Int,
    val venue: List<Venue>
)