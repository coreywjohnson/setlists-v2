package com.coreywjohnson.setlists.api

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SetlistService {
  @GET("1.0/artist/{mbid}")
  fun getArtist(@Path("mbid") mbid: String) : Single<Artist>

  @GET("1.0/artist/{mbid}/setlists")
  fun getArtistSetlists(
      @Path("mbid") mbid: String,
      @Query("p") page: Int
  ) : Single<Setlists>

  @GET("1.0/city/{geoId}")
  fun getCity(@Path("geoId") geoId: String) : Single<City>

  @GET("1.0/search/artists")
  fun searchArtists(
      @Query("artistName") artistName: String,
      @Query("p") page: Int,
      @Query("sort") sort: String = "relevance",
      @Query("artistMbid") artistMbid: String? = null,
      @Query("artistTmid") artistTmid: Int? = null
  ) : Single<Artists>

  @GET("1.0/search/cities")
  fun searchCities(
      @Query("name") name: String,
      @Query("p") page: Int,
      @Query("country") country: String? = null,
      @Query("state") state: String? = null,
      @Query("stateCode") stateCode: String? = null
  ) : Single<Cities>

  @GET("1.0/search/countries")
  fun searchCountries() : Single<Countries>

  @GET("1.0/search/setlists")
  fun searchSetlists(
      @Query("artistName") artistName: String? = null,
      @Query("artistMbid") artistMbid: String? = null,
      @Query("artistTmid") artistTmid: Int? = null,
      @Query("cityId") cityId: String? = null,
      @Query("cityName") cityName: String? = null,
      @Query("countryCode") countryCode: String? = null,
      @Query("date") date: String? = null,
      @Query("lastUpdated") lastUpdated: String? = null,
      @Query("p") page: Int,
      @Query("state") state: String? = null,
      @Query("stateCode") stateCode: String? = null,
      @Query("tourName") tourName: String? = null,
      @Query("venueId") venueId: String? = null,
      @Query("venueName") venueName: String? = null,
      @Query("year") year: String? = null
  ) : Single<Setlists>

  @GET("1.0/search/venues")
  fun searchVenues(
      @Query("cityId") cityId: String? = null,
      @Query("cityName") cityName: String? = null,
      @Query("country") country: String? = null,
      @Query("name") name: String? = null,
      @Query("p") page: Int,
      @Query("state") state: String? = null,
      @Query("stateCode") stateCode: String? = null
  ) : Single<Venues>

  @GET("1.0/setlist/version/{versionId}")
  fun getSetlistVersion(@Path("versionId") versionId: String) : Single<Setlist>

  @GET("1.0/setlist/{setlistId}")
  fun getSetlist(@Path("setlistId") setlistId: String) : Single<Setlist>

  @GET("1.0/user/{userId}")
  fun getUser(@Path("userId") userId: String) : Single<User>

  @GET("1.0/user/{userId}/attended")
  fun getUserAttended(
      @Path("userId") userId: String,
      @Path("p") page: Int
  ) : Single<User>

  @GET("1.0/user/{userId}/edited")
  fun getUserEdited(
      @Path("userId") userId: String,
      @Path("p") page: Int
  ) : Single<User>

  @GET("1.0/venue/{venueId}")
  fun getVenue(@Path("venueId") venueId: String) : Single<Venue>

  @GET("1.0/venue/{venueId}/setlists")
  fun getVenueSetlists(
      @Path("venueId") venueId: String,
      @Path("p") page: Int
  ) : Single<Setlists>
}