package com.androiddevs.mvvmnewsapp

import com.androiddevs.mvvmnewsapp.Article

data class NewsResponse(
    val status: String,
    val totalResults: Int,
    val articles: List<Article>
)