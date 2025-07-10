package zoo;

public class Cat extends AnimalRunning {
    static final int maxDist = 200;
    private static int countCats;

    public Cat(int id, String name) {
        super(id, name);
        countCats++;
    }
    public void totalNumberAnimals(){
        System.out.println("Всего животных " + Animal.getCountGlobal());
    }

    public static int getCountCats() {
        return countCats;
    }

    public static void totalNumberCats(){
        System.out.println("Всего котов " + getCountCats());
    }

    public void run(int distance) {
        if (distance <= maxDist) {
            System.out.println("Cat " + this.getName() + " is running  " + distance +" miter");
        } else {
            System.out.println("Cat " + this.getName() + " tried to run  " + distance + " miter, but failed");
        }

    }
}
