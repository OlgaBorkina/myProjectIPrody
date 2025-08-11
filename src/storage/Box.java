package storage;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    private final List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        if(fruits.isEmpty()) {
            fruits.add(fruit);
            return;
        }
        if(fruits.get(0).getClass() != fruit.getClass()) {
            throw new IllegalArgumentException("Fruit is not of type " + this.fruits.getClass());
        }
        fruits.add(fruit);
    }
    public int size() {
        return fruits.size();
    }

    public float getWeight() {
        if(fruits.isEmpty()) {
            return 0;
        }
        return fruits.get(0).getWeight() * fruits.size();
    }

    public void transfer(Box<T> box) {
        if(box == null){
            throw new IllegalArgumentException("Box is null");
        }
        box.fruits.addAll(this.fruits);
    }


    public boolean compare(Box<? extends Fruit> box) {
        return box.getWeight() == this.getWeight();
    }
}
