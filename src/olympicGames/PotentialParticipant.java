package olympicGames;

public abstract class PotentialParticipant {
    private String name;
    private int number;
    private double maxRunLength;
    private double maxJumpHeight;

    public PotentialParticipant(String name, int number  ,double maxRunLength, double maxJumpHeight) {
        this.name = name;
        this.number = number;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getMaxRunLength() {
        return maxRunLength;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }
}
