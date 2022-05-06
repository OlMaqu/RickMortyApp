package com.unit.collectives.rickmortyapp.api

interface RickAndMortyDataProvider {

    suspend fun getAllCharactersList(
        limit: Int
    ): String

    suspend fun getCharacterInfo(
        characterName: String
    ): String

    suspend fun getAllLocations(
        limit: Int
    ): String

    suspend fun getLocationInfo(
        locationName: String
    ): String

    suspend fun getAllEpisodes(
        limit: Int
    ): String

    suspend fun getEpisodeInfo(
        chapter: String
    ): String
}