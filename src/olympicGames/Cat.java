package olympicGames;

public class Cat extends PotentialParticipant implements Participant{


    public Cat(String name, int number, double maxRunLength, double maxJumpHeight) {
        super(name, number, maxRunLength, maxJumpHeight);
    }

    @Override
    public boolean run(double runLength) {
        if(this.getMaxRunLength() >= runLength) {
            System.out.println("Cat " + this.getName() +" with number " + this.getNumber() + " overcame the running track of " + runLength + " meters.");
            return true;
        }else{
            System.out.println("Cat " + this.getName() +" with number " + this.getNumber() + " failed to overcome the running track of " + runLength + " meters");
            return false;
        }
    }

    @Override
    public boolean jump(double jumpHeight) {
        if( this.getMaxJumpHeight() >= jumpHeight) {
            System.out.println("Cat " + this.getName() +" with number " + this.getNumber() + " jumped over the wall of " + jumpHeight + " meters.");
            return true;
        }else{
            System.out.println("Cat " + this.getName() +" with number " + this.getNumber() + " failed to jump over the wall of " + jumpHeight + " meters.");
            return false;
        }
    }
}
