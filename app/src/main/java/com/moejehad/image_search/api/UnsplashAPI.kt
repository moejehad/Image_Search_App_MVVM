package com.moejehad.image_search.api

import androidx.viewbinding.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashAPI {

    companion object {
        const val BASE_URL = "https://api.unsplash.com/"
        const val CLIENT_KEY = "FBJL6f1ekMn6FkAAoUHyf_l43NeIf84Y_09EqJRu99w"
    }

    @Headers("Accept-Version: v1","Authorization: Client-ID $CLIENT_KEY")
    @GET("search/photos")
    suspend fun searchPhoto(
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ) : UnsplashResponse
}