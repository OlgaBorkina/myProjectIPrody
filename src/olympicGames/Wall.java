package olympicGames;

public class Wall implements Obstacle {

    private double givenHeight;

    public Wall(double givenHeight) {
        this.givenHeight = givenHeight;
    }

    @Override
    public boolean overcome(Participant p) {
       return p.jump(givenHeight);
    }
}
