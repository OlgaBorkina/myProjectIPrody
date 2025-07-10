package zoo;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat(123,"Vasiliy");
        Cat cat2 = new Cat(456,"Garfild");
        Cat cat3 = new Cat(789,"Tom");

        cat1.run(200);
        cat2.run(201);
        cat1.totalNumberAnimals();

        Dog dog1 = new Dog(231,"Sharik");
        Dog dog2 = new Dog(564,"Mopsik");

        dog1.run(501);
        dog2.run(100);

        dog1.swim(10);
        dog2.swim(1);

        dog1.totalNumberAnimals();
        Cat.totalNumberCats();
        Dog.totalNumberDogs();
    }
}
