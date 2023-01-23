package com.codecool.robodog.controller;

import com.codecool.robodog.model.Dog;
import com.codecool.robodog.service.DogStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {

    private final DogStorage dogStorage;

    @Autowired
    public DogController(DogStorage dogStorage) {
        this.dogStorage = dogStorage;
    }

    @GetMapping("/")
    public List<Dog> dogList(){
        return dogStorage.getDogs();
    }

    @GetMapping("/random")
    public Dog createRandomDog(){
        return dogStorage.addRandomDog();
    }

    @PostMapping("/add")
    public Dog addDog(@RequestBody Dog dog){
        return dogStorage.addDog(dog);
    }

    @PutMapping("/{name}")
    public Dog updateDog(@PathVariable String name, @RequestBody Dog dog){
        return dogStorage.updateDog(name, dog);
    }

}
