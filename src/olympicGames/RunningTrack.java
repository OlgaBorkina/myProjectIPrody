package olympicGames;

public class RunningTrack implements Obstacle{

    private double givenLength;

    public RunningTrack(double givenLength) {
        this.givenLength = givenLength;
    }

    @Override
    public boolean overcome(Participant p) {
        return p.run(givenLength);
    }
}
