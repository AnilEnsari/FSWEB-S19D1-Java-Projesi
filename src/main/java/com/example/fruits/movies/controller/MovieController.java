package com.example.fruits.movies.controller;


import com.example.fruits.movies.dto.MovieResponse;
import com.example.fruits.movies.entity.Actor;
import com.example.fruits.movies.entity.Movie;
import com.example.fruits.movies.service.ActorService;
import com.example.fruits.movies.service.MovieService;
import com.example.fruits.movies.utils.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private MovieService movieService;
    private ActorService actorService;


    @Autowired
    public MovieController(MovieService movieService, ActorService actorService) {
        this.movieService = movieService;
        this.actorService = actorService;
    }


    @GetMapping("/{id}")
    public MovieResponse find(@PathVariable int id) {
        return Converter.movieConverter(movieService.findById(id));

    }

    @GetMapping("/")
    public List<MovieResponse> findAll() {

        return Converter.movieListConverter(movieService.findAll());
    }

    @PostMapping("/")
    public MovieResponse add(Movie movie, Actor actor) {
        movie.addActor(actor);
        actor.addMovie(movie);
        movieService.save(movie);
        actorService.save(actor);

        return Converter.movieConverter(movie);
    }

    @DeleteMapping("/{id}")
    public MovieResponse delete(int id) {
        Movie deletedMovie = movieService.findById(id);
        movieService.delete(id);

        return Converter.movieConverter(deletedMovie);
    }


}
