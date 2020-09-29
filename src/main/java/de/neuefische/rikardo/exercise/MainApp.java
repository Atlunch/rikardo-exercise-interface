package de.neuefische.rikardo.exercise;

public class MainApp {
    public static void main(String[] args) {


        Cat cat1 = new Cat("Gudrun die Katze", true);

        Dog dog1 = new Dog("Dogtor Schiwago", true);

        System.out.println(cat1.isAlive());
        System.out.println(dog1.isAlive());


        System.out.println(cat1.move());
        System.out.println(cat1.sneak());




    }

}
