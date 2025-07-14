package zoo;

public class Dog extends AnimalSwimming{
    static final int maxDistSwim = 10;
    static final int maxDistRun = 500;
    private static int countDogs;

    public Dog(int id, String name) {
        super(id, name);
        countDogs++;
    }
    public void totalNumberAnimals(){
        System.out.println("Всего животных " + Animal.getCountGlobal());
    }

    public static int getCountDogs() {
        return countDogs;
    }
    public static void totalNumberDogs(){
        System.out.println("Всего собак " + getCountDogs());
    }

    public void swim(int distance) {
        if (distance <= maxDistSwim) {
            System.out.println("Dog " + this.getName() + " is swimming  " + distance +" miter");
        } else {
            System.out.println("Dog " + this.getName() + " tried to swim  " + distance + " miter, but failed");
        }
    }

    public void run(int distance) {
        if (distance <= maxDistRun) {
            System.out.println("Dog " + this.getName() + " is running  " + distance +" miter");
        } else {
            System.out.println("Dog " + this.getName() + " tried to run  " + distance + " miter, but failed");
        }
    }



}
