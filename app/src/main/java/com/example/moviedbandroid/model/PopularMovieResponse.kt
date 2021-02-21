package com.example.moviedbandroid.model


data class PopularMovieResponse {
    val page: Int,
    val total_pages: Int,
    val total_results: Int,
    val results: List<PopularMovieData>
}

data class PopularMovieData{
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Long,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vore_average: Double,
    val vote_count: Int
}