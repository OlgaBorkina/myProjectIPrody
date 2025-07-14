package zoo;

public abstract class Animal {

    private final int id;
    private final String name;
    private static int countGlobal = 0;


    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
        ++countGlobal;

    }
    public static int getCountGlobal(){
        return countGlobal;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
