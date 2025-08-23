package myStream.boyscout;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Camp camp = new Camp();

        camp.addBoyscout(new Boyscout("Oleg", 14, Team.RED));
        camp.addBoyscout(new Boyscout("Benedikt", 12, Team.BLUE));
        camp.addBoyscout(new Boyscout("Kris", 15, Team.RED));
        camp.addBoyscout(new Boyscout("David", 11, Team.BLUE));
        camp.addBoyscout(new Boyscout("Alex", 13, Team.GREEN));
        camp.addBoyscout(new Boyscout("Finish", 14, Team.GREEN));

        Map<Team, List<Boyscout>> grouped = camp.split();

        grouped.forEach((team, scouts) -> {
            System.out.println(team + ": " + scouts);
        });
    }
}