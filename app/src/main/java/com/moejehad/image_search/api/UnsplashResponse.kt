package com.moejehad.image_search.api

import com.moejehad.image_search.data.UnsplashPhoto

data class UnsplashResponse(
    val results : List<UnsplashPhoto>
)