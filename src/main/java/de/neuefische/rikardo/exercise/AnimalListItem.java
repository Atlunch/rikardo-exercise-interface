package de.neuefische.rikardo.exercise;

public class AnimalListItem {

    private Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
    }

    public void add(Animal animal){
        if (next == null) {
            AnimalListItem nextListItem = new AnimalListItem(animal);
            next = nextListItem;
        } else {
            next.add(animal);
        }
    }

    public AnimalListItem getNext() {
        return next;
    }

    public Animal getValue() {
        return value;
    }

}