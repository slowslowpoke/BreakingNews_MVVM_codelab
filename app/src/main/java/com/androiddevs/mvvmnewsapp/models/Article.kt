package com.androiddevs.mvvmnewsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(
    tableName = "articles"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val source: Source,
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String
) : Serializable {


    //пока не добавила переопределение хешкода, приложение вылетало при попытке навигации в ArticleFragment
    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + url.hashCode()
        return result
    }

}