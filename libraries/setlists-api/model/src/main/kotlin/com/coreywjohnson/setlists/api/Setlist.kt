package com.coreywjohnson.setlists.api

data class Setlist(
    val artist: Artist,
    val eventDate: String,
    val id: String,
    val info: String,
    val lastUpdated: String,
    val `set`: List<Set>,
    val tour: Tour,
    val url: String,
    val venue: Venue,
    val versionId: String
)