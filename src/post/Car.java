package post;

public class Car {

    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startFuelSystem() {
        System.out.println("The method was called startFuelSystem");
    }

    private void startCommand() {
        System.out.println("The method was called startCommand");
    }

    private void startElectricity() {
        System.out.println("The method was called startElectricity");
    }

}
