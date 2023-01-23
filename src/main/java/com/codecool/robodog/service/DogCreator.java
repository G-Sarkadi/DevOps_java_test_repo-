package com.codecool.robodog.service;

import com.codecool.robodog.model.Breed;
import com.codecool.robodog.model.Dog;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class DogCreator {

    private static List<String> names = Arrays.asList("Bobby", "Lucy", "Rex", "Milo", "Buddy", "Daisy");

    public Dog createRandomDog(){
        Dog dog = new Dog();
        Random random = new Random();
        dog.setAge(random.nextInt(15));
        dog.setBreed(Breed.values()[random.nextInt(Breed.values().length)]);
        dog.setName(names.get(random.nextInt(names.size())));
        return dog;
    }
}
