package zoo;

public abstract class Animal {
    private final int id;
    private final String name;


    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
