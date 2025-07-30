package attandanceLogger;

public class Visitor {
    String user_id;
    String timeStamp;


    public Visitor(String user_id, String timeStamp) {
        this.user_id = user_id;
        this.timeStamp = timeStamp;
    }
    public String getUser_id() {
        return user_id;
    }
    public String getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        return user_id + "-> " + timeStamp;
    }
}
