package com.moejehad.image_search.data

import com.moejehad.image_search.api.UnsplashAPI
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashAPI: UnsplashAPI) {

}