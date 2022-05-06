package com.unit.collectives.rickmortyapp.api.retrofit

import com.unit.collectives.rickmortyapp.model.*
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RickAndMortyApiService {

    @GET("character")
    suspend fun getAllCharactersList(
        @Query("limit") limit: Int
    ): List<Characters>

    @GET("character/{characterName}")
    suspend fun getCharacterInfo(
        @Path("characterName") characterName: String
    ):CharacterInfo

    @GET("location")
    suspend fun getAllLocations(
        @Query("limit") limit: Int
    ): List<Locations>

    @GET("location/{locationName}")
    suspend fun getLocationInfo(
        @Path("locationName") locationName: String
    ): LocationInfo

    @GET("episode")
    suspend fun getAllEpisodes(
        @Query("limit") limit: Int
    ): List<Episodes>

    @GET("episode/{chapter}")
    suspend fun getEpisodeInfo(
        @Path("chapter") chapter: String
    ): EpisodeInfo
}