package com.qa.application.cinemaapp.repository;

import com.qa.application.cinemaapp.domain.Movie;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends ElasticsearchRepository<Movie, Long> {
}
