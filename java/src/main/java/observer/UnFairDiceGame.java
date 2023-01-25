package observer;

import java.util.Random;

public class UnFairDiceGame extends DiceGame {
    private int diceNumber;

    public UnFairDiceGame(int diceNumber) {
        this.diceNumber = diceNumber;
    }

    @Override
    public void play() {
        System.out.println("주사위 던졌다~~ " + diceNumber);
        for (Player player : playerList) {
            player.update(diceNumber);
        }
    }
}
