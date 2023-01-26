package state;

public class Player {
    private int speed;
    private State state = new StandUpState(this);

    public int getSpeed() {
        return speed;
    }

    public State getState() {
        return state;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void talk(String msg) {
        System.out.println("플레이어의 말: \"" + msg + "\"");
    }
}
