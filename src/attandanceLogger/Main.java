package attandanceLogger;


import java.util.Map;

public class Main {
    public static void main(String[] args) {
        VisitorLogger visitorLogger = new VisitorLogger();


        visitorLogger.addVisitor("user1", "08:15");
        visitorLogger.addVisitor("user2", "08:00");
        visitorLogger.addVisitor("user1", "09:45");
        visitorLogger.addVisitor("user3", "08:30");
        visitorLogger.addVisitor("user2", "10:20");
        visitorLogger.addVisitor("user4", "14:10");
        visitorLogger.addVisitor("user1", "08:55");
        visitorLogger.addVisitor("user2", "10:45");
        visitorLogger.addVisitor("user4", "14:25");
        visitorLogger.addVisitor("user3", "11:50");
        visitorLogger.addVisitor("user5", "15:00");
        visitorLogger.addVisitor("user1", "16:30");
        visitorLogger.addVisitor("user3", "11:59");

        visitorLogger.toStringLogs();

        Map<String,Integer> statistics =  visitorLogger.frequencyOfVisits();
        System.out.println("frequency of visits");
        statistics.entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));


        System.out.println(visitorLogger.popularTimeToVisitOffice());


    }


}
