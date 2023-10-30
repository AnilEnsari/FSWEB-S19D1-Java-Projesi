package com.example.fruits.movies.dao;

import com.example.fruits.movies.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor,Integer> {
}
