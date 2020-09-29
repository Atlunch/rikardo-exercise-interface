package de.neuefische.rikardo.exercise;

public abstract class Animal {


    private String name;
    private boolean alive;

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public Animal(String name, boolean alive) {
        this.name = name;
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    abstract String move();

    abstract String sneak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

