package de.neuefische.rikardo.exercise;

public class Cat extends Animal {


    public Cat(String name, boolean alive) {
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
