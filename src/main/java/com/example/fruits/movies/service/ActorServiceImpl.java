package com.example.fruits.movies.service;


import com.example.fruits.movies.dao.ActorRepository;
import com.example.fruits.movies.entity.Actor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorServiceImpl implements ActorService{

   private ActorRepository actorRepository;

    @Autowired
    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public List<Actor> findAll() {

       return actorRepository.findAll();
    }

    @Override
    public Actor findById(int id) {
        Optional<Actor> optionalActor = actorRepository.findById(id);
        if(optionalActor.isPresent()){

            return optionalActor.get();

        } else {

            throw  new RuntimeException("There is no actor with the given id");
        }

    }

    @Override
    public Actor save(Actor actor) {
 return  actorRepository.save(actor);
    }

    @Override
    public Actor delete(int id) {
       Actor deletedActor = findById(id);
       actorRepository.delete(deletedActor);
        return deletedActor;
    }
}
