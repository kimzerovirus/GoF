package observer;

public class OddBettingPlayer extends Player {
    public OddBettingPlayer(String name) {
        super(name);
    }

    @Override
    public void update(int diceNumber) {
        if (diceNumber % 2 == 1) {
            System.out.println(getName() + "님이 승리 하였습니다!");
        }
    }
}
