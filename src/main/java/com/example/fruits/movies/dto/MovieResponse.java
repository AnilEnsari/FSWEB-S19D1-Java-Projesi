package com.example.fruits.movies.dto;

import java.util.List;

public record MovieResponse(String name, String directorName, Double rating, List<ActorResponse> actors) {


}
