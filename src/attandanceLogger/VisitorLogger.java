package attandanceLogger;

import java.util.*;

public class VisitorLogger {
    List<Visitor> visitors;

    public VisitorLogger() {
        visitors = new ArrayList<>();
    }
    public void addVisitor(String user_id, String timeStamp) {
        visitors.add(new Visitor(user_id, timeStamp));
    }

    public Map<String,Integer> frequencyOfVisits(){
        Map<String,Integer> frequencyLog = new HashMap<>();
        for(Visitor v : visitors){
            frequencyLog.put(v.getUser_id(), frequencyLog.getOrDefault(v.getUser_id(), 0) + 1);
        }
        return frequencyLog;
    }

    public String popularTimeToVisitOffice(){
        Map<String,Integer> popularTime = new HashMap<>();
        for(Visitor v : visitors){
            String strTime = v.getTimeStamp();
            String[] parts = strTime.split(":");
            String hour = parts[0];
            popularTime.put(hour,popularTime.getOrDefault(hour,0) + 1);
        }
        Collection<Integer> listTime = popularTime.values();
        Integer temp = 0;
        for(Integer i : listTime){
            if(i> temp){
                temp = i;
            }
        }
        String popTime = null;
         for(Map.Entry<String,Integer> entry : popularTime.entrySet()){
             if(entry.getValue().equals(temp)){
                 popTime =  entry.getKey();
             }
         }
        return popTime + ":00 (" + temp + " visits)";

    }


    public void toStringLogs() {
        for(Visitor v : visitors) {
            System.out.println(v.toString());
        }
    }




}
