package com.coreywjohnson.setlists.api

data class City(
    val coords: Coords,
    val country: Country,
    val id: String,
    val name: String,
    val state: String,
    val stateCode: String
)

