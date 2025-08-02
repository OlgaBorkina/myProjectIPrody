package attandanceLogger;

public class Visitor {
    String userId;
    String timeStamp;


    public Visitor(String userId, String timeStamp) {
        this.userId = userId;
        this.timeStamp = timeStamp;
    }
    public String getUser_id() {
        return userId;
    }
    public String getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        return userId + "-> " + timeStamp;
    }
}
