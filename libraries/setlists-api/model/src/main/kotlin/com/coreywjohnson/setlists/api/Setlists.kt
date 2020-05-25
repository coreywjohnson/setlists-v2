package com.coreywjohnson.setlists.api

data class Setlists(
    val itemsPerPage: Int,
    val page: Int,
    val setlist: List<Setlist>,
    val total: Int
)