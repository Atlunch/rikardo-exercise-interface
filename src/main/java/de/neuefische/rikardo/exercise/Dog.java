package de.neuefische.rikardo.exercise;

public class Dog extends Animal {

    public Dog(String name, boolean alive) {
        super(name, alive);
    }

    @Override
    String move() {
        return "running";
    }

    @Override
    String sneak() {
        return "sneaking";
    }

}
