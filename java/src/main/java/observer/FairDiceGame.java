package observer;

import java.util.Random;

public class FairDiceGame extends DiceGame {
    private final Random random = new Random();

    @Override
    public void play() {
        int diceNumber = random.nextInt(6) + 1;
        System.out.println("주사위 던졌다~~ " + diceNumber);

        for (Player player : playerList) {
            player.update(diceNumber);
        }
    }
}
