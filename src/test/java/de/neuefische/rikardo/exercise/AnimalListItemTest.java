package de.neuefische.rikardo.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListItemTest {

    @Test
    void testAdd() {
        //GIVEN
        Cat cat1 = new Cat("Gudrun die Katze", true);
        Cat cat2 = new Cat("Peter", true);
        Dog dog1 = new Dog("Dogtor Schiwago", true);

        AnimalListItem firstListItem = new AnimalListItem(cat1);

        //WHEN

        firstListItem.add(cat2);


        //THEN
        assertNotNull(firstListItem.getNext());
    }


    @Test
    void testAddNotNull() {
        //GIVEN
        Cat cat1 = new Cat("Gudrun die Katze", true);
        Cat cat2 = new Cat("Peter", true);
        Dog dog1 = new Dog("Dogtor Schiwago", true);

        AnimalListItem firstListItem = new AnimalListItem(cat1);
        AnimalListItem secondListItem = new AnimalListItem(cat2);
        AnimalListItem thirdListItem = new AnimalListItem(dog1);

        //WHEN

        firstListItem.add(secondListItem.getValue());
        secondListItem.add(thirdListItem.getValue());

        //THEN
        assertNotNull(secondListItem.getNext());
    }

    @Test
    void testAddNull() {
        //GIVEN
        Cat cat1 = new Cat("Gudrun die Katze", true);
        Cat cat2 = new Cat("Peter", true);
        Dog dog1 = new Dog("Dogtor Schiwago", true);

        AnimalListItem firstListItem = new AnimalListItem(cat1);
        AnimalListItem secondListItem = new AnimalListItem(cat2);
        AnimalListItem thirdListItem = new AnimalListItem(dog1);

        //WHEN

        firstListItem.add(secondListItem.getValue());
        secondListItem.add(thirdListItem.getValue());

        //THEN
        assertNull(thirdListItem.getNext());
    }

}