package attandanceLogger;

import java.util.*;

public class VisitorLogger {
    List<Visitor> visitors;
    Map<String,Integer> hourStats = new HashMap<>();

    public VisitorLogger() {
        visitors = new ArrayList<>();
    }
    public void addVisitor(String user_id, String timeStamp) {
        Visitor visitor = new Visitor(user_id,timeStamp);
        visitors.add(visitor);

        String hour = visitor.getTimeStamp().split(":")[0];
        hourStats.put(hour, hourStats.getOrDefault(hour, 0) + 1);
    }

    public Map<String,Integer> frequencyOfVisits(){
        Map<String,Integer> frequencyLog = new HashMap<>();
        for(Visitor v : visitors){
            frequencyLog.put(v.getUser_id(), frequencyLog.getOrDefault(v.getUser_id(), 0) + 1);
        }
        return frequencyLog;
    }

    public String popularTimeToVisitOffice(){
        String popularHour = null;
        int max = 0;

        for (Map.Entry<String, Integer> entry : hourStats.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                popularHour = entry.getKey();
            }
        }
        return popularHour + ":00 ";

    }


    public void toStringLogs() {
        for(Visitor v : visitors) {
            System.out.println(v.toString());
        }
    }




}
