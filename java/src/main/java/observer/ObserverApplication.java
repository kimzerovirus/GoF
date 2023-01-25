package observer;

public class ObserverApplication {

    public static void main(String[] args) {
        DiceGame fairGame = new FairDiceGame();
        DiceGame unFairGame = new UnFairDiceGame(3);

        var player1 = new EvenBettingPlayer("플레이어1");
        var player2 = new OddBettingPlayer("플레이어2");
        var player3 = new EvenBettingPlayer("플레이어3");

        fairGame.addPlayer(player1);
        fairGame.addPlayer(player2);
        fairGame.addPlayer(player3);

        unFairGame.addPlayer(player1);
        unFairGame.addPlayer(player2);
        unFairGame.addPlayer(player3);

        for (int i = 0; i < 5; i++) {
            fairGame.play();
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            unFairGame.play();
            System.out.println();
        }
    }
}
