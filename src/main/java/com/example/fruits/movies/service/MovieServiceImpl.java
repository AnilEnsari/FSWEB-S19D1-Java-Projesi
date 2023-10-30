package com.example.fruits.movies.service;

import com.example.fruits.movies.dao.MovieRepository;
import com.example.fruits.movies.entity.Actor;
import com.example.fruits.movies.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

   private MovieRepository movieRepository ;

   @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findById(int id) {
        Optional<Movie> optionalMovie = movieRepository.findById(id);
        if(optionalMovie.isPresent()){

            return optionalMovie.get();

        } else {

            throw  new RuntimeException("There is no movie with the given id");
        }

    }

    @Override
    public Movie save(Movie movie) {
        return  movieRepository.save(movie);
    }

    @Override
    public Movie delete(int id) {
        Movie deledtedMovie = findById(id);
       movieRepository.delete(deledtedMovie);

       return deledtedMovie;
    }
}
