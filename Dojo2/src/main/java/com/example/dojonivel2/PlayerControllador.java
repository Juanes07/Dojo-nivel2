package com.example.dojonivel2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/player")
public class PlayerControllador {

    @Autowired
    private PlayerService service;

    @GetMapping("/list")
    public Flux<Player> findallPlayers() {
        return service.listPlayer();
    }

    @GetMapping("/get/{id}")
    public Mono<Player> findByIdPlayer(@PathVariable("id") int id) {
        return service.getByIdPlayer(id);
    }

}
