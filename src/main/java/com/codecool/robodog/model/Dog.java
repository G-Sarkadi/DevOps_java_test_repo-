package com.codecool.robodog.model;

public class Dog {

    private Breed breed;
    private String name;
    private int age;

    public Dog(Breed breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    public Breed getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
