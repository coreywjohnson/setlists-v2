package com.coreywjohnson.setlists.api

data class Cities(
    val cities: List<City>,
    val itemsPerPage: Int,
    val page: Int,
    val total: Int
)