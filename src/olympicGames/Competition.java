package olympicGames;

public class Competition {
    public static void main(String[] args) {

    Participant[] participants = {
    new Human("Name1", 12, 2000, 2.5 ),
    new Human("Name2", 13, 7000, 1.6 ),
    new Cat("barsik", 45,50,0.5),
    new Robot("JVM1",789,20000,10)
    };


    Obstacle [] obstacles = {
            new Wall(2.2),
            new RunningTrack(1500),
            new RunningTrack(2000),
            new Wall(2)
    };
    start(participants,obstacles);


}
    public static void start(Participant[] participants, Obstacle[] obstacles){
        for (int i = 0; i < participants.length; i++){
            for (int j = 0; j < obstacles.length; j++){
                if(!obstacles[j].overcome(participants[i])){
                    break;
                }
            }
        }



    }
}
