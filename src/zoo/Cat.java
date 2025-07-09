package zoo;

public class Cat extends AnimalRunning {
    static final int maxDist = 200;


    public Cat(int id, String name) {
        super(id, name);
    }


    public void run(int distance) {
        if (distance <= maxDist) {
            System.out.println("Cat " + this.getName() + " is running  " + distance +" miter");
        } else {
            System.out.println("Cat " + this.getName() + " tried to run  " + distance + " miter, but failed");
        }

    }
}
