package com.example.fruits.movies.service;

import com.example.fruits.movies.dao.MovieRepository;
import com.example.fruits.movies.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieImpl implements MovieService {

   private MovieRepository movieRepository ;

   @Autowired
    public MovieImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAll() {
        return null;
    }

    @Override
    public Movie findById(int id) {
        return null;
    }

    @Override
    public Movie save(Movie movie) {
        return null;
    }

    @Override
    public Movie delete(int id) {
        return null;
    }
}
