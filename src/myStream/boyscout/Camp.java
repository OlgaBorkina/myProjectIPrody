package myStream.boyscout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Camp {
    private List<Boyscout> boyscouts = new ArrayList<>();


    public void addBoyscout(Boyscout boy) {
        boyscouts.add(boy);
    }

    public Map<Team, List<Boyscout>> split() {
        Map<Team, List<Boyscout>> grouped = boyscouts.stream()
                .collect(Collectors.groupingBy(Boyscout::getTeam));

        for (List<Boyscout> teamList : grouped.values()) {
            teamList.sort(Comparator.comparingInt(Boyscout::getAge).reversed());
        }
        return grouped;
    }
}
