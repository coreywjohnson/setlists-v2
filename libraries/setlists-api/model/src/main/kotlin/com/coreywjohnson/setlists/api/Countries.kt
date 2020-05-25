package com.coreywjohnson.setlists.api

data class Countries(
    val country: List<Country>,
    val itemsPerPage: Int,
    val page: Int,
    val total: Int
)