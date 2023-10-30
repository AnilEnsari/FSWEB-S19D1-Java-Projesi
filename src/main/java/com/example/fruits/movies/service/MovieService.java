package com.example.fruits.movies.service;

import com.example.fruits.movies.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();

    Movie findById(int id);

    Movie save(Movie movie);

    Movie delete(int id);
}
