package com.codecool.robodog.service;

import com.codecool.robodog.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DogStorage {

    private final DogCreator dogCreator;

    private List<Dog> dogs = new ArrayList<>();

    @Autowired
    public DogStorage(DogCreator dogCreator) {
        this.dogCreator = dogCreator;
    }

    public Dog addRandomDog(){
        Dog randomDog = dogCreator.createRandomDog();
        this.dogs.add(randomDog);
        return randomDog;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public Dog addDog(@RequestBody Dog dog) {
        this.dogs.add(dog);
        return dog;
    }

    public Dog updateDog(String name, Dog dog){
        Dog foundDog = this.dogs.stream()
                .filter(dog1 -> dog1.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No such dog found!"));
        foundDog.setAge(dog.getAge());
        foundDog.setBreed(dog.getBreed());
        return foundDog;
    }
}
