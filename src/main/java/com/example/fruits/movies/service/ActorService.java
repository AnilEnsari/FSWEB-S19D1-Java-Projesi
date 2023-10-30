package com.example.fruits.movies.service;

import com.example.fruits.movies.entity.Actor;

import java.util.List;

public interface ActorService {

    List<Actor> findAll();

    Actor findById(int id);

    Actor save(Actor actor);

    Actor delete(int id);
}
