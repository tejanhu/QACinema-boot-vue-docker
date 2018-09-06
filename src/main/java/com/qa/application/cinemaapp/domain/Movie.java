package com.qa.application.cinemaapp.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "movie_index", type = "movie")
public class Movie {

    @Id
    @JsonProperty("id")
    private Long id;
    @JsonProperty("movieTitle")
    private String movieTitle;
    @JsonProperty("movieImageData")
    private String movieData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieData() {
        return movieData;
    }

    public void setMovieData(String movieData) {
        this.movieData = movieData;
    }
    @Override
    public String toString(){
        return "Movie: " +
                " id: " + id +
                " movieData: " + movieData;
    }

}
