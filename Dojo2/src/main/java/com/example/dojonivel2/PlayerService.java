package com.example.dojonivel2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class PlayerService {
    @Autowired
    private PlayerRepository repository;


    public Flux<Player> listPlayer() {
        return repository.findAll();

    }

    public Mono<Player> getByIdPlayer(int id){
        return repository.findById(id);
    }


}
